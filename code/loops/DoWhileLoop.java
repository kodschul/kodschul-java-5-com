public class DoWhileLoop {

    public static void main(String[] args) {
        int number = 10;

        // runs at least once, even though the condition is already false
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5);

        int menuChoice = 0;
        int simulatedInputs = 2;
        do {
            menuChoice++;
            System.out.println("Showing menu, choice attempt " + menuChoice);
        } while (menuChoice < simulatedInputs);
    }
}
