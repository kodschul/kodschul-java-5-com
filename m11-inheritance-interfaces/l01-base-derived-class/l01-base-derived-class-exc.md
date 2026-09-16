# Lab 11.1 – Übung: Basisklasse und abgeleitete Klassen

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du erweiterst `GuessingGame` um einen variablen Zahlenbereich und leitest
zwei Schwierigkeitsgrade als Unterklassen ab.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m10-classes/GuessingGame.java`.

## Voraussetzungen

- Modul 10 abgeschlossen

## Aufgaben

1. Ändere den Konstruktor zu `GuessingGame(int upperBound, int maxAttempts)`; mache `upperBound` und `maxAttempts` zu `protected final`.
2. Passe die Zufallszahl-Erzeugung und die Ausgabetexte an, sodass `upperBound` statt der festen 100 verwendet wird.
3. Erstelle `EasyGuessingGame extends GuessingGame` mit einem parameterlosen Konstruktor, der `super(50, 12)` aufruft.
4. Erstelle `HardGuessingGame extends GuessingGame` mit einem parameterlosen Konstruktor, der `super(200, 6)` aufruft.
5. Teste beide Unterklassen mit je einem Durchlauf.

## Checkpoint

`new EasyGuessingGame().play(scanner)` verwendet den Bereich 1-50 mit bis
zu 12 Versuchen; `new HardGuessingGame().play(scanner)` verwendet den
Bereich 1-200 mit bis zu 6 Versuchen.

## Fertig, wenn

- `GuessingGame` einen variablen `upperBound` unterstützt,
- beide Unterklassen korrekt kompilieren und funktionieren,
- die Ausgabetexte den jeweils korrekten Zahlenbereich nennen.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m11-inheritance/{GuessingGame.java, EasyGuessingGame.java, HardGuessingGame.java}`.
