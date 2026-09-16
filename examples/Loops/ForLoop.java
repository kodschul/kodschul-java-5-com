package Loops;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println(" ".repeat(10) + "*".repeat(5));

        // System.out.println(" *"); // 4 spaces 1 star
        // System.out.println(" **");// 3 spaces 2 star
        // System.out.println(" ****");
        // System.out.println(" *****");
    }

    public static void main3(String[] args) {

        int sum = 0;

        for (int i = 10; i >= 1; i--) {
            System.out.printf("Zahl: %d %n", i);

        }

    }

    public static void main2(String[] args) {
        // show even numbers
        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                System.out.printf("Zahl: %d %n", i);
            }
        }
    }
}
