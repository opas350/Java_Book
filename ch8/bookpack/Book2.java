// Make the instance in Book protected.
package bookpack;

public class Book2 {
	// these are now protected
	protected String title;
	protected String author;
	protected int pubDate;

	public Book2(String t, String a, int d) {
		title = t;
		author = a;
		pubDate = d;
	}

	public void show() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pubDate);
		System.out.println();
	}
}
