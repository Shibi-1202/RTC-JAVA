import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    private int numCopies;

    public void getBookDetailsFromUser(Scanner inp) {
        System.out.print("Enter book title: ");
        title = inp.nextLine();
        System.out.print("Enter book author: ");
        author = inp.nextLine();
        System.out.print("Enter book price: ");
        price = inp.nextDouble();
        System.out.print("Enter number of copies: ");
        numCopies = inp.nextInt();
        inp.nextLine();
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of copies: " + numCopies);
    }
}

public class BookStore {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = inp.nextInt();
        inp.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = new Book();
            books[i].getBookDetailsFromUser(inp);
        }

        System.out.println("\nDetails of all books entered:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }
}
