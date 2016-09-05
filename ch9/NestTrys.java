// Use a nested try block.
class NestTrys {
	public static void main(String args[]) {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		try { // outer try
			for(int i = 0; i < numer.length; i++) {
				try { // nested try
					System.out.println(numer[i] + " / " + denom[i] + " is " +  numer[i]/denom[i]);
				} catch (ArithmeticException e) {
					// Catch the exception
					System.out.println("Can't divide by zero!");
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// Catch the exception
			System.out.println("No matching elemnt found.");

		}
	}
}
