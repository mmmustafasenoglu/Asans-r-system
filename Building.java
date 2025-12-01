package proje5;

import java.util.*;

public class Building {
    private List<Floor> floors;
    private List<Elevator> elevators;
    private Scheduler scheduler;

    public Building(int floorCount, int elevatorCount) {
        floors = new ArrayList<>();
        for (int i = 0; i < floorCount; i++) floors.add(new Floor(i));

        elevators = new ArrayList<>();
        for (int i = 0; i < elevatorCount; i++) elevators.add(new Elevator(i));

        scheduler = new Scheduler();
    }

    public void requestElevator(CallRequest request) {
        Elevator e = scheduler.assign(elevators, request);
        e.selectTarget(request.getFloorNumber());
        System.out.println("Assigned elevator " + e.getId() + " to " + request);
    }

    public void step() {
        for (Elevator e : elevators) e.step();
    }
}