# Lösungshinweise: Einführung

Eigene Referenzlösungen zur Vorbereitung; die offizielle Musterlösung liegt
in `solutions.zip` und sollte erst nach der jeweiligen Übung gezeigt werden
(siehe `output-intern/trainer-checklist.md`).

## 1.7.2 - Tastaturkürzel

Kein Code-Ergebnis, sondern eine individuelle IDE-Erkundung. Erwartetes
Ergebnis: Teilnehmer:innen können `System.out.println()` per Snippet
erzeugen und kennen den Unterschied zwischen `syso`/`sout` (Standardausgabe)
und `syserr`/`serr` (Fehlerausgabe).

## 1.8.2 - Weitere Methoden aus `Math`

Beispielhafte, eigene Lösung (Variablennamen frei wählbar):

```java
package main;

public class OutputMoreReturnValues_solution {
    public static void main(String[] args) {
        System.out.println(Math.max(3, 7));
        System.out.println(Math.sqrt(16.0));
        System.out.println(Math.abs(-5));
        System.out.println(System.currentTimeMillis());
    }
}
```

`System.currentTimeMillis()` liefert die Millisekunden seit dem 1.1.1970 UTC
(Unix-Epoche) - nützlich u. a. zum Messen von Laufzeiten.
