package OOP;
//CONSTRUCTORS PROGRAM (FOR UNDERSTANDING)
class Book {
    String book;
    String author;

    Book(String b, String a)
    {
        book=b;
        author=a;
    }
}
public class Library{
    public static void main(String[] args) {
        Book b1=new Book("Harry Potter series", "J.K.Rowling");
        Book b2=new Book("The Hunger Games","Suzzane Collins");
        System.out.println(b1.book+" books were written by "+b1.author);
        System.out.println(b2.author+" wrote "+b2.book);
    }
}
