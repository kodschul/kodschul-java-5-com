# Lab 11.2 – Übung: Methoden mit @Override anpassen

**Dauer:** ca. 20 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du überschreibst `toString()` in `GuessingGame`, `EasyGuessingGame` und
`HardGuessingGame`, sodass jede Klasse eine eigene, unterscheidbare
Ausgabe liefert.

## Baseline

Weiterentwicklung von `GuessingGame`, `EasyGuessingGame` und
`HardGuessingGame` aus Lab 11.1.

## Voraussetzungen

- Lab 11.1 abgeschlossen

## Aufgaben

1. Überschreibe `toString()` in `GuessingGame` mit `@Override`, das den Klassennamen sowie `upperBound` und `maxAttempts` ausgibt.
2. Überschreibe `toString()` ebenso in `EasyGuessingGame` und `HardGuessingGame`, jeweils mit dem eigenen Klassennamen im Text.
3. Erzeuge in einer kleinen Test-`main`-Methode je ein Objekt jeder Klasse und gib sie direkt mit `System.out.println(...)` aus.

## Checkpoint

Jede der drei Klassen gibt bei `System.out.println(...)` einen Text mit
ihrem eigenen Klassennamen aus, nicht den der Basisklasse.

## Fertig, wenn

- alle drei `toString()`-Overrides mit `@Override` markiert sind,
- jede Ausgabe den korrekten Klassennamen enthält,
- `upperBound` und `maxAttempts` korrekt im Text erscheinen.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m11-inheritance/{GuessingGame.java, EasyGuessingGame.java, HardGuessingGame.java}`.
