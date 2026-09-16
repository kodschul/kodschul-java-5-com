# Modul 4: Bedingungen

## Lab 4.3 – Übungstransfer: ZahlenJagd-Auswertung und Schwierigkeitsgrad

---

## Lab-Ziel

Nach diesem Lab kombinierst du if/else-Ketten und `switch` in einem
Programm: ZahlenJagd wertet einen Ratewert in drei Fällen aus und lässt
vorher einen Schwierigkeitsgrad wählen.

**Leitfragen:**

<details>
<summary>Warum passt switch für die Schwierigkeitsgrad-Wahl besser als für die Ratewert-Auswertung?</summary>

Der Schwierigkeitsgrad hat wenige, feste, diskrete Werte ("1", "2", ...).
Die Ratewert-Auswertung braucht dagegen einen Bereichsvergleich
(`<`, `==`, `>`), den `switch` nicht direkt abbildet.

</details>

<details>
<summary>Was ändert sich am Ratewert-Bereich, wenn der Schwierigkeitsgrad "hard" ist?</summary>

In dieser Übung bleibt der Zahlenbereich noch fest bei 1-100; erst Modul 11
macht den Bereich abhängig vom gewählten Schwierigkeitsgrad
(`EasyGuessingGame`/`HardGuessingGame`).

</details>

---

## Beide Bausteine kombiniert

```java
String difficultyLabel = switch (difficultyInput) {
    case "1" -> "easy";
    case "2" -> "hard";
    default -> "medium";
};
System.out.println("Difficulty: " + difficultyLabel);

if (guess == targetNumber) {
    System.out.println("Correct! The number was " + targetNumber + ".");
} else if (guess < targetNumber) {
    System.out.println("Too low.");
} else {
    System.out.println("Too high.");
}
```

- Die Schwierigkeitsgrad-Wahl beeinflusst hier noch nichts an der
  Spiellogik selbst - sie wird nur ausgegeben. Die tatsächliche Wirkung
  (anderer Zahlenbereich/andere Versuchsanzahl) folgt erst mit Klassen in
  Modul 11.

**Checkpoint:** Dein Programm fragt zuerst den Schwierigkeitsgrad ab und
wertet danach einen Ratewert korrekt in drei Fällen aus.

Weiter geht es mit Modul 5: Schleifen (mehrere Versuche statt nur einem).
