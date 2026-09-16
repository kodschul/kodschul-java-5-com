public class QuizGameStarter {

    private static int highScore = 0; // shared across every playRound() call

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

        // TODO 1: loop over "questions" by index. For each index, print the question,
        // then compare givenAnswers[i] to correctAnswers[i] with
        // .equalsIgnoreCase(...). Print "Correct" or "Wrong, correct was: <answer>",
        // and increase "score" by 1 for each correct answer.

        // TODO 2: print the final score for this round, e.g. "Score: 2/3".

        // TODO 3: if "score" is higher than the static "highScore", update highScore
        // and print "New high score: <highScore>".
    }
}
