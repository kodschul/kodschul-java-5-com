# Lab 9.1 – Übung: try-catch-Grundlagen

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du fängst eine `ArithmeticException` bei einer Division durch Null ab.

## Baseline

Neue Klasse `TryCatchBasics` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Modul 8 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `TryCatchBasics` mit `main`-Methode.
2. Lies zwei `int`-Werte per `Scanner` ein und dividiere den ersten durch den zweiten.
3. Fange eine `ArithmeticException` ab und gib "Cannot divide by zero." aus.
4. Gib nach dem `try-catch`-Block "Program continues." aus.
5. **Zusatz:** teste zusätzlich mit gültigen Werten (kein Fehlerfall) und beobachte, dass der `catch`-Block dann nicht ausgeführt wird.

## Checkpoint

Bei Division durch 0 läuft dein Programm weiter, statt abzustürzen; bei
einer gültigen Division wird das Ergebnis normal ausgegeben.

## Fertig, wenn

- die Division durch Null abgefangen wird,
- "Program continues." in beiden Fällen (Fehler und kein Fehler) ausgegeben
  wird,
- bei gültigen Werten das korrekte Ergebnis erscheint.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
