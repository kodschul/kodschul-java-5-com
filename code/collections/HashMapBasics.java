import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {
        HashMap<String, Integer> attemptsByPlayer = new HashMap<>();

        attemptsByPlayer.put("Anna", 4);
        attemptsByPlayer.put("Ben", 7);
        attemptsByPlayer.put("Cem", 2);

        System.out.println("Map: " + attemptsByPlayer);
        System.out.println("Anna's attempts: " + attemptsByPlayer.get("Anna"));
        System.out.println("Contains 'Ben': " + attemptsByPlayer.containsKey("Ben"));
        System.out.println("Contains 'Dana': " + attemptsByPlayer.containsKey("Dana"));

        // put() with an existing key overwrites the previous value
        attemptsByPlayer.put("Anna", 5);
        System.out.println("Anna's updated attempts: " + attemptsByPlayer.get("Anna"));

        // get() on a missing key returns null, not an exception
        System.out.println("Dana's attempts: " + attemptsByPlayer.get("Dana"));
        System.out.println("Dana's attempts (with default): " + attemptsByPlayer.getOrDefault("Dana", 0));

        attemptsByPlayer.remove("Cem");
        System.out.println("After remove: " + attemptsByPlayer);
        System.out.println("Size: " + attemptsByPlayer.size());
    }
}
