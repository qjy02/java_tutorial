public class VariableScope {

    static int x = 3; //CLASS

    public static void show() {
        //Variable Scope => Where a variable can be accessed
        int x = 1; //LOCAL

        System.out.println("X in my show: " + x);

        doSomething(x); //If so, the parameter cannot be the same name as x in doSomething
    }

    static void doSomething(int y) {
        int x = 2; //LOCAL

        System.out.println("X in do something: " + y);
    }
}