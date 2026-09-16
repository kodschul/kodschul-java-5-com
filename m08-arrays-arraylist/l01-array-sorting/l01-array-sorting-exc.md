# Lab 8.1 – Übung: Einfache Sortierung

**Dauer:** ca. 25 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du sortierst dasselbe Array einmal von Hand (Bubble Sort) und einmal mit
`Arrays.sort`.

## Baseline

Neue Klasse `ArraySorting` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Modul 7 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `ArraySorting` mit `main`-Methode.
2. Deklariere `int[] values = {42, 17, 73, 50, 8};` und sortiere sie mit einer selbst geschriebenen Bubble-Sort-Schleife.
3. Gib das sortierte Array aus (z. B. mit `Arrays.toString`).
4. Deklariere eine zweite, identische Kopie und sortiere sie stattdessen mit `Arrays.sort`.
5. Vergleiche beide Ergebnisse.

## Checkpoint

Beide Varianten liefern exakt dieselbe sortierte Reihenfolge:
`[8, 17, 42, 50, 73]`.

## Fertig, wenn

- die selbst geschriebene Sortierung korrekt aufsteigend sortiert,
- `Arrays.sort` dasselbe Ergebnis liefert,
- beide Ausgaben identisch sind.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
