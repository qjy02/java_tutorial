public class VariableExercise {
    public static void show(){
        String name = "Bro Code";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = false;

        if(isAdmin) {
            System.out.println(name + " gender is " + gender);
        }
        else {
            System.out.printf("My gta: %d and my pi: %.2f%n", gta, pi);
        }
    }
}
