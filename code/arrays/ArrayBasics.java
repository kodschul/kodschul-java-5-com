public class ArrayBasics {

    public static void main(String[] args) {
        int[] attemptHistory = new int[5];
        attemptHistory[0] = 42;
        attemptHistory[1] = 17;

        System.out.println("First value: " + attemptHistory[0]);
        System.out.println("Length: " + attemptHistory.length);
        System.out.println("Unset value (default 0): " + attemptHistory[2]);

        int[] scores = { 90, 85, 77, 100, 63 };
        System.out.println("Third score: " + scores[2]);

        try {
            System.out.println(scores[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index 10 is out of bounds for length " + scores.length);
        }
    }
}
