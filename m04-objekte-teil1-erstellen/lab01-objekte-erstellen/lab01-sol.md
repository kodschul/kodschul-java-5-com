# Lösungshinweise: Objekte erstellen (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K04.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Das folgende Beispiel ist eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierte Musterlösung.

## 4.3.1 / 4.5.2 - Objekt erzeugen und weiterverwenden

```java
package main;

import java.util.Random;

public class ObjectWithVisibleRepresentation_solution {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(10);
        System.out.println(value);

        int anotherValue = random.nextInt(10);
        System.out.println(anotherValue);
    }
}
```
