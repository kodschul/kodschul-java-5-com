# Best Practices: Java Grundlagen (Seminar 3302)

Stichpunkte, die im Kurs wiederholt betont werden - als Sprechzettel und
Nachschlagehilfe. Kapitelangaben verweisen auf `3302_IHV (3).pdf`.

## Codestil (Kap. 8)

- Literale vermeiden, wo möglich Konstanten (`final`) verwenden.
- Ein sinnvolles Versionsschema früh einführen und konsequent hochzählen
  (`x07_..._V0_0_1_solution` -> `x08a_..._V0_0_2_solution`), nicht erst am Ende.
- Codeänderungen so klein wie möglich halten, damit die Musterlösung der
  vorigen Übung die verlässliche Basis für die nächste bleibt.

## Verzweigung (Kap. 3, 6)

- if-then ohne else nur verwenden, wenn der "sonst-Fall" wirklich nichts tun
  soll.
- if-else-if für exklusive Fälle statt mehrerer unabhängiger if-Blöcke, um
  unnötige Prüfungen zu vermeiden.
- Bei `switch`: `break` nicht vergessen (klassischer Fallthrough-Fehler);
  ab Java 14 `switch` mit Pfeil (`->`) als Alternative.

## Exceptions (Kap. 10, 18)

- `try-catch` so eng wie möglich um den riskanten Aufruf legen, nicht um
  ganze Methoden.
- Selbst geworfene (checked) Exceptions dokumentieren, warum der Aufrufer sie
  behandeln muss.
- `continue` gezielt einsetzen, um nach einer abgefangenen Exception die
  aktuelle Iteration sauber zu überspringen statt Sonderlogik zu verschachteln.

## Defensive Programmierung (Kap. 11)

- Eingaben/Zustände prüfen, bevor sie verwendet werden, statt erst auf den
  Fehler zur Laufzeit zu reagieren.
- Statische Hilfsmethoden aus der JRE-System Library kennen, bevor man sie
  selbst nachbaut.

## OOA -> OOP (Kap. 14-16)

- Erst die Spezifikation in Klartext sauber formulieren, dann erst Klassen
  identifizieren - nicht umgekehrt.
- Getter/Setter bewusst einsetzen: nicht jedes Feld braucht beides.
- `this` nur dort verwenden, wo ein Namenskonflikt es erfordert (z. B.
  Konstruktorparameter == Feldname), nicht als Stilmittel überall.

## Collections (Kap. 17)

- `ArrayList` gegenüber Array bevorzugen, sobald sich die Größe zur Laufzeit
  ändert.
- `ArrayList` immer mit Generics (`ArrayList<Task>`), nie als raw type
  verwenden - Workarounds mit `instanceof` sind ein Warnsignal, kein Vorbild.

## Interfaces (Kap. 20-21)

- Ein Interface hat keine Instanzvariablen und wird nie direkt instanziiert.
- `Comparable` bewusst implementieren, wenn eine natürliche Ordnung existiert
  - nicht als Ersatz für einen expliziten `Comparator`.
- Das Command-Interface hält `MenuItem` unabhängig vom konkreten Befehl;
  neue Befehle sollen ohne Änderung an `Menu` möglich sein.

## Allgemein (aus dem SLF)

- Musterlösungen werden jeweils passend zur anstehenden Übung ausgegeben,
  nicht alle auf einmal - so bleibt der Lerneffekt erhalten.
- JLS-/Oracle-Tutorial-Zitate zusammenfassend wiedergeben, nicht ad hoc
  übersetzen - Zeit sparen, korrekte Fachbegriffe im Vordergrund.
