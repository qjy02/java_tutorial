import java.lang.reflect.Field;

public class Constructors {
    public static void show() {
        //CONSTRUCTORS
        /* Student[] students = {
                new Student("Spongebob", 30, 3.2, false, "Male"),
                new Student("Arden", 20, 3.56, true, "Male"),
                new Student("Vivian", 24)
        }; */

        Student student1 = new Student("Spongebob", 30, 3.2, false, "Male");
        Student student2 = new Student("Arden", 20, 3.56, true, "Male");
        Student student3 = new Student("Vivian", 24);

        Student[] students = { student1, student2, student3};

        for (Student student : students) {
            System.out.println("***************");
            System.out.println("Student Details");
            System.out.println("***************");

            Field[] fields = student.getClass().getDeclaredFields(); // Get the variable name

            for (Field field : fields) {
                try {
                    field.setAccessible(true); // Allow access the field even if it is private

                    String title = capitalize(field.getName()); // Capitalize the first letter of the title
                    Object value = field.get(student); // Get the value of the field from the current Student object

                    System.out.println(title + ": " + value);

                } catch (IllegalAccessException e) {
                    e.printStackTrace(); // Print any errors
                }
            }
            System.out.println();
        }
    }

    static String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    } // Capitalize the first character of the string
}