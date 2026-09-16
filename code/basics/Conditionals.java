public class Conditionals {

    public static void main(String[] args) {
        int guess = 42;
        int target = 57;

        if (guess == target) {
            System.out.println("Correct!");
        } else if (guess < target) {
            System.out.println("Too low.");
        } else {
            System.out.println("Too high.");
        }

        int age = 16;
        String category = age >= 18 ? "adult" : "minor"; // ternary operator
        System.out.println("Category: " + category);

        boolean hasTicket = true;
        boolean isMember = false;
        if (hasTicket && !isMember) {
            System.out.println("Standard entry.");
        } else if (hasTicket && isMember) {
            System.out.println("Member entry.");
        }
    }
}
