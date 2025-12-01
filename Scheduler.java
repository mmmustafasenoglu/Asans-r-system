package proje5;

import java.util.*;

public class Scheduler {
    public Elevator assign(List<Elevator> elevators, CallRequest req) {
        Elevator best = elevators.get(0);
        int bestDist = Math.abs(best.getCurrentFloor() - req.getFloorNumber());

        for (Elevator e : elevators) {
            int dist = Math.abs(e.getCurrentFloor() - req.getFloorNumber());
            if (dist < bestDist) {
                best = e;
                bestDist = dist;
            }
        }
        return best;
    }
}