# Lab 6.3 – Übung: Jeden Rateversuch in ein Array schreiben

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du erweiterst `GuessingGame` aus Modul 5 so, dass jeder Rateversuch
zusätzlich in einem Array gespeichert wird.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m05-loops/GuessingGame.java`.

## Voraussetzungen

- Lab 6.1 und 6.2 abgeschlossen

## Aufgaben

1. Ergänze `int[] attemptHistory = new int[maxAttempts]` und `int attemptCount = 0`.
2. Speichere in jedem Schleifendurchlauf den aktuellen `guess` in `attemptHistory[attemptCount]` und erhöhe `attemptCount`.
3. Ersetze das `return` beim Treffer durch `break`, damit die Versuchshistorie danach noch ausgegeben wird.
4. Gib nach der Schleife "Your guesses: " gefolgt von allen gespeicherten Versuchen aus (nur bis `attemptCount`, nicht bis zur vollen Array-Größe).

## Checkpoint

Nach einem abgeschlossenen Spiel (egal ob getroffen oder Versuche
aufgebraucht) zeigt dein Programm genau die tatsächlich gemachten Versuche
in der richtigen Reihenfolge.

## Fertig, wenn

- die Anzahl ausgegebener Versuche exakt `attemptCount` entspricht,
- kein ungenutzter (auf 0 initialisierter) Array-Platz mit ausgegeben wird,
- die Reihenfolge der Ausgabe der Reihenfolge der tatsächlichen Versuche
  entspricht.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m06-arrays/GuessingGame.java`.
