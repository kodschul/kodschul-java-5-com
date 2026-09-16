import java.util.HashSet;

// Exercise: find which names appear more than once using a HashSet.
public class DuplicateCheckExercise {

    public static void main(String[] args) {
        String[] names = { "Anna", "Ben", "Cem", "Anna", "Dana", "Ben", "Anna" };

        HashSet<String> seenNames = new HashSet<>();
        HashSet<String> duplicateNames = new HashSet<>();

        // TODO 1: go through "names"; if a name is already in seenNames, add it to
        // duplicateNames. Otherwise add it to seenNames.

        // TODO 2: print duplicateNames.

        // TODO 3 (bonus): print how many names in total were unique (seenNames.size()).
    }
}
