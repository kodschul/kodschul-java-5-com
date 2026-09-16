// One entry in the highscore list: player name and attempts needed.
// Implements Comparable so a list of Player objects can be sorted directly
// via Collections.sort()/List.sort() by attempt count, instead of comparing
// values manually (see the checkpoint after Module 8).
public class Player implements Comparable<Player> {

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.attempts, otherPlayer.attempts);
    }

    @Override
    public String toString() {
        return name + ": " + attempts + " attempts";
    }
}
