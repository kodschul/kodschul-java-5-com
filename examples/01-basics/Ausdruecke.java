/**
 * Modul 2: Ausdruecke, Datentypen, Casts, Variablen, Vergleiche, Logik.
 * Beispiel: Einkaufsrechner mit Mengenrabatt und Versandkostenpruefung.
 */
public class Ausdruecke {

    public static void main(String[] args) {
        // Variablen: Deklaration + Zuweisung
        double pricePerItem = 2.49;
        int quantity = 7;

        int32
        double freeShippingThreshold = 20.00;

        // Ausdruck: mehrere Operanden/Operatoren, uebliche Praezedenzregeln
        double total = pricePerItem * quantity;

        // Cast double -> int: schneidet ab, rundet nicht!
        int totalCents = (int) (total * 100);

        // Vergleichsoperatoren liefern boolean
        boolean qualifiesForFreeShipping = total >= freeShippingThreshold;

        // Logische Operatoren mit Short-Circuit (&&)
        boolean isBulkOrder = quantity > 5;
        boolean applyDiscount = isBulkOrder && qualifiesForFreeShipping;

        System.out.println("Gesamtsumme: " + total + " EUR");
        System.out.println("In Cent (abgeschnitten): " + totalCents);
        System.out.println("Kostenloser Versand? " + qualifiesForFreeShipping);
        System.out.println("Mengenrabatt anwendbar? " + applyDiscount);
    }
}
