package lab6;
import java.util.Scanner;

class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void display() {
        System.out.println("Displaying book publication of author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("Displaying book publication of author: " + super.getAuthorName() + " with title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        System.out.println("Displaying paper publication of author: " + super.getAuthorName() + " with title: " + title);
    }
}

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author name: ");
        String author_name = scanner.nextLine();
        System.out.print("Enter publication title: ");
        String title = scanner.nextLine();
        System.out.print("Enter 1 for book and 2 for paper: ");
        int choice = scanner.nextInt();

        Book b;
        if (choice == 1) {
            b = new BookPublication(author_name, title);
        } else {
            b = new PaperPublication(author_name, title);
        }
        b.display();
    }
}