/* 
 * Add a parameterized method that computes the 
 * fuel required for a given distance.
 *
 */
class Vehicle {
	int passengers;  // number of passangers
	int fuelcap;	 // fuel capacity in gallons
	int mpg;	 // fuel consumption in miles per gallon

	// This is a constructor for Vehicle.
	Vehicle (int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Return the range.
	int range() {
		return mpg * fuelcap;
	}

	// Compute fuel needed for a given distance.
	double fuelneeded(int miles){
		return (double) miles / mpg;
	}
}

class VehConsDemo {
	public static void main(String args[]) {

		// construct complete vehicles
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// asign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelneeded(dist);

		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportscar.fuelneeded(dist);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel." );

	}
}
