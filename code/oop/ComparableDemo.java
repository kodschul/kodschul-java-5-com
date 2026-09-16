import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    static class Player implements Comparable<Player> {
        private final String name;
        private final int attempts;

        Player(String name, int attempts) {
            this.name = name;
            this.attempts = attempts;
        }

        @Override
        public int compareTo(Player other) {
            return Integer.compare(this.attempts, other.attempts);
        }

        @Override
        public String toString() {
            return name + ": " + attempts + " attempts";
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Anna", 4));
        players.add(new Player("Ben", 7));
        players.add(new Player("Cem", 2));

        Collections.sort(players);

        for (Player player : players) {
            System.out.println(player);
        }
    }
}
