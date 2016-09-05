// Rethrow an exception.
class Rethrow{
	public static void genException() {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for(int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " is " +  numer[i]/denom[i]);
			} catch (ArithmeticException e) {
				// Catch the exception
				System.out.println("Can't divide by zero!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				// Catch the exception
				System.out.println("No matching elemnt found.");
				throw e; // rethrow the exception.
			}
		}
	}
}

class RethrowDemo {
	public static void main(String args[]) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException e) {
			// recatch exception
			System.out.println("Fatal error - Program Terminated")
				;
		}
	}
}
