import java.util.HashMap;

public class ShoppingListStarter {

    public static void main(String[] args) {
        String[] rawItems = { "Milk:1.50", "Bread:2.20", "Eggs:abc", "Butter:3.10" };

        HashMap<String, Double> cart = new HashMap<>();

        // TODO 1: for each entry in rawItems, split it by ":" into name and price text.
        // Parse the price with Double.parseDouble(...) inside a try/catch
        // (NumberFormatException). If parsing fails, print
        // "Skipping invalid price for: <name>" and continue with the next item.
        // Otherwise put the name/price into "cart".

        // TODO 2: print every item in "cart" together with its price.

        // TODO 3: compute the total of all prices in "cart" and print it.

        // TODO 4: remove "Bread" from "cart" and print the new total.
    }
}
