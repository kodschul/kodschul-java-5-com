# Lab 8.2 – Übung: Vom festen Array zur ArrayList\<T\>

**Dauer:** ca. 20 Minuten (kurze Übung, projektunabhängig)

## Szenario

Du vergleichst ein festes Array mit einer `ArrayList<String>` an einer
kleinen Namensliste.

## Baseline

Neue Klasse `ArrayListIntro` (kein Bezug zu einer Checkpoint-Datei nötig).

## Voraussetzungen

- Lab 8.1 abgeschlossen

## Aufgaben

1. Erstelle eine Klasse `ArrayListIntro` mit `main`-Methode.
2. Lege `ArrayList<String> names = new ArrayList<>();` an.
3. Füge mit `add` mindestens vier Namen hinzu.
4. Gib die Liste sowie `names.size()` aus.
5. Entferne mit `remove` einen Namen und gib die Liste erneut aus.
6. **Zusatz:** versuche, dasselbe mit einem festen `String[]` fester Größe 4 nachzubauen, und beschreibe, was beim Entfernen eines Elements anders/schwieriger ist.

## Checkpoint

Nach dem Hinzufügen zeigt `size()` die korrekte Anzahl; nach dem Entfernen
verringert sich die Größe entsprechend.

## Fertig, wenn

- mindestens vier Namen erfolgreich hinzugefügt wurden,
- ein Name erfolgreich entfernt wurde,
- die Zusatzaufgabe den Unterschied zum festen Array benennt (Array hat
  keine eingebaute "Entfernen"-Operation, die die Größe anpasst).

## Referenz

Kein Bezug zu `output/project/`; diese Übung ist eigenständig.
