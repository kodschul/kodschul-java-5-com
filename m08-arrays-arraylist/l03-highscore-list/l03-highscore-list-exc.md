# Lab 8.3 – Übung: Highscore-Liste (Array, dann ArrayList)

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du änderst `GuessingGame` so, dass die Versuchsanzahl zurückgegeben wird,
und baust eine Highscore-Liste zunächst mit einem Array, dann mit einer
`ArrayList<String>`.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m06-arrays/GuessingGame.java`.

## Voraussetzungen

- Lab 8.1 und 8.2 abgeschlossen

## Aufgaben

1. Ändere `playRound()` zu `static int playRound()`: gib bei einem Treffer `attempt`, sonst `maxAttempts + 1` zurück.
2. Gib in `main` "Attempts needed: X" mit dem Rückgabewert aus.
3. Erstelle eine Klasse `HighscoreList` mit einem `String[] highscoreArray` (4 Einträge im Format `"Name:Versuche"`), sortiert mit `Arrays.sort` und einem Lambda-Vergleich nach Versuchsanzahl.
4. Erstelle danach eine `ArrayList<String> highscoreList` mit denselben und mindestens einem weiteren Eintrag, sortiert mit `.sort(...)`.
5. Schreibe eine Hilfsmethode `static int attempts(String entry)`, die die Versuchsanzahl aus dem Eintrag extrahiert.

## Checkpoint

Beide Listen werden nach Versuchsanzahl aufsteigend sortiert ausgegeben;
die ArrayList enthält mindestens einen Eintrag mehr als das Array.

## Fertig, wenn

- `playRound()` einen `int`-Wert zurückgibt statt nur auszugeben,
- beide Sortierungen (Array und ArrayList) dasselbe Sortierkriterium
  verwenden,
- `attempts(...)` korrekt aus dem Textformat extrahiert.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m08-arraylist/GuessingGame.java`
und
`output/project/checkpoints/checkpoint-m08-arraylist/HighscoreList.java`.
