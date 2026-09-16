# Lösungshinweise: Exception Handling (I) (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K10.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Das folgende Beispiel ist eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierte Musterlösung.

## 10.1.2 - try-catch mit continue

```java
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingWithContinue_solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int taskNo = 1; taskNo <= 3; taskNo++) {
            System.out.println("Aufgabe " + taskNo + ": Ihre Lösung?");

            try {
                int userSolution = Integer.parseInt(reader.readLine());
                System.out.println("Eingabe verarbeitet: " + userSolution);
            } catch (NumberFormatException e) {
                System.out.println("Ungueltige Eingabe, bitte eine ganze Zahl eingeben.");
                continue;
            }
        }
    }
}
```
