# Lösungshinweise: Schleifen I (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K07.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Die folgenden Beispiele sind eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierten Musterlösungen.

## 7.1.4 - Präfix vs. Postfix

```java
package main;

public class IncrementDecrement_solution {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++); // gibt 5 aus, i ist danach 6
        System.out.println(++i); // i ist vorher 7, gibt 7 aus
    }
}
```

## 7.2.2 - for-Schleife über Aufgaben

```java
package main;

public class ArithmeticTrainer_0_0_4_solution {
    public static void main(String[] args) {
        int noOfTasksPerRound = 10;

        for (int taskNo = 1; taskNo <= noOfTasksPerRound; taskNo++) {
            System.out.println("Aufgabe " + taskNo + " von " + noOfTasksPerRound);
        }
    }
}
```
