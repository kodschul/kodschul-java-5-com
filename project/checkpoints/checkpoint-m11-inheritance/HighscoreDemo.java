import java.util.ArrayList;
import java.util.Collections;

// Checkpoint after Module 11: demo of how an ArrayList<Player> is cleanly
// sorted by attempt count via Comparable/Collections.sort. Does not include
// difficulty selection yet - that's in the final checkpoint after Module 12.
public class HighscoreDemo {

    public static void main(String[] args) {
        ArrayList<Player> highscores = new ArrayList<>();
        highscores.add(new Player("Anna", 4));
        highscores.add(new Player("Ben", 7));
        highscores.add(new Player("Cem", 2));
        highscores.add(new Player("Dana", 9));

        Collections.sort(highscores);

        System.out.println("Highscore list (sorted by attempts):");
        for (Player player : highscores) {
            System.out.println(player);
        }
    }
}
