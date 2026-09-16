public class TryCatchBasics {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        int[] values = { 1, 2, 3 };
        try {
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } finally {
            System.out.println("This always runs, error or not.");
        }

        System.out.println("Program continues.");
    }
}
