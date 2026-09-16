# Lab 11.3 – Übung: Comparable-Interface für sortierbare Highscore-Einträge

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du löst das Textformat `"Name:Versuche"` aus Modul 8 durch eine echte
`Player`-Klasse ab, die über `Comparable` direkt sortierbar ist.

## Baseline

Ausgangspunkt ist die `HighscoreList`-Logik aus
`output/project/checkpoints/checkpoint-m08-arraylist/HighscoreList.java`.

## Voraussetzungen

- Lab 11.1 und 11.2 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `Player implements Comparable<Player>` mit `private final String name`, `private final int attempts`, einem Konstruktor sowie Gettern `getName()`/`getAttempts()`.
2. Implementiere `compareTo(Player otherPlayer)` mit `Integer.compare(this.attempts, otherPlayer.attempts)`.
3. Überschreibe `toString()` mit dem Format `"Name: X attempts"`.
4. Erstelle eine Klasse `HighscoreDemo` mit `main`-Methode: lege eine `ArrayList<Player>` mit mindestens vier Spielern an, sortiere sie mit `Collections.sort(...)` und gib sie aus.

## Checkpoint

Die ausgegebene Highscore-Liste ist aufsteigend nach Versuchsanzahl
sortiert, ohne dass an der Aufrufstelle eine eigene Vergleichslogik nötig
war.

## Fertig, wenn

- `Player` das Interface `Comparable<Player>` korrekt implementiert,
- `Collections.sort(highscores)` ohne zusätzliches Lambda funktioniert,
- die Ausgabe pro Spieler dem Format `"Name: X attempts"` entspricht.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m11-inheritance/{Player.java, HighscoreDemo.java}`.
