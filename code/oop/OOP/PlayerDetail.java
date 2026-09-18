package OOP;

public class PlayerDetail {

    String name;
    private int score;

    public PlayerDetail(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

}
