public class Idol extends Person {
    int position;

    Idol(String first, String last, int position) {
        super(first, last);
        this.position = position;
    }

    void showPosition() {
        System.out.println(this.first + " " + this.last + "'s position is " + this.position);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Idol[first name=" + first + ", last name=" + last + ", position=" + position + "]";
    }
}