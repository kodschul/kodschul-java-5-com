import java.util.HashMap;
import java.util.Map;

public class ShoppingListSolution {

    public static void main(String[] args) {
        String[] rawItems = { "Milk:1.50", "Bread:2.20", "Eggs:abc", "Butter:3.10" };

        HashMap<String, Double> cart = new HashMap<>();

        for (String item : rawItems) {
            String[] parts = item.split(":");
            String name = parts[0];

            try {
                double price = Double.parseDouble(parts[1]);
                cart.put(name, price);
            } catch (NumberFormatException e) {
                System.out.println("Skipping invalid price for: " + name);
            }
        }

        System.out.println("Cart:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.printf("- %s: %.2f%n", entry.getKey(), entry.getValue());
        }

        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        System.out.printf("Total: %.2f%n", total);

        cart.remove("Bread");
        total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        System.out.printf("Total after removing Bread: %.2f%n", total);
    }
}
