public class Inheritance {
    public static void show() {
        //Inheritance
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        /*System.out.println("Dog Is Alive: " + dog.isAlive);
        dog.eat();
        System.out.println("Dog Lives: " + dog.lives);
        dog.speak();

        System.out.println();

        System.out.println("Cat is Alive: " + cat.isAlive);
        cat.eat();
        System.out.println("Cat Lives: " + cat.lives);
        cat.speak();*/

        dog.move();
        cat.move();
        fish.move();
    }
}
