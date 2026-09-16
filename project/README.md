# Kursprojekt: ZahlenJagd

ZahlenJagd ist das durchgehende Projekt des Kurses "Java Grundlagen" (5 Tage,
12 Module). Ein Zahlen-Ratespiel wächst mit jedem Modul mit: vom
Ein-Methoden-Skript bis zur objektorientierten Konsolenanwendung mit
Schwierigkeitsgraden und sortierter Highscore-Liste.

## Ordnerstruktur

- `starter/` – Ausgangszustand vor Modul 3 (nur Datentypen/Konsolen-I/O, noch
  kein ZahlenJagd-Code).
- `checkpoints/` – ein Ordner pro Meilenstein, jeweils der vollständige,
  lauffähige Stand von ZahlenJagd nach dem genannten Modul. Wer ein Modul
  verpasst oder nicht fertig wird, kann ab dem passenden Checkpoint
  weiterarbeiten.

Code (Klassen-/Variablennamen, Kommentare, Konsolentexte) ist durchgängig auf
Englisch geschrieben; nur die Kurs-Markdown-Inhalte (Titel, Erklärungen,
Übungstexte) bleiben Deutsch. Die Hauptklasse heißt im Code `GuessingGame`
(prozedural in M3-M9, als Klasse ab M10) bzw. `GuessingGameApp` (finale App
in M12); die deutsche Kursbezeichnung "ZahlenJagd" bleibt der Name des
Projekts in der Kurskommunikation.

## Checkpoints im Überblick

| Checkpoint                   | Nach Modul | Neuer Stand                                                                                                                                              |
| ---------------------------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `checkpoint-m03-methods`     | Modul 3    | `GuessingGame` als einzelne Methode: Zufallszahl erzeugen, einen Ratewert per `Scanner` prüfen.                                                          |
| `checkpoint-m05-loops`       | Modul 5    | Bedingungen werten den Ratewert aus (richtig/zu hoch/zu niedrig); eine Schleife erlaubt mehrere Versuche.                                                |
| `checkpoint-m06-arrays`      | Modul 6    | Jeder Rateversuch wird zusätzlich in einem Array gespeichert.                                                                                            |
| `checkpoint-m08-arraylist`   | Modul 8    | `HighscoreList` zunächst im Array sortiert, dann in eine `ArrayList<String>` überführt.                                                                  |
| `checkpoint-m09-exceptions`  | Modul 9    | Ungültige (nicht-numerische) Eingaben werden über `try-catch` abgefangen.                                                                                |
| `checkpoint-m10-classes`     | Modul 10   | Die komplette Logik steckt in einer Klasse `GuessingGame` mit Konstruktor und gekapselten Attributen.                                                    |
| `checkpoint-m11-inheritance` | Modul 11   | Schwierigkeitsgrade als Unterklassen (`EasyGuessingGame`, `HardGuessingGame`); Highscore-Liste ist eine `ArrayList<Player>`, sortiert über `Comparable`. |
| `checkpoint-m12-final`       | Modul 12   | Fertige Anwendung `GuessingGameApp`: Schwierigkeitsgrad wählen, mehrere Versuche, sortierte Highscore-Liste, Fehlerbehandlung.                           |

Jeder Checkpoint ist eigenständig kompilierbar. Labs verlinken nur die
Checkpoints, die sie tatsächlich brauchen (den eigenen Startzustand und den
Zielzustand); nicht jede Kurzübung nimmt Bezug auf das Projekt.
