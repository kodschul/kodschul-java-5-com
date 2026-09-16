import java.util.HashSet;

public class DuplicateCheckSolution {

    public static void main(String[] args) {
        String[] names = { "Anna", "Ben", "Cem", "Anna", "Dana", "Ben", "Anna" };

        HashSet<String> seenNames = new HashSet<>();
        HashSet<String> duplicateNames = new HashSet<>();

        for (String name : names) {
            if (seenNames.contains(name)) {
                duplicateNames.add(name);
            } else {
                seenNames.add(name);
            }
        }

        System.out.println("Duplicates: " + duplicateNames);
        System.out.println("Unique names: " + seenNames.size());
    }
}
