public class StringMethods {
    public static void show() {
        String name = "Bro Code";
        int length = name.length(); //How many characters in the string
        char letter = name.charAt(0); //First character of the string
        int index = name.indexOf("o"); //The charAt of the letter
        int lastIndex = name.lastIndexOf("o"); //The last o is located at which index

        System.out.println("Length: " + length);
        System.out.println("Letter: " + letter);
        System.out.println("Index: " + index);
        System.out.println("Last Index: " + lastIndex);

        System.out.println("The name in uppercase: " + name.toUpperCase()); //All words in CAPITAL LETTER
        System.out.println("The name in lowercase: " + name.toLowerCase()); //All words in lower case
        System.out.println("The name in trimmed: " + name.trim()); //All words
        System.out.println("The name replaced o by a: " + name.replace('o', 'a')); //All 'o' is replaced by 'a'
        System.out.println("The name is empty: " + name.isEmpty());

        if(name.isEmpty()) {
            System.out.println("The name is empty!");
        }
        else {
            System.out.println("Hello " + name + "!");
        }

        if(name.contains("C")) {
            System.out.println("The name contains C!");
        }
        else {
            System.out.println("Your name doesn't contains any C");
        }

        if(name.equals("Bro Code")) {
            System.out.println("Hello " + name + "!");
        }
        else {
            System.out.println("Your name is not Bro Code");
        }

        if(name.equalsIgnoreCase("bro code")) {
            System.out.println("Hello " + name + "!");
        }
        else {
            System.out.println("Your name is not Bro Code");
        }
    }
}
