public class TryCatchBasics {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = Integer.parseInt("e") / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Something went wrong sorry!!" + e);
        }

        System.exit(0);

        int[] values = { 1, 2, 3 };
        try {
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        } finally {
            System.out.println("Enter a num please!");
        }

        System.out.println("Program continues.");
    }
}
