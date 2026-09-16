public class WhileLoop {

    public static void main(String[] args) {
        int attempt = 1;
        int maxAttempts = 5;

        while (attempt <= maxAttempts) {
            System.out.println("Attempt " + attempt + "/" + maxAttempts);
            attempt++;
        }

        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown + "...");
            countdown--;
        }
        System.out.println("Liftoff!");
    }
}
