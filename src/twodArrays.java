public class twodArrays {
    public static void show() {
        /* String[][] groceries = {{"Apple", "Banana", "Cherry"},
                                {"Potato", "Onion", "Carrot"},
                                {"Chicken", "Pork", "Beef", "Fish"}};

        groceries[0][0] = "Pineapple";
        groceries[1][0] = "Celery";
        groceries[2][0] = "Shrimp";

        for(String[] foods : groceries) {
            for(String food : foods) {
                System.out.print(food + " ");
            }

            System.out.println();
        } */

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone) {
            for(char number : row) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}