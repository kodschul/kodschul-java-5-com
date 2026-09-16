import java.util.Random;

/**
 * Modul 7: for- und do-while-Schleifen.
 * Beispiel: Einmaleins-Tabelle und simulierte Trainingsrunden.
 */
public class Schleifen {

    public static void main(String[] args) {
        int tableBase = 7;

        // for-Schleife: feste, zaehlbare Wiederholung
        System.out.println("Einmaleins der " + tableBase + ":");
        for (int factor = 1; factor <= 10; factor++) {
            System.out.println(tableBase + " x " + factor + " = " + (tableBase * factor));
        }

        // do-while-Schleife: Block laeuft mindestens einmal, Bedingung erst danach
        Random random = new Random();
        boolean playAgain;
        int round = 0;
        do {
            round++;
            int task = random.nextInt(10) + 1;
            System.out.println("Runde " + round + ": Aufgabe " + tableBase + " x " + task);
            playAgain = round < 3; // steht hier fuer eine simulierte Benutzereingabe
        } while (playAgain);
    }
}
