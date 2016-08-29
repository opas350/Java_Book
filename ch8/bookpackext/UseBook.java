// Demostrate import.
package bookpackext;
import bookpack.*;

// Use the Book class from bookpack.
class UseBook {
	public static void main(String args[]) {
		Book books[] = new Book[5];

		books[0] = new Book("book0","author0", 2014);
		books[1] = new Book("book1", "author1", 2014);
		books[2] = new Book("book2", "author2", 2014);
		books[3] = new Book("book3", "author3", 2014);
		books[4] = new Book("book4", "author3", 2014);
