public class Box<T, U> {
    //Reusable for all sorts of things
    T item;
    U price;

    Box(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }
}