/*
 * Try This 4 - 2
 * Demostrate garbage collection and the finalize() method.
 */

class FDemo {
	int x;

	FDemo(int i) {
		x = i;
	}

	// called when object is recycled
	protected void finalize(){
		System.out.println("Finalizing " + x);
	}

	// generates an object that is immediately destroyed
	void generator (int i) {
		FDemo o = new FDemo(i);
	}
}

class Finalize {
	public static void main(String args[]) {
		int count;

		FDemo ob = new FDemo(0);

		/* Now, generate a large number of objects. At 
		 * some point, garbage collector will occur.
		 * Note: you might need to increase the number
		 * of objects generated in order to force
		 * garbage collection
		 */

		for(count = 1; count < 10000000; count++)
			ob.generator(count);
	}
}