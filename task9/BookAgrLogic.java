package by.htp.hw3.task9;
import java.util.ArrayList;
import java.util.List;

public class BookAgrLogic {
	public static List<Book> takeBookAgr(BookAgr customers) {
		Book[] cust = customers.getBookAgr();
		List<Book> result = new ArrayList<Book>();
		for (Book st : cust) {
			result.add(st);
		}
		return result;
	}

	public static List<Book> findAuthor(BookAgr BookAgr, String author) {
		Book[] books = BookAgr.getBookAgr();
		List<Book> resultAuthor = new ArrayList<Book>();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().compareTo(author) == 0) {
				resultAuthor.add(books[i]);
			}
		}
		return resultAuthor;
	}

	public static List<Book> findIzd(BookAgr BookAgr, String izd) {
		Book[] books = BookAgr.getBookAgr();
		List<Book> resultIzd = new ArrayList<Book>();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublishHouse().compareTo(izd) == 0) {
				resultIzd.add(books[i]);
			}
		}
		return resultIzd;
	}

	public static List<Book> findAfter(BookAgr BookAgr, int god) {
		Book[] books = BookAgr.getBookAgr();
		List<Book> resultGod = new ArrayList<Book>();
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublication() > god) {
				resultGod.add(books[i]);
			}
		}
		return resultGod;
	}
}

