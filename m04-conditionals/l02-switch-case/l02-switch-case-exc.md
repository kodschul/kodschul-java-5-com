# Lab 4.2 – Übung: switch-case für Mehrfachauswahl

**Dauer:** ca. 20 Minuten (kurze Übung; Vorstufe zur späteren Schwierigkeitsgrad-Auswahl in Modul 11/12)

## Szenario

Du liest einen Schwierigkeitsgrad als Text ein und wählst mit `switch` ein
passendes Label.

## Baseline

Neue Klasse `DifficultySelector` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Lab 4.1 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `DifficultySelector` mit `main`-Methode.
2. Lies mit `Scanner` einen Text ein: "Choose difficulty - 1 = easy, 2 = hard: ".
3. Wähle mit einem `switch`-Ausdruck ein Label: `"1"` -> `"easy"`, `"2"` -> `"hard"`, alles andere -> `"medium"`.
4. Gib "Difficulty: X" mit dem gewählten Label aus.
5. **Zusatz:** ergänze einen weiteren Fall `"3"` -> `"expert"`.

## Checkpoint

Für die drei Eingaben `1`, `2` und einen beliebigen anderen Text liefert
dein Programm jeweils das korrekte Label.

## Fertig, wenn

- alle drei genannten Fälle korrekt behandelt werden,
- `default` jeden nicht abgedeckten Fall auffängt,
- kein `break` fehlt/nötig ist (Pfeil-Syntax verwendet).

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig und bereitet
die Schwierigkeitsgrad-Auswahl aus Modul 12 vor.
