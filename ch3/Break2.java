// Read input until a q is received.
class Break2 {
	public static void main(String args[]) 
		throws java.io.IOException {

		char ch;

		System.out.println("Press 'q' to continue");

		for( ; ; ) {
			ch = (char) System.in.read(); // Get char
			if(ch == 'q') break;
		}
		System.out.println("You pressed q!");
	}
}
