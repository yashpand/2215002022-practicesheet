package Keyword;

public class Book {

    static String libraryName ="City library morena";

    private final String isbn ;
    private String title;
    private String author;

    public Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    public static void displayLibraryName(){
        System.out.println("LibraryName : "+ libraryName);
    }

    public void displayDetails(){
        System.out.println("TITLE :"+ title);
        System.out.println("AUTHOR :"+ author);
        System.out.println("ISBN :"+ isbn);
    }


    public static void main(String[] args) {

        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        Book b2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra");

        Book.displayLibraryName();
        System.out.println();


        if (b1 instanceof Book){
            b1.displayDetails();
        }
        if (b2 instanceof Book){
            b2.displayDetails();
        }




    }


}
