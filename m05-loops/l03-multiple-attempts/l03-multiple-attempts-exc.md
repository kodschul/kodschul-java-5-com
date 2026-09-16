# Lab 5.3 – Übung: ZahlenJagd erlaubt mehrere Versuche

**Dauer:** ca. 30 Minuten (Projekt-Lab, aktualisiert den ZahlenJagd-Checkpoint)

## Szenario

Du erweiterst `GuessingGame` aus Modul 3/4 um eine Schleife mit bis zu 10
Versuchen, statt nur einen einzigen Ratewert zu prüfen.

## Baseline

Ausgangspunkt ist
`output/project/checkpoints/checkpoint-m03-methods/GuessingGame.java`.

## Voraussetzungen

- Lab 5.1 und 5.2 abgeschlossen
- Modul 4 (if/else-Kette) abgeschlossen

## Aufgaben

1. Ergänze `maxAttempts = 10` und eine `for`-Schleife von `attempt = 1` bis `maxAttempts`.
2. Verschiebe die Eingabe/Auswertung des Ratewerts in den Schleifenkörper.
3. Werte den Ratewert mit einer if/else-if/else-Kette aus (richtig/zu niedrig/zu hoch, siehe Modul 4).
4. Beende die Methode bei einem Treffer sofort mit `return`.
5. Gib nach der Schleife (nur wenn kein Treffer erfolgte) "No attempts left. The number was X." aus.

## Checkpoint

Bei einem Treffer innerhalb von 10 Versuchen endet dein Programm sofort mit
der Erfolgsmeldung; werden alle 10 Versuche verbraucht, erscheint die
"No attempts left"-Meldung.

## Fertig, wenn

- die Schleife maximal 10 Mal läuft,
- ein Treffer die Schleife vorzeitig beendet,
- die "keine Versuche mehr"-Meldung nur bei tatsächlich verbrauchten
  Versuchen erscheint.

## Referenz

Der erwartete Endstand liegt in
`output/project/checkpoints/checkpoint-m05-loops/GuessingGame.java`.
