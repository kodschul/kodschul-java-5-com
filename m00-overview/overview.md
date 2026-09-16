# ZahlenJagd – Java Grundlagen: Kursüberblick

## Kursziel

Am Ende des Kurses funktioniert **ZahlenJagd**, eine Konsolen-Ratespiel-
Anwendung, die Teilnehmer:innen über 5 Tage schrittweise selbst bauen: vom
ersten Skript über Methoden, Bedingungen, Schleifen und Arrays bis zu einer
objektorientierten Anwendung mit Schwierigkeitsgraden (Vererbung) und einer
sauber sortierten Highscore-Liste (`Comparable`).

**Beobachtbares Endergebnis:** ein lauffähiges Java-Konsolenprogramm, das

- eine Schwierigkeitsstufe (leicht/schwer) abfragt,
- beliebig oft ein Zahlen-Ratespiel mit Fehlerbehandlung spielt,
- Namen und Versuchsanzahl in einer Highscore-Liste sammelt,
- diese Liste am Ende korrekt sortiert ausgibt.

## Zielgruppe und Voraussetzungen

- Anwendungsentwickler:innen und Umsteiger:innen ohne Java-Vorkenntnisse.
- Grundlegende Computerkenntnisse vorausgesetzt, keine Programmiererfahrung
  nötig.
- Max. 10 Teilnehmer:innen pro Durchführung.
- Eclipse oder IntelliJ IDEA installiert und lauffähig (JDK vorab geprüft).
- Keine externen Bibliotheken/Frameworks nötig - nur JDK-Standardbibliothek.

## Vollständige Agenda (5 Tage, je 09:00-16:30, Tag 5 bis ca. 15:00)

Zeitraster pro Tag: 09:00-10:30, Pause, 10:45-12:15, Mittagspause,
13:15-14:45, Pause, 15:00-16:30.

### Tag 1 – Basics, Ein-/Ausgabe & erste Methode

- 09:00-09:20 Vorstellung & Setup-Check
- 09:20-10:30 **Modul 1: Primitive Datentypen, Variablen und Strings** (`m01-primitives-strings`)
- 10:45-12:15 **Modul 2: Konsolen-Ein-/Ausgabe** (`m02-console-io`)
- 13:15-14:45 **Modul 3: Methoden (Funktionen)** (`m03-methods`) - ZahlenJagd startet als Methode
- 15:00-16:30 Vertiefung & Puffer

### Tag 2 – Bedingungen & Schleifen (am Projekt)

- 09:00-10:30 **Modul 4: Bedingungen** (`m04-conditionals`)
- 10:45-12:15 **Modul 5: Schleifen** (`m05-loops`)
- 13:15-14:45 **Modul 6: Arrays einführen** (`m06-arrays-intro`)
- 15:00-16:30 Vertiefung & Puffer - Zwischenstand: Bedingungen, Schleifen, erstes Array

### Tag 3 – Arrays vertiefen: Iteration & Algorithmen

- 09:00-10:30 **Modul 7: Arrays und Schleifen kombinieren** (`m07-arrays-iteration`)
- 10:45-12:15 **Modul 8: Array-Algorithmen und ArrayList** (`m08-arrays-arraylist`)
- 13:15-14:45 **Modul 9: Fehler abfangen** (`m09-exception-handling`)
- 15:00-16:30 Vertiefung & Puffer

### Tag 4 – Klassen, Objekte & Vererbung

- 09:00-10:30 **Modul 10: Klassen, Objekte und Kapselung** (`m10-classes-encapsulation`)
- 10:45-12:15 **Modul 11: Vererbung und Interfaces** (`m11-inheritance-interfaces`)
- 13:15-16:30 Vertiefung/Puffer - Vorbereitung der finalen Version für Tag 5

### Tag 5 – Finale Version & Projektabschluss

- 09:00-10:30 **Modul 12: Projektabschluss** (`m12-project-wrapup`) - finale `GuessingGameApp`
- 10:45-12:15 Präsentation & Vertiefung - Teilnehmer:innen stellen ihre Version vor
- 13:15-14:45 Puffer / Zusatzthemen (optional: Ausblick auf Interfaces/Collections für Folgekurse)
- 15:00-16:00 Rückblick auf das Gesamtprojekt
- 16:00-16:30 Feedback & Abschluss

## Modul- und Projektstruktur

- 12 Module, durchnummeriert über den ganzen Kurs (nicht pro Tag neu).
- Jedes Modul hat 3 Labs (`lNN-<slug>`), je mit `-thx.md` (Theorie),
  `-exc.md` (Übung) und `-sol.md` (Lösung).
- Durchgehendes Projekt **ZahlenJagd**: wächst von einer einzelnen Methode
  (Modul 3) über Bedingungen/Schleifen/Arrays (Module 4-8), Fehlerbehandlung
  (Modul 9), Klassen/Kapselung (Modul 10) bis zu Vererbung und
  `Comparable`-Sortierung (Modul 11) und der finalen Anwendung (Modul 12).
- Projekt-Zwischenstände liegen als Checkpoints in
  `output/project/checkpoints/checkpoint-mNN-<thema>/`.

## Arbeitsweise und Übungskonvention

- Jedes Lab folgt demselben Muster: Lab-Ziel und Leitfragen (`-thx.md`) →
  konkrete Aufgaben mit Checkpoint (`-exc.md`) → vollständige, begründete
  Lösung (`-sol.md`).
- Referenzlösungen sind eigene Musterlösungen, nicht die offizielle Lösung
  aus `solutions.zip`.
- Projekt-Labs bauen exakt auf dem jeweils letzten Checkpoint auf; die
  erwartete Lösung wird immer gegen die entsprechende Checkpoint-Datei
  geprüft.

## Umgebung und Sicherheit

- Nur JDK-Standardbibliothek und Konsolen-I/O (`System.out`, `Scanner`) -
  nichts zusätzlich zu installieren außer JDK und IDE.
- Kein Netzwerk-/Internetzugriff im Code nötig.
- Zufallszahlen ausschließlich über `Math.random()` (kein Sicherheitsbezug).

## Vorstellungsrunde (Folie)

Zu Kursbeginn stellt sich jede:r kurz vor:

- Name und Rolle
- Beruflicher Hintergrund und Weg in den Beruf
- Organisation und Zugehörigkeitsdauer
- Optional: Stadt/Region und aktuelles Wetter vor Ort
- Bisherige Erfahrung mit dem Kursthema (Java)
- Erwartungen an den Kurs
- Ein konkretes Anwendungsszenario, das dich interessiert

Persönliche Angaben sind optional und können übersprungen werden.
