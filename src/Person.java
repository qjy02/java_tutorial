public class Person {
    String first, last;

    Person(String a, String b) {
        this.first = a;
        this.last = b;
    }

    void showName() {
        System.out.println(this.first + " " + this.last);
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Person[first name=" + first + ", last name=" + last + "]";
    }

}