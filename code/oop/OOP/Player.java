package OOP;

public class Player {

    String name;
    int attempts;

    public Player(String name, int attempts) {

        this.name = name;
        this.attempts = attempts;
    }

    public boolean hasMoreAttemptsThan(Player other) {

        return this.attempts > other.attempts;

    }

    public void showInfo() {
        System.out
                .printf("My name is %s, I did %d attempts :)%n", this.name, this.attempts);
    }
}
