# Lab 6.1 – Übung: Warum ein Array? Deklaration und Zugriff

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du übst die Grundlagen von Arrays: deklarieren, befüllen, per Index
auslesen.

## Baseline

Neue Klasse `ArrayBasics` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Modul 5 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `ArrayBasics` mit `main`-Methode.
2. Deklariere `int[] scores = new int[5];`.
3. Setze die Werte an Index 0 bis 4 auf 10, 20, 30, 40, 50.
4. Gib das Element an Index 2 sowie `scores.length` aus.
5. **Zusatz:** versuche absichtlich `scores[5]` zu lesen und notiere, welche Ausnahme auftritt.

## Checkpoint

Die Ausgabe zeigt den Wert an Index 2 (30) und die Länge des Arrays (5).

## Fertig, wenn

- alle fünf Elemente korrekt gesetzt sind,
- der Zugriff über einen gültigen Index funktioniert,
- die Zusatzaufgabe die `ArrayIndexOutOfBoundsException` beobachtet (nicht
  abgefangen werden muss).

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
