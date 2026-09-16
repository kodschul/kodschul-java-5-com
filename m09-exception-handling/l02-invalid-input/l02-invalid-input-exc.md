# Lab 9.2 – Übung: Ungültige Eingaben behandeln

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du liest wiederholt eine Zahl ein, bis eine gültige Eingabe erfolgt, und
fängst dabei nicht-numerische Eingaben ab.

## Baseline

Neue Klasse `InvalidInputHandling` (kein Bezug zu einer Checkpoint-Datei
nötig).

## Voraussetzungen

- Lab 9.1 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `InvalidInputHandling` mit `main`-Methode.
2. Lies in einer `while`-Schleife wiederholt eine Zahl per `Scanner.nextInt()` ein, bis eine gültige Zahl eingegeben wurde.
3. Fange `InputMismatchException` ab, gib "That wasn't a number. Please enter a whole number." aus und rufe `scanner.next()` auf.
4. Gib nach erfolgreicher Eingabe "You entered: X" aus.

## Checkpoint

Bei mehrfacher ungültiger Eingabe (z. B. Buchstaben) erscheint jedes Mal
die Fehlermeldung, ohne dass das Programm abstürzt oder hängen bleibt;
eine gültige Zahl beendet die Schleife korrekt.

## Fertig, wenn

- ungültige Eingaben beliebig oft wiederholt werden können, ohne Absturz,
- die Schleife bei einer gültigen Zahl korrekt endet,
- keine Endlosschleife aus Fehlermeldungen entsteht.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
