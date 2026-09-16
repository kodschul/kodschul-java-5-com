# Lab 12.1 – Übung: Alle Bausteine zusammenführen

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du ergänzt eine Schwierigkeitsauswahl, die zu Beginn des Programms
entscheidet, ob `EasyGuessingGame` oder `HardGuessingGame` gespielt wird.

## Baseline

Ausgangspunkt sind
`output/project/checkpoints/checkpoint-m11-inheritance/{GuessingGame.java, EasyGuessingGame.java, HardGuessingGame.java}`.

## Voraussetzungen

- Modul 11 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `GuessingGameApp` mit `main`-Methode.
2. Schreibe eine private statische Methode `chooseDifficulty(Scanner scanner)`, die per `switch` auf die Eingabe "2" mit `HardGuessingGame`, sonst mit `EasyGuessingGame` reagiert.
3. Rufe in `main` `chooseDifficulty(scanner)` auf, spiele die Runde mit `.play(scanner)` und gib die benötigten Versuche aus.
4. Teste beide Eingaben ("1" bzw. "2") sowie eine ungültige Eingabe (z. B. leere Zeile).

## Checkpoint

Eingabe "2" führt zu einem `HardGuessingGame` (Bereich 1-200, 6 Versuche),
jede andere Eingabe zu einem `EasyGuessingGame` (Bereich 1-50, 12
Versuche).

## Fertig, wenn

- `chooseDifficulty` beide Schwierigkeitsgrade korrekt zurückgibt,
- eine ungültige/leere Eingabe nicht zum Absturz führt, sondern zu "easy",
- die Ausgabe der benötigten Versuche funktioniert.

## Referenz

Kein separater Checkpoint für dieses Lab; der Endstand fließt in
`output/project/checkpoints/checkpoint-m12-final/GuessingGameApp.java` ein.
