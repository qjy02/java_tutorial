import java.util.Scanner;

public class Calculator {
    public static void show() {
        //CALCULATOR PROGRAM
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        System.out.println("CALCULATOR PROGRAM");

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): " );
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("System cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Please enter a valid operator!");
                validOperation = false;
            }
        }

        if(validOperation) {
            System.out.printf("Result: %.2f", result);
        }

        scanner.close();
    }
}