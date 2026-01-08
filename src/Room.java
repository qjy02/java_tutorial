public class Room {
    String name = "Savannah Residences";
    String lot = "A-07";
    String currency = "RM";
    int year = 2026;
    double price = 850.00;
    boolean isOccupied = true;

    void alert() {
        System.out.println("I need a room!");
    }

    void alert(boolean isOccupied) {
        isOccupied = false;
        System.out.println("Let me clear the room for you!");
        System.out.printf("The room is occupied now: %b\n", isOccupied);
    }

}