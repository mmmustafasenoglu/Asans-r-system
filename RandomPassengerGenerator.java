package proje5;

import java.util.Random;

;

	public class RandomPassengerGenerator {
	    private Random rng = new Random();
	    private int floorCount;

	    public RandomPassengerGenerator(int floorCount) {
	        this.floorCount = floorCount;
	    }

	    public Passenger generatePassenger(int id) {
	        int start = rng.nextInt(floorCount);
	        int dest;
	        do { dest = rng.nextInt(floorCount); } while (dest == start);
	        return new Passenger(id, start, dest);
	    }
	}


