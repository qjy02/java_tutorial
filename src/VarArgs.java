public class VarArgs {
    public static void show() {
        //Variable Arguments
        System.out.println("Sum: " + add(1, 2, 3, 4, 5, 6));
        System.out.println("Average: " + average(1, 2, 3, 4, 5, 6));
    }

    static int add(int... numbers) {
        int sum = 0;

        for(int number: numbers) {
            sum += number;
        }

        return sum;
    }

    static double average(double... numbers) {
        double sum = 0;

        for(double number: numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
