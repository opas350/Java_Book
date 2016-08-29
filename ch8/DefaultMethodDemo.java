// Implement MyIF.
class MyIFImp implements MyIF {
	// Only getUserID() defined by MyIF needs to be implemented.
	// getAdminID() can be allowed to default.
	public int getUserID() {
		return 100;
	}
}

// Use the default method.
class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIFImp obj = new MyIFImp();

		// Can call getUserID(), because it is explicity
		// implemented by MyIFImp:
		System.out.println("User ID is " + obj.getUserID());

		// Can also call getAdminID(), because of default.
		// implementation:
		System.out.println("Administrator ID is " + obj.getAdminID());
	}
}
