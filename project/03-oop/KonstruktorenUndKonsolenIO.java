import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Modul 5: Konstruktoren aufrufen und Konsolen-I/O.
 * Beispiel: Punktezaehler mit Konsoleneingabe fuer die Rundengrenze.
 */
public class KonstruktorenUndKonsolenIO {

    public static void main(String[] args) throws IOException {
        // Konsoleneingabe: ein Objekt mit einem anderen Objekt initialisieren
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wie viele Punkte maximal pro Runde? (z. B. 10)");
        String input = reader.readLine();

        // Eingaben kommen immer als String an und muessen umgewandelt werden
        int maxPointsPerRound = Integer.parseInt(input);

        ScoreCounter scoreCounter = new ScoreCounter(maxPointsPerRound);
        scoreCounter.addRound(8);
        scoreCounter.addRound(10);

        System.out.println("Gesamtpunktzahl: " + scoreCounter.getTotal());
    }
}

class ScoreCounter {
    private final int maxPointsPerRound;
    private int total;

    // Konstruktor: setzt den Anfangszustand beim Erzeugen des Objekts
    ScoreCounter(int maxPointsPerRound) {
        this.maxPointsPerRound = maxPointsPerRound;
    }

    void addRound(int points) {
        total += Math.min(points, maxPointsPerRound);
    }

    int getTotal() {
        return total;
    }
}
