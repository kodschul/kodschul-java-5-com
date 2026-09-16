# Lab 7.3 – Übung: ZahlenJagd-Versuchshistorie auswerten

**Dauer:** ca. 25 Minuten (Transfer-Übung; ergänzt die Auswertung, ohne den
Projekt-Checkpoint dauerhaft zu ändern)

## Szenario

Du ergänzt `GuessingGame` aus Modul 6 um eine Auswertung der
Versuchshistorie: Durchschnitt, kleinster und größter Ratewert.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m06-arrays/GuessingGame.java`
(zur Orientierung kopieren).

## Voraussetzungen

- Lab 7.1 und 7.2 abgeschlossen

## Aufgaben

1. Kopiere `playRound()` aus dem m06-Checkpoint in eine eigene Testdatei.
2. Ergänze nach der Ausgabe der Versuchshistorie eine Berechnung von Summe, Durchschnitt, kleinstem und größtem Ratewert - basierend auf `attemptHistory` und `attemptCount`.
3. Gib "Average guess: X" und "Lowest guess: X, highest guess: Y" aus.

## Checkpoint

Für eine gespielte Runde mit mehreren Versuchen zeigt dein Programm
plausible Werte für Durchschnitt, Minimum und Maximum.

## Fertig, wenn

- die Auswertung nur die tatsächlich gemachten Versuche berücksichtigt
  (`attemptCount`, nicht die volle Array-Größe),
- der Durchschnitt als Kommazahl ausgegeben wird,
- Minimum und Maximum zu den tatsächlich eingegebenen Werten passen.

## Referenz

Diese Auswertung wird in Modul 8 durch eine sortierte Highscore-Liste
ergänzt; sie muss nicht in einer eigenen Checkpoint-Datei gespeichert
werden.
