public class AnonymousClasses {
    public static void show() {
        // Class without a name, created and used at the same time
        Mushroom mushroom = new Mushroom();
        Mushroom talkingMushroom = new Mushroom() {
            @Override()
            void speak() {
                System.out.println("Red Mushroom and Purple Mushroom goes *jime*");
            }
        };

        // Access anonymous class
        talkingMushroom.speak();
    }
}
