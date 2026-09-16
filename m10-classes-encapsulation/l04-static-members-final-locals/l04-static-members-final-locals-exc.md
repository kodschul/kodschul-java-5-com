# Lab 10.4 – Übung: Statische Felder/Methoden und lokale final-Variablen

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du erweiterst die `Player`-Klasse aus Lab 10.2 um einen geteilten Zähler
und eine Konstante, und schreibst eine Hilfsmethode mit einer lokalen
`final`-Variablen.

## Baseline

Weiterentwicklung von `Player` aus Lab 10.2 (bereits `private final`
Felder mit Gettern).

## Voraussetzungen

- Lab 10.2 abgeschlossen

## Aufgaben

1. Ergänze in `Player` ein `private static int playerCount = 0;`.
2. Erhöhe `playerCount` im Konstruktor um 1, bei jeder neuen Objekterzeugung.
3. Ergänze eine `public static int getPlayerCount()`, die `playerCount` zurückgibt.
4. Ergänze eine Konstante `public static final int MAX_ATTEMPTS = 10;`.
5. Schreibe eine statische Methode `printSummary(Player player)`, die eine
   lokale `final int bonusPoints = 5;` deklariert und
   `player.getAttempts() + bonusPoints` ausgibt.
6. **Zusatz:** Versuche versehentlich, `bonusPoints` innerhalb der Methode
   ein zweites Mal einen Wert zuzuweisen, und beobachte den
   Compile-Fehler. Kommentiere die Zeile danach wieder aus.

## Checkpoint

Nach dem Erzeugen von drei `Player`-Objekten liefert
`Player.getPlayerCount()` den Wert `3`, ohne dass dafür ein bestehendes
`Player`-Objekt nötig ist.

## Fertig, wenn

- `playerCount` korrekt bei jeder Objekterzeugung erhöht wird,
- `Player.getPlayerCount()` und `Player.MAX_ATTEMPTS` über den
  Klassennamen ansprechbar sind,
- `printSummary()` mit der lokalen `final`-Variablen fehlerfrei läuft,
- der bewusst provozierte Compile-Fehler bei doppelter Zuweisung
  nachvollzogen und wieder entfernt wurde.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
