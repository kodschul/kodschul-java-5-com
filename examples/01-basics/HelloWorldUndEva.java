/**
 * Modul 1: Einfuehrung - EVA-Prinzip, Ausgabe vs. Rueckgabewert.
 * Beispiel: Begruessungsbildschirm einer Supermarktkasse.
 */
public class HelloWorldUndEva {

    public static void main(String[] args) {
        // Ausgabe: sichtbar auf der Konsole, kein Rueckgabewert noetig
        System.out.println("Willkommen bei JavaMarkt!");

        // Verarbeitung (Algorithmus): heutigen Rabatt berechnen
        double discount = calculateDailyDiscount();

        // Rueckgabewert von calculateDailyDiscount() wird erst hier sichtbar,
        // weil er als Argument an println weitergegeben wird
        System.out.println("Heutiger Rabatt: " + discount + " %");

        // Rueckgabewert nicht weitergegeben -> geht verloren, aber kein Fehler
        calculateDailyDiscount();
    }

    // Methode: 0 Eingaben, 1 Rueckgabewert
    private static double calculateDailyDiscount() {
        // Math.random() liefert [0.0, 1.0) - nicht deterministisch
        return (int) (Math.random() * 20 + 1); // 1 bis 20 %
    }
}
