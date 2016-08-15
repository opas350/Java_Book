// Add range to Vehicle.

class Vehicle {
	int passengers;	// number of passengers
	int fuelcap;	// fuel capacity in gallons
	int mpg;	// fuel consumption in miles per gallon

	// Display the range.
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}

class AddMeth {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 14;
		minivan.mpg = 12;

		System.out.println("Minivan can carry " + minivan.passengers + ". ");
		minivan.range(); // display range of minivan

		System.out.println("Sportscar can carry " + sportscar.passengers + ". ");
		sportscar.range(); // display range of sportscar
	}
}
