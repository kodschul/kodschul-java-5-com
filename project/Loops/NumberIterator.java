package Loops;

import java.util.Scanner;

public class NumberIterator {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num max: ");
        int max = scanner.nextInt();
        String solutionSteps = "";

        for (int i = 1; i <= max; i++) {
            sum = sum + i;

            // with tenary operator
            solutionSteps += String.format(i == 1 ? "%d" : " + %d", i);
            // if (i == 1) {
            // solutionSteps += String.format("%d", i);
            // } else {
            // solutionSteps += String.format(" + %d", i);
            // }

        }

        solutionSteps += String.format(" = %d", sum);
        System.out.printf("G-Summe von: %d is %d %n", max, sum);
        System.out.println(solutionSteps);

    }
}
