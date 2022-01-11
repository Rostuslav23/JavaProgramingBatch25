package day36_Inheritance.BookTask;

public class BookObject {
    public static void main(String[] args) {

        EBook eBook = new EBook();
        eBook.setInfo("War and Peace","Classic","Lev Tolstoi",23.33,400.2,340);
        eBook.readBook();
        System.out.println(eBook);

        AudioBook audioBook = new AudioBook();
        audioBook.setInfo("Harry Potter","Fantastic","J.K. Rolling",20.40,"8 hours 2 minetus","Jake");
        audioBook.listen();
        System.out.println(audioBook);


    }
}
