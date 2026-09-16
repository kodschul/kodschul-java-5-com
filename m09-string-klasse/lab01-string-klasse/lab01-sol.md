# Lösungshinweise: Die String-Klasse (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K09.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Die folgenden Beispiele sind eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierten Musterlösungen.

## 9.2 - Abbruch-Kommando erkennen

```java
package main;

public class QuitCheck_solution {
    public static void main(String[] args) {
        String input = "quit";

        if (input.equalsIgnoreCase("quit")) {
            System.out.println("Runde wird beendet.");
        } else {
            System.out.println("Weiter geht's.");
        }
    }
}
```

## 9.3 - `==` vs. `.equals(...)`

```java
package main;

public class StringEqualityDemo_solution {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        System.out.println(a == b);        // true (String Pool)
        System.out.println(a == c);        // false (unterschiedliche Objekte)
        System.out.println(a.equals(c));   // true (gleicher Inhalt)
    }
}
```
