public class Static {
    public static void show() {
        //STATIC
        Friend friend1 = new Friend("Erica");
        Friend friend2 = new Friend("Arden");
        Friend friend3 = new Friend("Vivian");

        Friend.showFriends();
    }
}