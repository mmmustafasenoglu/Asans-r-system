package proje5;


import java.util.*;

public class Elevator {
    private final int id;
    private final int capacity = 6;
    private int currentFloor = 0;
    private Direction direction = Direction.IDLE;
    private Queue<Integer> targetQueue = new LinkedList<>();

    public Elevator(int id) { this.id = id; }

    public void selectTarget(int floor) {
        targetQueue.add(floor);
    }

    public void step() {
        if (targetQueue.isEmpty()) {
            direction = Direction.IDLE;
            return;
        }
        int target = targetQueue.peek();
        if (currentFloor < target) {
            currentFloor++;
            direction = Direction.UP;
        } else if (currentFloor > target) {
            currentFloor--;
            direction = Direction.DOWN;
        } else {
            System.out.println("Elevator " + id + " arrived at floor " + currentFloor);
            targetQueue.poll();
            direction = Direction.IDLE;
        }
    }

    public int getId() { return id; }
    public int getCurrentFloor() { return currentFloor; }
    public Direction getDirection() { return direction; }
}