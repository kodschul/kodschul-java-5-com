// Hard difficulty: larger number range, fewer attempts.
public class HardGuessingGame extends GuessingGame {

    public HardGuessingGame() {
        super(200, 6);
    }

    @Override
    public String toString() {
        return "HardGuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
