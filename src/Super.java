public class Super {
    public static void show() {
        Person person1 = new Person("Tamon", "Fukuhara");
        Person person2 = new Person("Ōri", "Sakaguchi");
        Person person3 = new Person("Keito", "Tachibana");
        Person person4 = new Person("Natsuki", "Ishibashi");
        Person person5 = new Person("Rintarō", "Kai");

        // Using toString() automatically when printing the object instead of class + memory address hash
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        // For your Idol objects (assuming Idol also extends Person and has a toString)
        Idol idol1 = new Idol("Tamon", "Fukuhara", 1);
        Idol idol2 = new Idol("Ōri", "Sakaguchi", 2);
        Idol idol3 = new Idol("Keito", "Tachibana", 3);
        Idol idol4 = new Idol("Natsuki", "Ishibashi", 4);
        Idol idol5 = new Idol("Rintarō", "Kai", 5);

        //To String() Method
        System.out.println("\n" + idol1);

        //Refers to parent class (subclass <- superclass)
        System.out.println();
        person1.showName();
        idol1.showPosition();
    }
}
