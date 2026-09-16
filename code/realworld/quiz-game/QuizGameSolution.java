public class QuizGameSolution {

    private static int highScore = 0;

    public static void main(String[] args) {
        String[] questions = { "2 + 2 = ?", "Capital of France?", "Java keyword for a constant field?" };
        String[] correctAnswers = { "4", "Paris", "final" };

        String[] attempt1Answers = { "4", "Paris", "static" };
        String[] attempt2Answers = { "4", "Paris", "final" };

        playRound(questions, correctAnswers, attempt1Answers);
        playRound(questions, correctAnswers, attempt2Answers);
    }

    private static void playRound(String[] questions, String[] correctAnswers, String[] givenAnswers) {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            if (givenAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong, correct was: " + correctAnswers[i]);
            }
        }

        System.out.println("Score: " + score + "/" + questions.length);

        if (score > highScore) {
            highScore = score;
            System.out.println("New high score: " + highScore);
        }
    }
}
