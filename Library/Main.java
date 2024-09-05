package Library;

import Library.Books.Book;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "John Doe", 29.99);
        myBook.displayBookDetails();
    }
}
