public class Countdown {

    int countdownInSecs = 5;
    int currentSecsLeft = 0;

    public Countdown(int countdownInSecs) {
        this.countdownInSecs = countdownInSecs;
    }

    public void start() throws InterruptedException {
        this.currentSecsLeft = this.countdownInSecs;
        for (int i = this.currentSecsLeft; i >= 1; i--) {

            System.out.println(i + "...");
            Thread.sleep(1000); // pause for 1 second before the next number

            this.currentSecsLeft = i;
        }
        System.out.println("Booom!");
    }

    public static void main(String[] args) throws InterruptedException {
        Countdown bomb1 = new Countdown(3);
        Countdown bomb2 = new Countdown(4);
        Countdown bomb3 = new Countdown(5);
        bomb1.start();
        bomb2.start();

    }

}
