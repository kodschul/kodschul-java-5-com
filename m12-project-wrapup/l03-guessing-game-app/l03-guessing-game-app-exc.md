# Lab 12.3 – Übung: Die fertige ZahlenJagd-Anwendung

**Dauer:** ca. 40 Minuten (Projekt-Lab, letzter ZahlenJagd-Checkpoint)

## Szenario

Du machst aus deinem Code aus Lab 12.1/12.2 die fertige ZahlenJagd-Anwendung:
Schwierigkeitsgrad wählen, beliebig oft spielen, Highscore-Liste am Ende.

## Baseline

Ausgangspunkt ist `GuessingGameApp` aus Lab 12.2 sowie
`output/project/checkpoints/checkpoint-m11-inheritance/Player.java`.

## Voraussetzungen

- Lab 12.1 und 12.2 abgeschlossen

## Aufgaben

1. Lege `ArrayList<Player> highscores` vor der Spielschleife an.
2. Baue eine `while (playAgain)`-Schleife: Name abfragen, `chooseDifficulty(scanner)` aufrufen, Runde spielen, Ergebnis als `Player` zur Liste hinzufügen.
3. Frage am Ende jeder Runde erneut "Play again? (yes/no): " ab und steuere damit `playAgain`.
4. Sortiere nach der Schleife die Highscore-Liste mit `Collections.sort(highscores)` und gib sie vollständig aus.
5. Spiele mindestens drei Runden mit unterschiedlichen Namen/Schwierigkeitsgraden und prüfe die abschließende Sortierung.

## Checkpoint

Nach mehreren gespielten Runden zeigt die abschließende Highscore-Liste
alle Spieler aufsteigend nach Versuchsanzahl sortiert.

## Fertig, wenn

- beliebig viele Runden hintereinander spielbar sind,
- jede Runde korrekt als `Player`-Eintrag in der Liste landet,
- die finale Ausgabe korrekt sortiert ist,
- ungültige Eingaben während einer Runde weiterhin abgefangen werden
  (geerbt aus Modul 9).

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m12-final/{GuessingGame.java, GuessingGameApp.java, EasyGuessingGame.java, HardGuessingGame.java, Player.java}`.
