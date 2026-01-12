public class ExceptionHandling {
    public static void show() {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;  // error occurs here
            System.out.println(result);

        } catch (ArithmeticException e) {
            e.printStackTrace();
            e.getMessage();
            System.out.println("Cannot divide by zero");

        } finally {
            System.out.println("Program finished");
        }
    }
}
