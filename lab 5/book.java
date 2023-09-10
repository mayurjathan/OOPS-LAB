
/*Write a program to define a class called Book with title,author and edition fields.
Define suitable constructors for the Book class. Create a list of 6 Book objects in
ascending order. Display only those books’ details written by an author taken as an
user input. */
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int edition;

    Book() {
    }

    Book(String title, String author, int edition) {
        this.title = new String(title);
        this.author = new String(author);
        this.edition = edition;
    }

    Book(String title) {
        this(title, null, 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    void readBook() {
        var scan = new Scanner(System.in);
        System.out.println("Enter Title: ");
        this.title = scan.nextLine();
        System.out.println("Enter Author: ");
        this.author = scan.nextLine();
        System.out.println("Enter Edition: ");
        this.edition = scan.nextInt();
    }

    void display() {
        if (title != null) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Edition: " + edition);
        }
    }

}
 class BookDemo {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        Book[] books = new Book[6];
        for (int i = 0; i < 6; i++) {
            books[i] = new Book();
        }
        System.out.println("Enter Number of Books(<6): ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            books[i].readBook();
        }

        for (int i = 0; i < 6; i++) {
            books[i].display();
        }
    }
}