import java.util.Scanner;

public class MathProblems {
    public static void show() {
        //HYPOTENUSE C = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        //c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        c = Math.hypot(a, b);

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        System.out.print("\n");

        //EXAMPLES
        double radius, circumference, area, volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        //Circumference (C = 2 PI R)
        circumference = 2 * Math.PI * radius;

        System.out.println("The circumference is " + circumference + "cm");

        //Area (A = PI r²)
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is " + area + "cm²");

        //Volume (V= 4/3 PI r³)
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume is " + volume + "cm³");

        scanner.close();
    }
}
