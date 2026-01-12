public class GettersandSetters {
    public static void show() {
        // Getters -> Readable
        // Setters -> Writable

        // Getters (getModel)
        Earphone earphone = new Earphone("UGreen", "White", 100);

        // Setters (setModel)
        earphone.setModel("Mihoyo");
        earphone.setPrice(-2);

        System.out.println(earphone.getModel() + " " + earphone.getColor() + " " + earphone.getPrice());

        //System.out.println("Earphone Model: " + earphone.getModel());
        //System.out.println("Earphone Color: " + earphone.getColor());
        //System.out.println("Earphone Price: " + earphone.getPrice());
    }
}
