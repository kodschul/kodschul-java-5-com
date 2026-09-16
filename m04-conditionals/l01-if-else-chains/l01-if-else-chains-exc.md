# Lab 4.1 – Übung: if/else-Ketten

**Dauer:** ca. 20 Minuten (kurze Übung; erweitert die ZahlenJagd-Auswertung
aus Lab 3.2, ohne den Projekt-Checkpoint zu ändern)

## Szenario

Du erweiterst die einfache richtig/falsch-Prüfung aus Lab 3.2 um eine
Drei-Fälle-Auswertung: richtig, zu niedrig, zu hoch.

## Baseline

Ausgangspunkt ist der Code aus
`output/project/checkpoints/checkpoint-m03-methods/GuessingGame.java`
(nur zur Orientierung kopieren, nicht die Checkpoint-Datei selbst ändern).

## Voraussetzungen

- Modul 3 abgeschlossen

## Aufgaben

1. Kopiere `playRound()` aus dem m03-Checkpoint in eine eigene Testdatei.
2. Ersetze die `if`/`else`-Prüfung durch eine `if`/`else if`/`else`-Kette
   mit drei Fällen: richtig, zu niedrig, zu hoch.
3. Gib je Fall "Correct! The number was X.", "Too low." bzw. "Too high." aus.
4. Teste dein Programm mehrfach, bis alle drei Fälle einmal aufgetreten sind.

## Checkpoint

Für drei unterschiedliche Testwerte gibt dein Programm jeweils die korrekte
der drei Meldungen aus.

## Fertig, wenn

- alle drei Fälle durch die Kette abgedeckt sind,
- kein Fall doppelt gemeldet wird,
- die Reihenfolge der Bedingungen den Gleichheitsfall zuerst prüft.

## Referenz

Die vollständige, dauerhafte Version dieser Logik (mit Schleife für mehrere
Versuche) entsteht in Modul 5 und liegt danach in
`output/project/checkpoints/checkpoint-m05-loops/GuessingGame.java`.
