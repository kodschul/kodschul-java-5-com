import java.util.HashSet;

public class HashSetBasics {

    public static void main(String[] args) {
        HashSet<String> playedNames = new HashSet<>();

        playedNames.add("Anna");
        playedNames.add("Ben");
        playedNames.add("Anna"); // duplicate, ignored - a Set never stores the same value twice

        System.out.println("Set: " + playedNames);
        System.out.println("Size: " + playedNames.size());
        System.out.println("Contains 'Ben': " + playedNames.contains("Ben"));

        playedNames.remove("Ben");
        System.out.println("After remove: " + playedNames);

        // building a set from an array is a quick way to find unique values
        String[] guesses = { "42", "17", "42", "8", "17", "99" };
        HashSet<String> uniqueGuesses = new HashSet<>();
        for (String guess : guesses) {
            uniqueGuesses.add(guess);
        }
        System.out.println("Unique guesses: " + uniqueGuesses.size() + " out of " + guesses.length + " total");
    }
}
