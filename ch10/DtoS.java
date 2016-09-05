// A simple disk-to-screen utility that demostrate a FileReader

import java.io.*;

class DtoS {
	public static void main(String args[]) {
		String s;

		// Create and use a FileReader wrapped in a BufferedReader.
		try (BufferedReader br = new BufferedReader(new FileReader("Test.txt")))
		{
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch(IOException e) {
			System.out.println("I/O Error: " + e);
		}
	}
}
