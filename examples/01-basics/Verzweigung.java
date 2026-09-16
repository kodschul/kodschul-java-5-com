/**
 * Modul 3: if-then-else-Anweisung.
 * Beispiel: Notenrechner (bestanden/nicht bestanden).
 */
public class Verzweigung {

    public static void main(String[] args) {
        int scoreOutOfHundred = 63;
        int passingScore = 50;

        // if-then-else: genau ein Zweig wird ausgefuehrt, nie beide
        if (scoreOutOfHundred >= passingScore) {
            System.out.println("Bestanden! Punktzahl: " + scoreOutOfHundred);
        } else {
            System.out.println("Leider nicht bestanden. Punktzahl: " + scoreOutOfHundred);
        }

        // if-then ohne else: Zusatzhinweis nur bei knappem Ergebnis
        if (scoreOutOfHundred - passingScore < 5) {
            System.out.println("Hinweis: knapp bestanden, Wiederholung empfohlen.");
        }
    }
}
