# Modul 5: Schleifen

## Lab 5.2 – for-Schleife

---

## Lab-Ziel

Nach diesem Lab schreibst du Zählschleifen mit `for` und weißt, wann `for`
gegenüber `while` die klarere Wahl ist.

**Leitfragen:**

<details>
<summary>Woraus besteht der Kopf einer for-Schleife?</summary>

Drei Teile, durch Semikolon getrennt: Initialisierung (einmalig),
Bedingung (vor jedem Durchlauf geprüft), Update (nach jedem Durchlauf) -
z. B. `for (int i = 1; i <= 5; i++)`.

</details>

<details>
<summary>Wann passt for besser als while?</summary>

Wenn von vornherein klar ist, wie oft/über welchen Bereich gezählt wird
(feste Anzahl Durchläufe). Bei `while` ist oft unklar, wie viele Durchläufe
es werden, weil die Bedingung von externen Ereignissen abhängt.

</details>

---

## for-Schleife

```java
for (int attempt = 1; attempt <= 5; attempt++) {
    System.out.println("Attempt " + attempt);
}
```

- Entspricht der `while`-Version aus Lab 5.1, aber Initialisierung,
  Bedingung und Update stehen kompakt im Kopf statt verteilt im Code.
- `attempt` ist nur innerhalb der Schleife sichtbar (Scope endet mit der
  schließenden `}`).

## Von ZahlenJagd: mehrere Versuche statt einem

```java
int maxAttempts = 10;

for (int attempt = 1; attempt <= maxAttempts; attempt++) {
    System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
    // Ratewert einlesen und mit if/else-if/else auswerten (siehe Modul 4)
}
```

- Die `for`-Schleife ersetzt den einzelnen Versuch aus Modul 4 durch
  mehrere Versuche mit fester Obergrenze `maxAttempts`.
- Ein korrekter Ratewert muss die Schleife vorzeitig beenden (`return` oder
  `break`) - sonst würden auch nach einem Treffer weitere Versuche
  abgefragt.

**Checkpoint:** Deine Schleife zählt korrekt von 1 bis `maxAttempts` und
lässt sich vorzeitig verlassen.

Weiter geht es mit Lab 5.3: ZahlenJagd erlaubt mehrere Versuche.
