public class TypeCasting {

    public static void main(String[] args) {
        double price = 19.99;
        int roundedDown = (int) price; // explicit cast, decimal part is dropped
        System.out.println("price: " + price + " -> (int): " + roundedDown);

        int wholeNumber = 5;
        double asDouble = wholeNumber; // implicit widening, no cast needed
        System.out.println("wholeNumber: " + wholeNumber + " -> double: " + asDouble);

        String numberText = "42";
        int parsed = Integer.parseInt(numberText);
        System.out.println("parsed \"42\" -> " + (parsed + 1));

        int number = 7;
        String asText = String.valueOf(number);
        System.out.println("number " + number + " -> String \"" + asText + "\"");
    }
}
