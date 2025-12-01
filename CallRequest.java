package proje5;

public class CallRequest {
    private final int floorNumber;
    private final Direction direction;

    public CallRequest(int floorNumber, Direction direction) {
        this.floorNumber = floorNumber;
        this.direction = direction;
    }

    public int getFloorNumber() { return floorNumber; }
    public Direction getDirection() { return direction; }

    @Override
    public String toString() {
        return "Call[" + floorNumber + "," + direction + "]";
    }
}