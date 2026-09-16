# Lab 10.3 – Übung: ZahlenJagd-Logik in eine Klasse umbauen

**Dauer:** ca. 35 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du baust die statische Methodenlogik aus Modul 9 in eine Klasse
`GuessingGame` mit Konstruktor und gekapselten Attributen um.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m09-exceptions/GuessingGame.java`.

## Voraussetzungen

- Lab 10.1 und 10.2 abgeschlossen

## Aufgaben

1. Ergänze `private final int targetNumber`, `private final int maxAttempts` und `private int attemptsNeeded`.
2. Schreibe einen Konstruktor `GuessingGame(int maxAttempts)`, der `targetNumber` per Zufall erzeugt und `maxAttempts` übernimmt.
3. Baue die bisherige `playRound()`-Logik in eine nicht-statische Methode `public int play(Scanner scanner)` um, die `attemptsNeeded` setzt und zurückgibt.
4. Ergänze `public int getAttemptsNeeded()`.
5. Passe `main` an: erzeuge ein `GuessingGame`-Objekt und rufe `play(scanner)` darauf auf.

## Checkpoint

Dein Spiel verhält sich identisch zu Modul 9 (Fehlerbehandlung,
richtig/zu hoch/zu niedrig, Versuchsobergrenze), jetzt aber objektbasiert.

## Fertig, wenn

- `targetNumber` und `maxAttempts` `private final` sind,
- `play(scanner)` dieselbe Logik wie zuvor `playRound()` ausführt,
- `main` ein `GuessingGame`-Objekt erzeugt statt eine statische Methode
  direkt aufzurufen.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m10-classes/GuessingGame.java`.
