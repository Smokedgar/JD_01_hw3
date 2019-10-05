package by.htp.hw3.task9;
import java.util.Arrays;

public class BookAgr {
	private Book[] BookAgr;
	private int BookAgrCount;
	
	public BookAgr(int number) {
		BookAgr = new Book[number];
		BookAgrCount = 0;
	}
	
	public void add(Book newBook) {	
		BookAgr[BookAgrCount] = newBook;
		BookAgrCount++;
	}
	
	public Book[] getBookAgr() {
		return BookAgr;
	}
	public void setBookAgr(Book[] BookAgr) {
		this.BookAgr = BookAgr;
	}

	@Override
	public String toString() {
		return "BookAgr [BookAgr=" + Arrays.toString(BookAgr) + ", BookAgrCount=" + BookAgrCount + "]";
	}

}
