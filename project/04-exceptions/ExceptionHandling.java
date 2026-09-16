import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Modul 10: Exception Handling (I) - try-catch und continue.
 * Beispiel: robuste Zahleneingabe, die ungueltige Eingaben abfaengt.
 */
public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int validAnswersCollected = 0;

        for (int taskNo = 1; taskNo <= 3 && validAnswersCollected < 3; taskNo++) {
            System.out.println("Aufgabe " + taskNo + ": Bitte eine Zahl eingeben.");

            try {
                int answer = Integer.parseInt(reader.readLine());
                System.out.println("Danke, du hast " + answer + " eingegeben.");
                validAnswersCollected++;
            } catch (NumberFormatException e) {
                System.out.println("Ungueltige Eingabe, das war keine Zahl.");
                taskNo--; // gleiche Aufgabe erneut stellen, keine gueltige Zahl verbraucht
                continue;
            }
        }

        System.out.println("Eingabe abgeschlossen.");
    }
}
