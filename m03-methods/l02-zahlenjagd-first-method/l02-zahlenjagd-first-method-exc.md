# Lab 3.2 – Übung: ZahlenJagd als Methode

**Dauer:** ca. 25 Minuten (Projekt-Lab, legt die erste ZahlenJagd-Methode an)

## Szenario

Du baust `ConsoleInputOutput` aus Modul 2 zur ersten Version von ZahlenJagd
um: einer Klasse `GuessingGame` mit einer Methode `playRound()`.

## Baseline

Ausgangspunkt ist `output/project/starter/ConsoleInputOutput.java`.

## Voraussetzungen

- Lab 3.1 abgeschlossen
- `Math.random()` bekannt (siehe Theorie)

## Aufgaben

1. Erstelle eine Klasse `GuessingGame` mit `main`-Methode, die nur `playRound();` aufruft.
2. Schreibe die Methode `static void playRound()`: erzeuge `targetNumber` als Zufallszahl zwischen 1 und 100.
3. Lies einen `guess` per `Scanner` ein und prüfe `guess == targetNumber`.
4. Gib je nach Ergebnis "Correct! The number was X." oder "Wrong. The number was X." aus.

## Checkpoint

Dein Programm läuft mehrfach hintereinander mit unterschiedlichen
Zufallszahlen durch und meldet Treffer bzw. Fehltreffer korrekt.

## Fertig, wenn

- die Zufallszahl bei jedem Start neu berechnet wird,
- `playRound()` als eigenständige Methode existiert und aus `main` aufgerufen wird,
- die Ausgabe die Zahl in beiden Fällen nennt.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m03-methods/GuessingGame.java`.
