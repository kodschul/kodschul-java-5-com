public class Variables {

    public static void main(String[] args) {
        int attempts = 4;
        double average = 2.5;
        boolean gameWon = true;
        char difficulty = 'E';
        String playerName = "Anna";

        System.out.println("Player: " + playerName);
        System.out.println("Attempts: " + attempts);
        System.out.println("Average: " + average);
        System.out.println("Game won: " + gameWon);
        System.out.println("Difficulty: " + difficulty);

        // int has a fixed range; overflow wraps around instead of throwing an error
        int max = Integer.MAX_VALUE;
        System.out.println("Max int: " + max);
        System.out.println("Max int + 1: " + (max + 1));
    }
}
