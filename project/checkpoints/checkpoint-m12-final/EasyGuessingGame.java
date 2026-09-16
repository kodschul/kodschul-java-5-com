// Easy difficulty: smaller number range, more attempts.
public class EasyGuessingGame extends GuessingGame {

    public EasyGuessingGame() {
        super(50, 12);
    }

    @Override
    public String toString() {
        return "EasyGuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
