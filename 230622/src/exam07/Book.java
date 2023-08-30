package exam07;

//CREATE TABLE `book` (
//		  `bookid` int NOT NULL,
//		  `bookname` varchar(40) DEFAULT NULL,
//		  `publisher` varchar(40) DEFAULT NULL,
//		  `price` int DEFAULT NULL,
//		  PRIMARY KEY (`bookid`)
//		) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
public class Book {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	public Book(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", "
					+ "bookname=" + bookname + ", "
					+ "publisher=" + publisher + ", "
					+ "price=" + price
				+ "]";
	}

}
