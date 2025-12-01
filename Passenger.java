package proje5;

public class Passenger {
    private final int id;
    private final int startFloor;
    private final int destinationFloor;

    public Passenger(int id, int startFloor, int destinationFloor) {
        this.id = id;
        this.startFloor = startFloor;
        this.destinationFloor = destinationFloor;
    }

    public void enterElevator(Elevator e) {
        e.selectTarget(destinationFloor);
        System.out.println("Passenger " + id + " entered elevator " + e.getId());
    }

    public void exitElevator() {
        System.out.println("Passenger " + id + " exited at floor " + destinationFloor);
    }

    public int getStartFloor() { return startFloor; }
    public int getDestinationFloor() { return destinationFloor; }
}