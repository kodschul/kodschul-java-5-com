# Modul 7: Arrays und Schleifen kombinieren

## Lab 7.2 – Werte suchen, zählen, aufsummieren

---

## Lab-Ziel

Nach diesem Lab berechnest du Summe, Durchschnitt sowie kleinsten und
größten Wert eines Arrays über eine Schleife.

**Leitfragen:**

<details>
<summary>Warum braucht man Startwerte für Minimum/Maximum vor der Schleife?</summary>

Ohne einen Startwert (z. B. das erste Element) hätte man nichts, womit man
das erste verglichene Element vergleichen könnte - ein sinnvoller Startwert
ist meist das erste Array-Element selbst.

</details>

<details>
<summary>Wie berechnet man den Durchschnitt aus Summe und Anzahl?</summary>

`summe / anzahl` - wichtig ist, dass mindestens einer der beiden Operanden
ein `double` ist, sonst rundet Java bei zwei `int`-Werten automatisch ab
(Ganzzahldivision).

</details>

---

## Minimum, Maximum, Summe, Durchschnitt

```java
int[] attemptHistory = {42, 17, 73, 50, 8};

int sum = 0;
int min = attemptHistory[0];
int max = attemptHistory[0];

for (int guess : attemptHistory) {
    sum += guess;
    if (guess < min) {
        min = guess;
    }
    if (guess > max) {
        max = guess;
    }
}

double average = (double) sum / attemptHistory.length;

System.out.println("Sum: " + sum);
System.out.println("Average: " + average);
System.out.println("Min: " + min + ", Max: " + max);
```

- `min`/`max` starten beim ersten Element, nicht bei `0` - sonst könnte
  z. B. ein Minimum von `0` fälschlich "gewinnen", obwohl `0` gar nicht im
  Array vorkommt.
- `(double) sum` erzwingt eine Kommazahl-Division, bevor durch
  `attemptHistory.length` geteilt wird.

**Checkpoint:** Für das Beispiel-Array berechnest du Summe 190, Durchschnitt
38.0, Minimum 8 und Maximum 73.

Weiter geht es mit Lab 7.3: Durchschnitt und Extremwerte der
ZahlenJagd-Versuchshistorie berechnen.
