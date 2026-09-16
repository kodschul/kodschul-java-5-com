# Beispielprojekt: Java Grundlagen Cheat-Sheet (Modul 1-10)

Eigenständiges Beispielprojekt mit einer lauffähigen `.java`-Datei pro Modul.
Jede Datei ist ein realitätsnahes Anfängerbeispiel (kein Kopie des lizenzierten
Kapiteltexts) und kann einzeln mit `javac`/`java` kompiliert und ausgeführt
werden - kein Build-Tool nötig.

## Struktur (nach Thema gruppiert)

| Ordner           | Thema                            | Datei                             | Modul |
| ---------------- | -------------------------------- | --------------------------------- | ----- |
| `01-basics/`     | Einführung, EVA-Prinzip          | `HelloWorldUndEva.java`           | m01   |
| `01-basics/`     | Ausdrücke, Datentypen, Variablen | `Ausdruecke.java`                 | m02   |
| `01-basics/`     | if-then-else                     | `Verzweigung.java`                | m03   |
| `01-basics/`     | if-else-if / switch              | `VerzweigungSwitch.java`          | m06   |
| `01-basics/`     | for- und do-while-Schleifen      | `Schleifen.java`                  | m07   |
| `01-basics/`     | Konstanten, Versionsschema       | `KonstantenUndVersionen.java`     | m08   |
| `02-strings/`    | String-Klasse                    | `StringKlasse.java`               | m09   |
| `03-oop/`        | Objekte erstellen, Referenzen    | `ObjekteErstellen.java`           | m04   |
| `03-oop/`        | Konstruktoren, Konsolen-I/O      | `KonstruktorenUndKonsolenIO.java` | m05   |
| `04-exceptions/` | try-catch, `continue`            | `ExceptionHandling.java`          | m10   |

## Ausführen

```bash
cd 01-basics
javac HelloWorldUndEva.java
java HelloWorldUndEva
```

Dateien mit Konsoleneingabe (`KonstruktorenUndKonsolenIO.java`,
`ExceptionHandling.java`) fragen nach einer Eingabe - beliebige Zahl bzw.
absichtlich einen Text eingeben, um den Fehlerfall zu sehen.

Module 11-20 folgen in einem zweiten Schritt.
