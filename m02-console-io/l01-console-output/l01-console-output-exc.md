# Lab 2.1 – Übung: Ausgeben mit System.out

**Dauer:** ca. 15 Minuten (kurze Übung, ändert noch nichts am Kursprojekt)

## Szenario

Du bereitest die Ausgabe-Bausteine vor, die später für das Kursprojekt
ZahlenJagd gebraucht werden.

## Voraussetzungen

- Lab 2.1 Theorie
- Eine leere Klasse `ConsoleOutputPractice` mit `main`-Methode

## Aufgaben

1. Gib deinen Namen und dein Lieblingsspiel mit zwei `System.out.println`-Aufrufen aus.
2. Gib denselben Text mit zwei `System.out.print`-Aufrufen in einer Zeile aus (mit `\n` am Ende manuell ergänzt).
3. Deklariere `int score = 87;` und `double average = 3.5;` und gib beide Werte mit `printf` formatiert aus, `average` mit genau zwei Nachkommastellen.
4. **Fehlerfall:** Finde heraus (durch Lesen, nicht Ausprobieren nötig), was passiert, wenn du `%d` für `average` statt `%f`/`%.2f` verwendest, und notiere die Antwort als Kommentar.

## Checkpoint

Dein Programm gibt mindestens drei Zeilen aus: zwei aus Aufgabe 1/2, eine
formatierte Zeile mit `score` und `average`.

## Fertig, wenn

- alle vier Aufgaben im Code sichtbar sind,
- die Ausgabe für `average` genau zwei Nachkommastellen zeigt,
- Aufgabe 4 als Kommentar im Code beantwortet ist.

## Erweiterung (optional)

Baue eine vierte Ausgabe, die Name, Score und Average in einer einzigen
`printf`-Zeile kombiniert.
