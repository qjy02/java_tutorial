import java.util.Scanner;

public class CompoundInterest {
    public static void show() {
        Scanner scanner = new Scanner(System.in);

        double principle, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " years is: $" + amount);

        scanner.close();
    }
}
