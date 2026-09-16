# Lab 2.3 – Übung: Das erste Ein-/Ausgabe-Programm

**Dauer:** ca. 20 Minuten (Projekt-Lab, legt den Ausgangszustand für Modul 3 fest)

## Szenario

Du baust das Programm, das als `starter/ConsoleInputOutput.java` die
Grundlage für das Kursprojekt ZahlenJagd bildet.

## Baseline

Vor diesem Lab existiert noch kein Projektcode - du startest mit einer
leeren Klasse.

## Voraussetzungen

- Lab 2.1 und 2.2 abgeschlossen
- `Scanner` importiert

## Aufgaben

1. Erstelle eine Klasse `ConsoleInputOutput` mit `main`-Methode.
2. Lies Name (`nextLine()`) und Alter (`nextInt()`) über `Scanner` ein.
3. Gib eine formatierte Begrüßung mit `printf` aus, die Name und Alter enthält.
4. Achte auf die Reihenfolge `nextLine()` vor `nextInt()` oder erkläre, warum in diesem Fall kein Puffer-Fix nötig ist.

## Checkpoint

Dein Programm läuft durch: Name und Alter werden korrekt eingelesen und in
einer formatierten Zeile ausgegeben.

## Fertig, wenn

- die Klasse `ConsoleInputOutput` genau diese drei Schritte enthält,
- die Ausgabe Name und Alter in einem Satz kombiniert,
- du erklären kannst, wie dieser Code ab Modul 3 erweitert wird.

## Referenz

Der erwartete Endstand liegt in `output/project/starter/ConsoleInputOutput.java`.
