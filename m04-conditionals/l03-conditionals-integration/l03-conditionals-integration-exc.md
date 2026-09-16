# Lab 4.3 – Übung: ZahlenJagd-Auswertung und Schwierigkeitsgrad

**Dauer:** ca. 25 Minuten (Transfer-Übung, kombiniert Lab 4.1 und 4.2; ändert
den Projekt-Checkpoint noch nicht)

## Szenario

Du baust ein einziges Programm, das zuerst einen Schwierigkeitsgrad per
`switch` wählen lässt und danach einen Ratewert mit einer if/else-Kette in
drei Fällen auswertet.

## Baseline

Neue Klasse `GuessEvaluation` (Weiterentwicklung aus Lab 4.1, ergänzt um die
Schwierigkeitsgrad-Auswahl aus Lab 4.2).

## Voraussetzungen

- Lab 4.1 und 4.2 abgeschlossen

## Aufgaben

1. Frage zuerst den Schwierigkeitsgrad ab ("1 = easy, 2 = hard") und wähle per `switch` ein Label (`"easy"`/`"hard"`/`"medium"`).
2. Gib das gewählte Label aus.
3. Erzeuge danach eine Zufallszahl zwischen 1 und 100 und lies einen Ratewert per `Scanner` ein.
4. Werte den Ratewert mit einer if/else-Kette in drei Fällen aus: richtig, zu niedrig, zu hoch.

## Checkpoint

Für jede Kombination aus Schwierigkeitsgrad-Eingabe und Ratewert gibt dein
Programm zuerst das Label, danach die passende Ratewert-Meldung aus.

## Fertig, wenn

- beide Bausteine (switch und if/else-Kette) im selben Programm vorkommen,
- die Reihenfolge (erst Schwierigkeitsgrad, dann Ratewert) eingehalten wird,
- kein Fall aus Lab 4.1/4.2 verloren geht.

## Referenz

Der Zahlenbereich bleibt hier noch unabhängig vom Schwierigkeitsgrad; die
echte Kopplung entsteht erst in
`output/project/checkpoints/checkpoint-m11-inheritance/`.
