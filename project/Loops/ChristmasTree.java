package Loops;

public class ChristmasTree {

    public static void main(String[] args) {

        int lines = 10;

        for (int i = 1; i <= lines; i++) {
            int spaces = lines - i;
            int stars = i * 2 - 1;
            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }

        System.out.println(" ".repeat(lines - 2) + "||");

        // System.out.println(" *"); // 4 spaces 1 star
        // System.out.println(" **");// 3 spaces 2 star
        // System.out.println(" ****");
        // System.out.println(" *****");
    }

}
