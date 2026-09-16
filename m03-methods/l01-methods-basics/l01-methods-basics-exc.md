# Lab 3.1 – Übung: Warum Methoden? Parameter, Rückgabewert

**Dauer:** ca. 15 Minuten (kurze Übung, ändert noch nichts am Kursprojekt)

## Szenario

Du übst das Schreiben eigener Methoden, bevor du sie auf ZahlenJagd anwendest.

## Voraussetzungen

- Lab 3.1 Theorie
- Eine Klasse `MethodPractice` mit `main`-Methode

## Aufgaben

1. Schreibe eine Methode `static int square(int number)`, die die Quadratzahl zurückgibt.
2. Schreibe eine Methode `static void printSeparator()`, die eine Trennlinie aus 20 Bindestrichen ausgibt (`void`, kein Rückgabewert).
3. Rufe beide Methoden aus `main` auf und gib das Ergebnis von `square(6)` aus.
4. Ergänze eine Methode `static int max(int a, int b)`, die den größeren der beiden Werte zurückgibt (ohne `Math.max`).

## Checkpoint

Dein Programm gibt die Trennlinie, das Quadrat von 6 (`36`) und das Ergebnis
von `max(4, 9)` (`9`) aus.

## Fertig, wenn

- alle drei Methoden vorhanden sind und aus `main` aufgerufen werden,
- keine Methode mit Rückgabewert ohne `return` endet.

## Erweiterung (optional)

Schreibe eine Methode `static int min(int a, int b, int c)` für drei Werte.
