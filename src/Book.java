public class Book {
    String title;
    int pages;

    Book(String a, int b) {
        this.title = a;
        this.pages = b;
    }

    String displayInfo() {
        return this.title + " (" + this.pages + ") pages";
    }
}
