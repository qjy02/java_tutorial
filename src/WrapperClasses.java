public class WrapperClasses {
    public static void show() {
        //Object representations of primitive data types (int/char/double/boolean ...)

        // Autoboxing (Primitive -> Wrapper)
        Integer a1 = 123;
        Double b1 = 3.14;
        Character c1 = '@';
        Boolean d1 = false;

        // Unboxing (Wrapper -> Primitive)
        int x1 = a1;
        double y1 = b1;

        // IsLetter
        char letter = 'b';
        System.out.println(Character.isLetter(letter));

        // To String
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        //System.out.println(x);
    }
}