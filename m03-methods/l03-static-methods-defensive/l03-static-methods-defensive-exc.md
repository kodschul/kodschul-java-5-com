# Lab 3.3 – Übung: Statische Hilfsmethoden und defensive Programmierung

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig; wendet das Muster
auf einen ZahlenJagd-Ratewert an)

## Szenario

Du schreibst eine wiederverwendbare Hilfsmethode, die prüft, ob ein Wert in
einem erlaubten Bereich liegt, und wendest sie auf einen eingelesenen
ZahlenJagd-Ratewert an.

## Baseline

Neue Klasse `RangeCheck` (kein Bezug zu einer bestehenden Checkpoint-Datei
nötig).

## Voraussetzungen

- Lab 3.1 und 3.2 abgeschlossen (Methoden mit Parametern/Rückgabewert)

## Aufgaben

1. Erstelle eine Klasse `RangeCheck` mit `main`-Methode.
2. Schreibe `static boolean isInRange(int value, int min, int max)`, die
   `true` liefert, wenn `value` zwischen `min` und `max` (inklusive) liegt.
3. Lies in `main` einen `guess` per `Scanner` ein und rufe `isInRange(guess, 1, 100)` auf.
4. Gib je nach Ergebnis "Accepted: X" oder "Out of range: X (allowed: 1-100)" aus.
5. **Zusatz:** teste `isInRange` zusätzlich mit `min`/`max` vertauscht oder
   negativen Werten - was passiert, und ist das ein sinnvolles Verhalten?

## Checkpoint

Dein Programm meldet für Werte innerhalb und außerhalb von 1-100 die
jeweils passende Meldung, ohne abzustürzen.

## Fertig, wenn

- `isInRange` unabhängig von `main` wiederverwendbar ist (reine Parameter/Rückgabewert-Methode),
- beide Fälle (im Bereich / außerhalb) korrekt gemeldet werden,
- kein Sonderfall zum Absturz führt.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
