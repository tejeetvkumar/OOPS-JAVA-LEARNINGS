public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 550.0, "ISBN003");

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);

        book.setPrice(600.0);
        book.setIsbn("ISBN004");

        System.out.println("Updated price: " + book.getPrice());
        System.out.println("Updated ISBN: " + book.getIsbn());
    }
}
