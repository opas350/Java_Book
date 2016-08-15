//Using break to exit a loop.
class BreakDemo {
	public static void main(String args[]) {
		int num;

		num = 100;
		
		// Loop while i-squared is less than sum
		for (int i = 0; i < num; i++){
			if( i*i >= num) break; //terminate loop if i*i >= 100
			System.out.print(i + " ");
		}
		System.out.println("Loop Complete.");
	}
}
