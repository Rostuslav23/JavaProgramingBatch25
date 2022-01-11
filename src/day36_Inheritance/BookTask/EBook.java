package day36_Inheritance.BookTask;

public class EBook extends Book {

    public double size;
    public int pages;

    public void setInfo(String title, String type, String author, double price,double size, int pages) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.size = size;
        this.pages = pages;
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }

    public void readBook(){
        System.out.println("I'm reading "+title+" book");
    }
}
/*
Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */
