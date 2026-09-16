# Modul 6: Arrays einführen

## Lab 6.3 – Jeden Rateversuch in ein Array schreiben

---

## Lab-Ziel

Nach diesem Lab speichert ZahlenJagd jeden Rateversuch zusätzlich in einem
Array, sodass am Ende alle Versuche ausgegeben werden können.

**Leitfragen:**

<details>
<summary>Warum reicht die feste Größe maxAttempts für das Array?</summary>

Die Anzahl möglicher Versuche ist durch `maxAttempts` bereits nach oben
begrenzt - mehr Versuche als `maxAttempts` kann es ohnehin nicht geben,
also passt ein Array dieser festen Größe.

</details>

<details>
<summary>Warum braucht es einen eigenen Zähler attemptCount statt attempt-1?</summary>

Weil die Schleife bei einem Treffer vorzeitig mit `return` endet - ohne
eigenen Zähler wüsste man beim Ausgeben nicht mehr sicher, wie viele
Versuche tatsächlich gemacht wurden.

</details>

---

## Versuchshistorie mitschreiben

```java
int[] attemptHistory = new int[maxAttempts];
int attemptCount = 0;

for (int attempt = 1; attempt <= maxAttempts; attempt++) {
    // ... Ratewert einlesen ...
    attemptHistory[attemptCount] = guess;
    attemptCount++;

    if (guess == targetNumber) {
        // ... Erfolgsmeldung ...
        break;
    }
    // ... zu niedrig/zu hoch ...
}

System.out.print("Your guesses: ");
for (int i = 0; i < attemptCount; i++) {
    System.out.print(attemptHistory[i] + " ");
}
```

- Die Ausgabe-Schleife läuft nur bis `attemptCount`, nicht bis
  `attemptHistory.length` - sonst würden auch nicht genutzte,
  auf `0` initialisierte Plätze mit ausgegeben.
- `break` statt `return` wird hier verwendet, damit die Ausgabe der
  Versuchshistorie nach der Schleife noch erreicht wird.

**Checkpoint:** Nach jedem Spiel zeigt dein Programm alle gemachten
Rateversuche in der richtigen Reihenfolge an.

Weiter geht es mit Modul 7: Arrays und Schleifen kombinieren.
