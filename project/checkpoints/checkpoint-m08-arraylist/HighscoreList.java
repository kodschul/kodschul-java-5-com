import java.util.ArrayList;
import java.util.Arrays;

// Checkpoint after Module 8: highscore list first sorted in a fixed-size
// array (Lab 8.1), then moved to an ArrayList<String> (Lab 8.2) because we
// don't know the number of players in advance. Entries are still compared
// as plain text here; the clean solution with real objects and Comparable
// follows in the checkpoint after Module 11.
public class HighscoreList {

    public static void main(String[] args) {
        // Step 1: fixed-size array, sorted with Arrays.sort (Lab 8.1)
        String[] highscoreArray = {
                "Anna:4", "Ben:7", "Cem:2", "Dana:9"
        };
        Arrays.sort(highscoreArray, (a, b) -> attempts(a) - attempts(b));
        System.out.println("Highscore list (array, fixed size): " + Arrays.toString(highscoreArray));

        // Step 2: ArrayList<String>, because we don't know how many players
        // will join in advance
        ArrayList<String> highscoreList = new ArrayList<>();
        highscoreList.add("Anna:4");
        highscoreList.add("Ben:7");
        highscoreList.add("Cem:2");
        // any number of further players can be added without fixing the size up front
        highscoreList.add("Dana:9");
        highscoreList.add("Elif:3");

        highscoreList.sort((a, b) -> attempts(a) - attempts(b));
        System.out.println("Highscore list (ArrayList, dynamic): " + highscoreList);
    }

    // Extracts the attempt count from an entry of the form "Name:Attempts".
    static int attempts(String entry) {
        String[] parts = entry.split(":");
        return Integer.parseInt(parts[1]);
    }
}
