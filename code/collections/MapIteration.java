import java.util.HashMap;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {
        HashMap<String, Integer> attemptsByPlayer = new HashMap<>();
        attemptsByPlayer.put("Anna", 4);
        attemptsByPlayer.put("Ben", 7);
        attemptsByPlayer.put("Cem", 2);

        System.out.println("Keys only:");
        for (String name : attemptsByPlayer.keySet()) {
            System.out.println("- " + name);
        }

        System.out.println("Values only:");
        for (int attempts : attemptsByPlayer.values()) {
            System.out.println("- " + attempts);
        }

        System.out.println("Key + value together:");
        for (Map.Entry<String, Integer> entry : attemptsByPlayer.entrySet()) {
            System.out.println(entry.getKey() + " needed " + entry.getValue() + " attempts");
        }

        int total = 0;
        for (int attempts : attemptsByPlayer.values()) {
            total += attempts;
        }
        System.out.println("Total attempts: " + total);
    }
}
