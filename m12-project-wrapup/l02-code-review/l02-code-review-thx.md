# Modul 12: Projektabschluss

## Lab 12.2 – Code-Review und letzte Verbesserungen

---

## Lab-Ziel

Nach diesem Lab hast du deinen eigenen Code anhand einer kurzen Checkliste
überprüft und mindestens eine konkrete Verbesserung umgesetzt.

**Leitfragen:**

<details>
<summary>Wonach sucht man in einem Code-Review typischerweise zuerst?</summary>

Nach offensichtlichen Risiken: unbehandelte Fehlerfälle, unklare
Namensgebung, doppelter Code, fehlende Kapselung (öffentliche statt
private Felder) - nicht nach Stil-Details wie Einrückung.

</details>

<details>
<summary>Warum lohnt sich ein Review, obwohl das Programm bereits läuft?</summary>

"Läuft" bedeutet nicht "robust" oder "wartbar" - ein Review deckt Fälle
auf, die im eigenen Test nicht aufgetreten sind (z. B. leere Eingabe,
Groß-/Kleinschreibung bei Ja/Nein-Antworten).

</details>

---

## Eine kurze Review-Checkliste

```text
1. Fehlerbehandlung: Werden ungültige Eingaben abgefangen (InputMismatchException)?
2. Kapselung: Sind Attribute private, mit Gettern statt direktem Zugriff?
3. Namensgebung: Beschreiben Methoden-/Variablennamen klar ihren Zweck?
4. Duplizierter Code: Gibt es Textblöcke/Logik, die mehrfach vorkommen?
5. Rückgabewerte: Werden Sonderwerte (z. B. maxAttempts + 1) klar erklärt?
```

## Beispiel für eine gefundene Verbesserung

```java
// Vorher: Groß-/Kleinschreibung bei der Ja/Nein-Antwort nicht beachtet
playAgain = scanner.nextLine().equals("yes");

// Nachher: robuster gegen "Yes", "YES", Leerzeichen am Rand
playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
```

- `.trim()` entfernt versehentliche Leerzeichen am Rand der Eingabe.
- `.equalsIgnoreCase(...)` behandelt "yes", "Yes" und "YES" gleich.

**Checkpoint:** Du hast deinen Code gegen die Checkliste geprüft und
mindestens eine Stelle konkret verbessert.

Weiter geht es mit Lab 12.3: die fertige ZahlenJagd-Anwendung.
