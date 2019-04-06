public class Door {

	private boolean open;

	// constructor
	public Door() {

		open = false; // initialize open to false

		System.out.println("door constructed");
	}// end Door constructor

	// open the door
	public void openDoor(Person passengerPtr, Person nextPassengerPtr, Floor currentFloor, Elevator elevator) {
		if (!open) { // if door is not open, open door
			open = true;

			System.out.println("elevator opens its door on floor" + currentFloor.getNumber());

			// if passenger is in elevator, tell person to leave
			if (passengerPtr != null) {
				passengerPtr.exitElevator(currentFloor, elevator);
			} // end if

			// if passenger waiting to enter elevator
			// tell passenger to enter
			if (nextPassengerPtr != null) {
				nextPassengerPtr.enterElevator(elevator, currentFloor);
			}
		} // end outer if
	}// end function openDoor

	// close the door
	public void closeDoor(Floor currentFloor) {
		if (open) { // if door is open, close door
			open = false;
			System.out.println("elevator closes its door on floor" + currentFloor.getNumber());
		} // end if

	}// end function closeDoor

}
