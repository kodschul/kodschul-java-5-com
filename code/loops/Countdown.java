public class Countdown {

    public static void main(String[] args) throws InterruptedException {
        int start = 5;

        for (int i = start; i >= 1; i--) {
            System.out.println(i + "...");
            Thread.sleep(1000); // pause for 1 second before the next number
        }
        System.out.println("Go!");
    }
}
