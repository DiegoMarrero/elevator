public class Person {

    // Variables
    private final int ID; // person's unique ID #
    private static int personCount; // total number of people

    // Constructor
    public Person() {
        this.ID = ++this.personCount;

        System.out.println("Person " + this.ID + " constructed");
    }

    // return ID
    public int getID() {
        return this.ID;
    }

    // Person walks onto a floor
    public void stepOntoFloor(Floor floor) {

        // Notify floor person is coming
        floor.personArrives(this);

        // Press button floor
        System.out.println("Person " + this.ID + " presses floor button on floor " + floor.getNumber());
        floor.floorButton.pressButton();
    }

    // Person enters elevator
    public void enterElevator(Floor floor, Elevator elevator) {

        floor.personBoardingElevator(); // Person leaves floor

        elevator.passengerEnters(this); // Person enters elevator

        System.out.println("Person " + this.ID + " presses elevator buttton");
        elevator.elevatorButton.pressButton();
    }

    // Person exits elevator
    public void exitElevator(Floor floor, Elevator elevator) {

        System.out.println("Person " + this.ID + " exits elevator on floor" + floor.getNumber());
        elevator.passengerExits();
    }
}