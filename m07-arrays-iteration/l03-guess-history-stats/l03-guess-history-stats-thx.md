# Modul 7: Arrays und Schleifen kombinieren

## Lab 7.3 – Übungstransfer: ZahlenJagd-Versuchshistorie auswerten

---

## Lab-Ziel

Nach diesem Lab berechnest du Durchschnitt, kleinsten und größten Wert der
ZahlenJagd-Versuchshistorie aus Modul 6.

**Leitfragen:**

<details>
<summary>Warum reicht attemptHistory.length hier nicht als Schleifengrenze?</summary>

Das Array hat immer die feste Größe `maxAttempts`, aber bei einem frühen
Treffer wurden nicht alle Plätze befüllt - die Auswertung muss sich auf
`attemptCount` (die tatsächliche Anzahl) beschränken.

</details>

<details>
<summary>Was, wenn attemptCount gleich 0 wäre?</summary>

Eine Division durch 0 für den Durchschnitt - in der Praxis kommt das hier
nicht vor, da immer mindestens ein Versuch gemacht wird, bevor die Auswertung
läuft.

</details>

---

## Auswertung der echten Versuchshistorie

```java
int sum = 0;
int min = attemptHistory[0];
int max = attemptHistory[0];

for (int i = 0; i < attemptCount; i++) {
    int guess = attemptHistory[i];
    sum += guess;
    if (guess < min) {
        min = guess;
    }
    if (guess > max) {
        max = guess;
    }
}

double average = (double) sum / attemptCount;
System.out.println("Average guess: " + average);
System.out.println("Lowest guess: " + min + ", highest guess: " + max);
```

- Die Schleife läuft bis `attemptCount`, nicht bis
  `attemptHistory.length` - dasselbe Prinzip wie bei der Ausgabe in
  Lab 6.3.

**Checkpoint:** Nach einer gespielten Runde zeigt dein Programm zusätzlich
Durchschnitt, kleinsten und größten Ratewert der Runde an.

Weiter geht es mit Modul 8: Array-Algorithmen und ArrayList.
