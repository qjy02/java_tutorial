public class Fish extends Animal {
    int lives = 1;

    void speak() {
        System.out.println("The fish goes *blub*");
    }

    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}
