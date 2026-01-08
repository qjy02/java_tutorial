public class PrintF {
    public static void show() {
        String name = "Spongebob";
        char grade = 'A';
        int number = 30;
        double height = -1160.5;
        boolean isEmployed = true;

        //System.out.printf("The height is % .2f\n", height);
        //System.out.printf("Hello %s\n", name);
        //System.out.printf("My grade is %c\n", grade);
        //System.out.printf("The number is %d\n", number);
        //System.out.printf("%s is employed: %b\n", name, isEmployed);

        //[Width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%d\n", id4);
    }
}
