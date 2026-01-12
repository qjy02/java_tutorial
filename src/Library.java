public class Library {
    String name;
    int year;
    Book[] books;

    Library(String a, int b, Book[] books) {
        this.name = a;
        this.year = b;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(Book book: books) {
            System.out.println(book.displayInfo());
        }
    }
}
