import java.time.Year;
import java.util.Scanner;

public class Methods {

    public static void show() {
        int currentYear = Year.now().getValue();
        int birthYear = getBirthYear();
        int age = getAge(currentYear, birthYear);
        boolean isAdult = getAdult(age);

        happyBirthday(age, isAdult);
    }

    static int getBirthYear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        return scanner.nextInt();
    }

    //Overloaded Method 1
    static int getAge(int current, int birth) {
        return current - birth;
    }

    //Overloaded Method 2
    static int getAge(int birth) {
        return Year.now().getValue() - birth;
    }

    static boolean getAdult(int age) {
        return age >= 18;
    }

    static void happyBirthday(int age, boolean isAdult) {
        System.out.println("Happy " + age + " years old birthday! 🎂");

        if(isAdult) {
            System.out.println("You are an adult now! 🧑🏻");
        }
        else {
            System.out.println("You are still a child! 🧒🏻");
        }
    }
}