package proje5;

public class Floor {
    private final int floorNumber;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public CallRequest pressCallButton(Direction dir) {
        return new CallRequest(floorNumber, dir);
    }

    public int getFloorNumber() { return floorNumber; }
}