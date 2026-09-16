# Lab 1.1 – Übung: Primitive Datentypen und Variablen

## Szenario

Du bereitest die ersten Bausteine für ein späteres Konsolenprogramm vor, ohne
noch ein konkretes Projekt zu bauen. Ziel ist Sicherheit im Umgang mit
Variablen und Typen.

## Zielartefakt

Eine Java-Klasse `Variablen.java` mit `main`-Methode, die alle unten
geforderten Variablen deklariert und deren Werte ausgibt.

## Dauer

15 Minuten.

## Voraussetzungen

- JDK und IDE (Eclipse/IntelliJ) sind eingerichtet.
- Keine Startdatei nötig – Datei wird neu angelegt.

## Aufgaben

1. Lege eine Klasse `Variablen` mit `main`-Methode an.
2. Deklariere eine `int`-Variable `anzahlVersuche` mit Startwert `0`.
3. Deklariere eine `double`-Variable `durchschnitt` mit einem beliebigen
   Dezimalwert.
4. Deklariere eine `boolean`-Variable `spielLaeuft` mit Startwert `true`.
5. Deklariere eine `char`-Variable `schwierigkeitsgrad` mit dem Wert `'L'`.
6. Gib alle vier Variablen mit `System.out.println` aus, jeweils mit einem
   kurzen Text davor (z. B. `"Anzahl Versuche: " + anzahlVersuche`).
7. Ändere `anzahlVersuche` nach der Ausgabe um `+1` und gib den neuen Wert
   erneut aus.

## Checkpoint

- Das Programm kompiliert ohne Fehler.
- Die Konsole zeigt sechs Ausgabezeilen: vier Erstwerte und die
  aktualisierte `anzahlVersuche`.

## Abschlusskriterien

- Alle vier Typen sind korrekt gewählt (kein `int` für Kommazahlen, kein
  `String` statt `char`).
- Die Variable `anzahlVersuche` wurde nachweislich verändert und neu
  ausgegeben.

## Erweiterung (optional)

Deklariere zusätzlich eine `final int MAX_VERSUCHE = 10;` und gib eine
Meldung aus, ob `anzahlVersuche` diesen Wert bereits erreicht hat.
