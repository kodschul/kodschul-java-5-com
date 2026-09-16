# Lab 10.1 – Übung: Klassen, Attribute, Konstruktoren

**Dauer:** ca. 25 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du modellierst einen einfachen Spieler mit Name und Versuchsanzahl als
eigene Klasse.

## Baseline

Neue Klassen `Player` und `PlayerDemo` (kein Bezug zu einer Checkpoint-Datei
nötig).

## Voraussetzungen

- Modul 9 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `Player` mit den Attributen `String name` und `int attempts`.
2. Schreibe einen Konstruktor `Player(String name, int attempts)`, der beide Attribute setzt.
3. Erstelle eine Klasse `PlayerDemo` mit `main`-Methode, die mindestens drei `Player`-Objekte mit unterschiedlichen Werten erzeugt.
4. Gib für jedes Objekt Name und Versuchsanzahl aus.
5. **Zusatz:** ergänze eine weitere Klasse-Methode `boolean hasMoreAttemptsThan(Player other)`, die zwei Spieler vergleicht.

## Checkpoint

Alle drei erzeugten Objekte behalten ihre eigenen, unabhängigen Werte.

## Fertig, wenn

- mindestens drei unabhängige `Player`-Objekte existieren,
- jedes Objekt seine individuellen Werte korrekt ausgibt,
- die Zusatzmethode einen plausiblen Vergleich liefert.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
