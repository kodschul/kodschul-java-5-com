# Lab 7.1 – Übung: for/for-each über ein Array

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du übst beide Iterationsarten an derselben Datenmenge.

## Baseline

Neue Klasse `ArrayIteration` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Modul 6 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `ArrayIteration` mit `main`-Methode.
2. Deklariere `int[] attemptHistory = {42, 17, 73, 50, 8};`.
3. Gib mit einer `for`-Schleife (Index) jeden Wert zusammen mit seiner Versuchsnummer (beginnend bei 1) aus.
4. Gib danach mit einer `for-each`-Schleife nur die reinen Werte aus.
5. **Zusatz:** zähle mit `for-each`, wie viele Werte größer als 40 sind.

## Checkpoint

Beide Ausgaben zeigen dieselben fünf Werte, einmal mit und einmal ohne
Versuchsnummer.

## Fertig, wenn

- die indexbasierte Ausgabe die korrekte Versuchsnummer zeigt,
- die `for-each`-Ausgabe alle Werte ohne Index zeigt,
- die Zusatzaufgabe korrekt 3 zählt (42, 73, 50).

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
