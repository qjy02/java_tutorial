public class Earphone {
    private String model;
    private final String color; //Final will let it not writable
    private int price;

    Earphone(String a, String b, int c) {
        this.model = a;
        this.color = b;
        this.price = c;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "RM " + this.price;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cannot be less than 0!");
        }
        else {
            this.price = price;
        }
    }
}
