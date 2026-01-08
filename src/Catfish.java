public class Catfish implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("*The catfish is swimming away*");
    }

    @Override
    public void hunt() {
        System.out.println("*The catfish is hunting*");
    }
}
