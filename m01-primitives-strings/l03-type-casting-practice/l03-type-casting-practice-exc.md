# Lab 1.3 – Übung: Typumwandlung und kombinierte Übung

## Szenario

Ein Textbaustein liefert Messwerte als String. Du wandelst sie in Zahlen um,
rechnest damit und gibst ein zusammengesetztes Ergebnis aus. Diese Übung
ist projektunabhängig und verändert die spätere ZahlenJagd-Basis nicht.

## Zielartefakt

Eine Klasse `TypUmwandlung.java`, die Text in Zahlen umwandelt, damit rechnet
und einen kombinierten Ausgabetext erzeugt.

## Dauer

15 Minuten.

## Voraussetzungen

Lab 1.1 und 1.2 abgeschlossen.

## Aufgaben

1. Lege eine Klasse `TypUmwandlung` mit `main`-Methode an.
2. Deklariere `String eingabeVersuche = "7";` und `String eingabeMittelwert = "4.5";`.
3. Wandle `eingabeVersuche` mit `Integer.parseInt` in einen `int` namens
   `versuche` um.
4. Wandle `eingabeMittelwert` mit `Double.parseDouble` in einen `double`
   namens `mittelwert` um.
5. Berechne `int gerundeterMittelwert = (int) mittelwert;` (Cast, kein
   Runden).
6. Baue einen Ausgabetext: `"Versuche: " + versuche + ", Mittelwert: " + mittelwert + " (gerundet abgeschnitten: " + gerundeterMittelwert + ")"`.
7. Gib den Text aus.

## Checkpoint

- Konsole zeigt: `Versuche: 7, Mittelwert: 4.5 (gerundet abgeschnitten: 4)`.

## Abschlusskriterien

- Beide Umwandlungen (`String` → `int`/`double`) nutzen die passende
  `parse*`-Methode, keine manuellen Zahlenliterale statt der Variablen.
- Der Cast `(int) mittelwert` ist explizit im Code sichtbar.

## Erweiterung (optional)

Ändere `eingabeMittelwert` auf einen ungültigen Wert wie `"vier-komma-fünf"`
und beobachte (nur lesen, nicht abfangen) den Fehler beim Ausführen – als
Vorschau auf Exception Handling in Modul 9.
