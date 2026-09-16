# Modul 8: Array-Algorithmen und ArrayList

## Lab 8.3 – Highscore-Liste: Array-Sortierung, dann ArrayList

---

## Lab-Ziel

Nach diesem Lab liefert `GuessingGame` die Anzahl benötigter Versuche
zurück, und eine Highscore-Liste wird zunächst im Array, dann in einer
`ArrayList<String>` sortiert ausgegeben.

**Leitfragen:**

<details>
<summary>Warum ändert sich playRound() von void zu int?</summary>

Damit der Aufrufer (z. B. eine Highscore-Liste) erfährt, wie viele
Versuche gebraucht wurden - eine `void`-Methode kann kein Ergebnis
zurückgeben.

</details>

<details>
<summary>Warum wird das Textformat "Name:Versuche" statt echter Objekte verwendet?</summary>

Als Zwischenschritt, um `ArrayList<String>` zu üben, bevor in Modul 11
eigene Objekte (`Player`) mit `Comparable` eingeführt werden - die saubere
Lösung kommt dort.

</details>

---

## GuessingGame gibt die Versuchsanzahl zurück

```java
static int playRound() {
    // ... wie bisher ...
    if (guess == targetNumber) {
        System.out.println("Correct! The number was " + targetNumber + ".");
        return attempt;
    }
    // ...
    return maxAttempts + 1; // Sonderwert: keine Versuche mehr übrig
}
```

## Highscore-Liste: erst Array, dann ArrayList

```java
String[] highscoreArray = {"Anna:4", "Ben:7", "Cem:2", "Dana:9"};
Arrays.sort(highscoreArray, (a, b) -> attempts(a) - attempts(b));

ArrayList<String> highscoreList = new ArrayList<>();
highscoreList.add("Anna:4");
highscoreList.add("Ben:7");
// beliebig viele weitere Spieler, ohne die Größe vorher zu kennen
highscoreList.sort((a, b) -> attempts(a) - attempts(b));
```

- Beide Varianten nutzen dieselbe Vergleichslogik (`attempts(a) - attempts(b)`);
  der Unterschied liegt nur in der Datenstruktur.
- `attempts(entry)` zerlegt den Text an `":"` und liest die Zahl danach.

**Checkpoint:** Beide Highscore-Listen (Array und ArrayList) werden nach
Versuchsanzahl aufsteigend sortiert ausgegeben.

Weiter geht es mit Modul 9: Fehler abfangen.
