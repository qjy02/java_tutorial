public class Interface {
    public static void show() {
        //Interface => A blueprint for a class that specifies a set of abstraction methods
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Catfish catfish = new Catfish();

        // Implements Prey Interface
        rabbit.flee();

        // Implements Predator Interface
        hawk.hunt();

        // Implements both Prey and Predator Interface
        catfish.flee();
        catfish.hunt();
    }
}
