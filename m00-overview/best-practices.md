# Best Practices

Kursübergreifende Praktiken, die in mehreren Modulen wiederkehren. Für jede
Praktik: Grund, Konsequenz bei Verzicht, oder Entscheidungskriterium.

## Fehlerbehandlung

- **Ungültige Eingaben immer mit `try-catch` abfangen, nie ignorieren.**
  Grund: `Scanner.nextInt()` wirft `InputMismatchException` bei nicht-
  numerischer Eingabe; ohne `catch` stürzt das Programm sofort ab.
  (Modul 9)
- **Nach einem abgefangenen `InputMismatchException` immer `scanner.next()`
  aufrufen.** Grund: Die ungültige Eingabe bleibt sonst im Eingabepuffer
  stehen und der nächste Leseversuch schlägt sofort wieder fehl (Endlosschleife
  aus Fehlermeldungen). (Modul 9, Lab 9.2-9.3)
- **Ein fehlgeschlagener Leseversuch darf keinen "Versuch" verbrauchen.**
  Entscheidungskriterium: Der Zähler (`attempt`) wird nur im Erfolgspfad des
  `try`-Blocks erhöht, nicht im `catch`-Block. (Modul 9, Lab 9.3)
- **Sonderwerte als Rückgabe müssen klar außerhalb des gültigen Bereichs
  liegen.** Beispiel: `maxAttempts + 1` als Rückgabe für "nicht geschafft",
  weil gültige Versuchszahlen nur `1` bis `maxAttempts` sind. (Modul 8, 10)

## Kapselung und Klassendesign

- **Attribute grundsätzlich `private` (oder `protected` bei Vererbungsbedarf),
  nie `public`.** Grund: Kontrollierter Zugriff, keine ungültigen Werte von
  außen setzbar; interne Umsetzung kann sich ändern, ohne Aufrufer-Code
  anzupassen. (Modul 10, Lab 10.2)
- **Nur einen Setter anbieten, wenn ein Attribut tatsächlich von außen
  veränderbar sein soll.** Entscheidungskriterium: Ein reiner Zähler, der nur
  inkrementiert wird, braucht `increment()`, keinen `setCount(int)`. (Modul 10,
  Lab 10.2 Zusatz)
- **Konstruktor-Parameter und Attribut gleich benennen, mit `this.` im Rumpf
  unterscheiden.** Grund: Lesbarkeit; `this.name = name` ist eindeutiger als
  künstlich unterschiedliche Namen wie `nameParam`. (Modul 10, Lab 10.1)
- **`protected` statt `private` nur dann, wenn Unterklassen den Zugriff
  tatsächlich brauchen** (z. B. für `toString()`-Overrides). Sonst bleibt
  `private` die Standardwahl. (Modul 11, Lab 11.1-11.2)

## Vererbung und Polymorphie

- **`@Override` bei jeder überschreibenden Methode angeben.** Grund: Der
  Compiler prüft die Signatur gegen die Basisklasse; ein Tippfehler erzeugt
  sonst unbemerkt eine neue, unbeabsichtigte Methode statt eines Fehlers.
  (Modul 11, Lab 11.2)
- **Rückgabetyp einer Fabrikmethode ist die Basisklasse, nicht die konkrete
  Unterklasse.** Grund: Der Aufrufer muss den konkreten Typ nicht kennen;
  Polymorphie übernimmt die richtige Methode zur Laufzeit. (Modul 12, Lab 12.1)
- **Gemeinsame Logik gehört in die Basisklasse, unterschiedliche Parameter in
  die Unterklassen-Konstruktoren.** Beispiel: `GuessingGame` enthält die
  komplette Spiellogik; `EasyGuessingGame`/`HardGuessingGame` unterscheiden
  sich nur durch `super(upperBound, maxAttempts)`. (Modul 11, Lab 11.1)

## Sammlungen (Arrays und ArrayList)

- **Array wählen, wenn die Größe vorher feststeht; `ArrayList<T>`, wenn
  nicht.** Entscheidungskriterium: Muss die Anzahl der Elemente zur Laufzeit
  wachsen können? Wenn ja, `ArrayList<T>`. (Modul 8, Lab 8.2)
- **Beim Iterieren über nur teilweise befüllte Arrays einen separaten
  Zähler (z. B. `attemptCount`) statt `array.length` verwenden.** Grund: Nicht
  jedes Array-Element ist zwangsläufig gültig befüllt. (Modul 6-7)
- **`Comparable<T>` implementieren, statt bei jedem Sortieraufruf ein neues
  Lambda zu schreiben.** Grund: Die Vergleichslogik gehört fest zum Objekt und
  muss nicht an jeder Aufrufstelle erneut definiert werden. (Modul 11, Lab
  11.3)
- **`Integer.compare(a, b)` statt manueller Subtraktion (`a - b`) für
  Vergleiche verwenden.** Grund: Subtraktion kann bei sehr großen `int`-Werten
  überlaufen; `Integer.compare` ist die von der Standardbibliothek empfohlene,
  sichere Variante. (Modul 11, Lab 11.3)

## Eingabe-Robustheit

- **Nutzereingaben vor dem Vergleich normalisieren:** `.trim()` gegen
  versehentliche Leerzeichen, `.equalsIgnoreCase(...)` gegen unterschiedliche
  Groß-/Kleinschreibung. (Modul 12, Lab 12.2)
- **Bei Mehrfachauswahl (`switch`) immer einen `default`-Zweig angeben.**
  Grund: Jede nicht explizit behandelte oder leere Eingabe fällt auf einen
  sinnvollen Standard zurück, statt das Programm abstürzen zu lassen. (Modul 4,
  Lab 4.2; Modul 12, Lab 12.1)

## Code-Struktur und Lesbarkeit

- **Wiederkehrende Auswahllogik in eine eigene Methode auslagern** (z. B.
  `chooseDifficulty(scanner)`), statt sie direkt in `main` zu schreiben.
  Grund: `main` bleibt übersichtlich, die Logik ist unabhängig testbar.
  (Modul 12, Lab 12.1)
- **Am Ende eines Projekts eine kurze Review-Checkliste durchgehen**
  (Fehlerbehandlung, Kapselung, Namensgebung, doppelter Code, Sonderwerte),
  statt sich allein darauf zu verlassen, dass der Code "läuft". Grund: "Läuft"
  bedeutet nicht automatisch robust oder wartbar. (Modul 12, Lab 12.2)
- **Referenzlösungen klar als eigene Lösung kennzeichnen, nicht als
  offizielle Musterlösung ausgeben.** Jede `-sol.md`-Datei nennt
  `solutions.zip` als Quelle der offiziellen Lösung. (alle Module)

## Quelltext-Konventionen dieses Kurses

- **Code (Klassen-/Methodennamen, Kommentare, ausgegebene Texte) ist
  durchgehend Englisch**; Kursprosa, Titel und Erklärungen bleiben Deutsch.
  Grund: Konsistenz mit gängiger Java-Praxis, unabhängig von der Kurssprache.
- **Keine externen Bibliotheken.** Nur JDK-Standardbibliothek und Konsolen-
  I/O; nichts zusätzlich zu installieren außer JDK und IDE.
