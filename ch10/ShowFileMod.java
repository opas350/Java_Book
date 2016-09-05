/* This variation wraps the code that opens and accesses the file within a 
 * single try block.
 * The file is closed by the finally block.
 */
import java.io.*;

class ShowFileMod {
	public static void main(String args[]) {
		int i;
		FileInputStream fin = null;

		// First,confirm that a file name has been specified.
		if(args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}

		// The following code opens a file, reads characters until
		// EOF is encontered, and then closes the file via a
		// finally block.
		try {
			fin = new FileInputStream(args[0]);

			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while (i != -1);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		} catch (IOException e) {
			System.out.println("An I/O Error Ocurred");
		} finally {
			// Close file in all cases.
			try {
				if (fin != null) fin.close();
			} catch (IOException e) {
				System.out.println("Eror Closing File");
			}
		}
	}
}
