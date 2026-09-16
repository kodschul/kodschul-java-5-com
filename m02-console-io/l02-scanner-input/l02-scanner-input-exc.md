# Lab 2.2 – Übung: Einlesen mit Scanner

**Dauer:** ca. 15 Minuten (kurze Übung, ändert noch nichts am Kursprojekt)

## Szenario

Du übst die Eingabe-Bausteine, die das Kursprojekt ZahlenJagd später braucht.

## Voraussetzungen

- Lab 2.2 Theorie
- `Scanner` importiert, eine Klasse `ScannerPractice` mit `main`-Methode

## Aufgaben

1. Lies einen Namen mit `nextLine()` ein und gib ihn aus.
2. Lies ein Alter mit `nextInt()` ein und gib es aus.
3. Lies direkt danach mit `nextLine()` einen Kommentar ein (z. B. "Wie geht es dir?"). Beobachte/beschreibe, was ohne Puffer-Fix passiert.
4. Behebe das Problem aus Aufgabe 3, indem du einen zusätzlichen `scanner.nextLine()` zum Leeren des Puffers einfügst.

## Checkpoint

Nach dem Fix liest dein Programm alle drei Werte (Name, Alter, Kommentar)
korrekt ein und gibt sie aus.

## Fertig, wenn

- alle drei Eingaben eingelesen und ausgegeben werden,
- der Puffer-Fix im Code vorhanden und als Kommentar begründet ist.

## Fallback

Falls die interaktive Eingabe im Trainingsraum nicht getestet werden kann,
reicht die korrekte, plausible Code-Struktur; das Verhalten wird anhand des
Codes besprochen statt live vorgeführt.
