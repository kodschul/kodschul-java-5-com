# Lab 10.2 – Übung: Kapselung: private Felder, Getter/Setter

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du kapselst die `Player`-Klasse aus Lab 10.1 mit privaten Feldern und
Gettern.

## Baseline

Weiterentwicklung von `Player` aus Lab 10.1.

## Voraussetzungen

- Lab 10.1 abgeschlossen

## Aufgaben

1. Ändere `name` und `attempts` in `Player` zu `private final`.
2. Ergänze `getName()` und `getAttempts()`.
3. Passe `PlayerDemo` so an, dass es ausschließlich über die Getter auf die Werte zugreift.
4. **Zusatz:** ergänze eine Klasse `MutableCounter` mit einem privaten `int count`-Feld, einem Getter `getCount()` und einem Setter `increment()`, der `count` um 1 erhöht (kein direkter Setter für einen beliebigen Wert).

## Checkpoint

Ein direkter Zugriff auf `player.name` von außerhalb der `Player`-Klasse
verursacht einen Compile-Fehler; über die Getter funktioniert der Zugriff
weiterhin.

## Fertig, wenn

- beide Felder in `Player` `private final` sind,
- `PlayerDemo` nur noch über Getter zugreift,
- `MutableCounter.increment()` den Zählerstand kontrolliert erhöht, ohne
  einen direkten Zugriff auf `count` von außen zu erlauben.

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
