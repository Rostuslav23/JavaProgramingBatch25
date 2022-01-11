package day36_Inheritance.BookTask;

public class AudioBook extends Book {

    public String length, narrator;

    public void setInfo(String title, String type, String author, double price,String length,String narrator) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
        this.length = length;
        this.narrator = narrator;

    }

    public String toString() {
        return "AudioBook{" +
                "length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void listen(){
        System.out.println("I'm listening a book"+ title);
    }
}
/*
Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */
