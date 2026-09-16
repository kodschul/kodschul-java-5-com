package Loops;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String correctPwd = "c";
        boolean isPwdCorrect = false;

        while (isPwdCorrect == false) {
            System.out.println("Enter your password: ");
            String userInput = scanner.next();

            isPwdCorrect = userInput.contentEquals(correctPwd);

            System.out.println(isPwdCorrect ? "Pwd correct" : "Pwd not correct, try again!");

        }

        System.out.println("Welcome to the system!");
        scanner.close();
    }

}
