# Glossar: Java Grundlagen (Seminar 3302)

Begriffe in der Reihenfolge ihrer ersten Verwendung im Kurs. Kapitelangaben
verweisen auf `3302_IHV (3).pdf`.

## Kap. 1 - Einführung

- **Anwendung (Anwendungsprogramm):** Softwarepaket, das eine bestimmte
  Funktion direkt für einen Endbenutzer oder eine andere Anwendung ausführt.
  Abgrenzung zu Systemsoftware (läuft im Hintergrund, interagiert nicht direkt
  mit dem Nutzer).
- **EVA-Prinzip:** Eingabe - Verarbeitung - Ausgabe; grundlegendstes
  Anwendungsprinzip.
- **Algorithmus:** die Verarbeitungsphase des EVA-Prinzips, formal beschrieben.
- **Funktion / Methode:** In Java heißen Funktionen "Methoden" (Kap. 1.4).
- **Java-Compiler / JVM:** übersetzt Quellcode in Bytecode, der auf der Java
  Virtual Machine läuft.
- **Rückgabewert vs. Ausgabe:** ein Rückgabewert verlässt eine Methode über
  `return`; eine Ausgabe (z. B. `System.out.println`) erzeugt sichtbaren Text,
  ohne den Aufrufer mit einem Wert zu versorgen.

## Kap. 2 - Ausdrücke

- **Ausdruck (Expression):** Kombination aus Literalen, Variablen, Operatoren
  und Methodenaufrufen, die zu einem Wert ausgewertet wird.
- **Variable:** benannter Speicherplatz für Eingabe-, Ausgabe- oder temporäre
  Daten.
- **Boolescher Ausdruck:** Ausdruck, der zu `true`/`false` ausgewertet wird;
  Basis für Entscheidungslogik (`&&`, `||`, `!`, `^`).

## Kap. 3 - Verzweigung

- **if-then-Anweisung:** führt einen Block nur aus, wenn der boolesche
  Ausdruck `true` ist (JLS §14.9.1).
- **if-then-else-Anweisung:** vollständige Verzweigung mit zwei Pfaden
  (JLS §14.9.2).

## Kap. 4-5 - Objekte

- **Objekt:** zur Laufzeit erzeugte Instanz einer Klasse (`new Random()`).
- **Referenz:** ein "Pointer" auf ein Objekt im Speicher; wird in einer
  Variablen gehalten.
- **Konstruktor:** spezielle Methode, die beim Erzeugen eines Objekts
  Argumente entgegennimmt und den Anfangszustand setzt.
- **Import-Anweisung:** kürzt vollqualifizierte Typnamen ab.

## Kap. 6-9 - Verzweigung, Schleifen, Codestil, String

- **if-then-else-if:** exklusive Verzweigung über mehrere Bedingungen.
- **switch-case:** Abkürzung für bestimmte Verzweigungsausdrücke; Achtung:
  fehlendes `break` fällt durch (fall-through).
- **for-Schleife / do-while-Schleife:** Wiederholungskonstrukte;
  Inkrement/Dekrement-Operatoren `++`/`--`.
- **final Variable:** einmal zugewiesen, danach unveränderlich; Basis für
  Konstanten statt "magischer" Literale.
- **String-Eigenheiten:** u. a. Unveränderlichkeit (Immutability),
  String-Pool, `==` vs. `.equals()`.

## Kap. 10-13 - Exceptions, statische Methoden, Phasenwechsel

- **try-catch:** fängt eine Exception ab, damit das Programm kontrolliert
  weiterläuft statt abzustürzen.
- **statische Methode:** gehört zur Klasse, nicht zu einer Instanz; Aufruf
  ohne `new`.
- **defensive Programmierung:** Eingaben/Zustände aktiv prüfen, bevor sie
  verwendet werden, statt Fehler erst zur Laufzeit auffallen zu lassen.
- **OOA (objektorientierte Analyse):** Verfahren, aus einer Klartext-
  Spezifikation Klassen, Attribute und Beziehungen abzuleiten.
- **OOP (objektorientierte Programmierung):** Programmierparadigma auf Basis
  von Klassen/Objekten, das aus dem OOA-Ergebnis abgeleitet wird.

## Kap. 14-18 - OOA -> OOP, Klassen, Vererbung, Collections

- **access modifier:** `public`/`private`/package-private; steuert
  Sichtbarkeit von Feldern/Methoden.
- **Getter/Setter:** Instanzmethoden zum kontrollierten Lesen/Schreiben
  privater Felder.
- **this-Referenz:** verweist innerhalb einer Instanzmethode auf das aktuelle
  Objekt; löst u. a. Namenskonflikte mit Konstruktorparametern.
- **static final field:** Konstante auf Klassenebene (nicht pro Instanz).
- **Vererbung / Überschreiben (Override):** eine Klasse erbt von `Object`
  (oder einer anderen Klasse) und kann Methoden wie `toString()` überschreiben.
- **Array vs. ArrayList:** Array hat feste Größe; `ArrayList` wächst dynamisch
  und stammt aus der JRE System Library.
- **Generics:** typsichere Verwendung von `ArrayList<T>` statt raw type.
- **checked Exception:** vom Aufrufer zwingend zu behandelnde Ausnahme,
  selbst geworfen mit `throw`.

## Kap. 19-21 - Interfaces, Command-Pattern

- **for-each-Schleife:** iteriert über eine Collection ohne expliziten Index.
- **StringBuilder:** veränderliche Zeichenkette für effiziente
  String-Zusammensetzung.
- **Interface:** deklariert abstrakte Methoden ohne Instanzvariablen; kann
  nicht direkt instanziiert werden; eine Klasse implementiert es vollständig.
- **java.lang.Comparable:** Interface für die natürliche Ordnung von Objekten.
- **Command-Pattern (hier: Interface `command`):** kapselt eine Aktion als
  Objekt, damit `MenuItem` unabhängig vom konkreten Befehl bleibt.
