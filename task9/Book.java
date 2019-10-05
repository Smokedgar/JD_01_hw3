package by.htp.hw3.task9;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publishHouse;
	private int publication;
	private int pagesNumb;
	private double price;
	private String typeOfBinding;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishHouse() {
		return publishHouse;
	}

	public void setPublishHouse(String publishHouse) {
		this.publishHouse = publishHouse;
	}

	public int getPublication() {
		return publication;
	}

	public void setPublication(int publication) {
		this.publication = publication;
	}

	public int getPagesNumb() {
		return pagesNumb;
	}

	public void setPagesNumb(int pagesNumb) {
		this.pagesNumb = pagesNumb;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}


	public Book(int id, String name, String author, String publishHouse, int publication, int pagesNumb,
			double price, String typeOfBinding) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishHouse = publishHouse;
		this.publication = publication;
		this.pagesNumb = pagesNumb;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public String toString() {
		return "id = " + id + ", name = " + name + ",author = " + author + ", publishingHouse = " + publishHouse
				+ ", publication = " + publication + ", pagesNumb = " + pagesNumb + ", price= " + price
				+ ", typeOfBinding = " + typeOfBinding;
	}

}
