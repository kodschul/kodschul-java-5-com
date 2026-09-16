# Lab 9.3 – Übung: Nicht-Zahl-Eingaben bei ZahlenJagd abfangen

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du machst `GuessingGame` robust gegen nicht-numerische Eingaben, ohne dass
ein fehlgeschlagener Leseversuch als Versuch zählt.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m08-arraylist/GuessingGame.java`.

## Voraussetzungen

- Lab 9.1 und 9.2 abgeschlossen

## Aufgaben

1. Ersetze die `for`-Schleife durch eine `while (attempt <= maxAttempts)`-Schleife mit manuellem Zähler `attempt`.
2. Umschließe das Einlesen und Auswerten mit `try { ... } catch (InputMismatchException e) { ... }`.
3. Erhöhe `attempt` nur im `try`-Block nach erfolgreichem Lesen, nicht im `catch`-Block.
4. Rufe im `catch`-Block `scanner.next()` auf und gib "That wasn't a number. Please enter a whole number." aus.

## Checkpoint

Eine ungültige Eingabe (z. B. Buchstaben) führt zu einer Fehlermeldung,
ohne dass ein Versuch verbraucht wird; das Spiel funktioniert danach wie
gewohnt weiter.

## Fertig, wenn

- ungültige Eingaben beliebig oft wiederholt werden können,
- `attempt` bei einer ungültigen Eingabe nicht erhöht wird,
- das Spiel bei gültigen Eingaben wie bisher funktioniert (richtig/zu
  hoch/zu niedrig, maximal `maxAttempts` gezählte Versuche).

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m09-exceptions/GuessingGame.java`.
