import java.util.HashMap;

public class HashMaps {
    public static void show() {

        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        System.out.println(scores.get("Alice")); // 90
        System.out.println(scores.containsKey("Bob")); // Key
        System.out.println(scores.containsValue(90)); // Value
        System.out.println(scores.size()); // Size (3 items in HashMaps)

        for (String name : scores.keySet()) {
            System.out.println(name + " -> " + scores.get(name));
        }
    }
}