public class ForLoop {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum 1-10: " + sum);

        for (int i = 10; i >= 1; i -= 2) {
            System.out.println("Countdown step: " + i);
        }

        int evenCount = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers between 1 and 20: " + evenCount);
    }
}
