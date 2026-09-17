import java.util.ArrayList;
import java.util.Scanner;

public class InputMachine {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        boolean isRunning = true;

        while (isRunning) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a num: ");
            String numAsStr = scanner.nextLine();

            if (numAsStr.isEmpty()) {
                isRunning = false;
                continue;
            }

            int num = Integer.parseInt(numAsStr);

            if (nums.contains(num)) {
                System.out.println("please add another num, already exists: " + nums);
            } else {
                nums.add(num);
            }

        }

        System.out.println("Full list: " + nums);

    }

    public static void main1(String[] args) {

        int[] numbers = { 10, 5, 6, 7, 100, 6, 7 };

        ArrayList<Integer> cleanNumbers = new ArrayList<>();

        int abc = Integer.parseInt("100000");

        for (int num : numbers) {
            if (!cleanNumbers.contains(num)) {
                cleanNumbers.add(num);
            }
        }

        System.out.println(cleanNumbers);
    }
}
