public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    String gender;

    Student(String a, int b, double c, boolean d, String e) {
        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = d;
        this.gender = e;
    }

    Student(String a, int b) {
        this.name = a;
        this.age = b;
    }
}