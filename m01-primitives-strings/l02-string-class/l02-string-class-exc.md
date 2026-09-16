# Lab 1.2 – Übung: Die String-Klasse

## Szenario

Du bereitest Textbausteine vor, die später für Begrüßungen und
Statusmeldungen in Konsolenprogrammen genutzt werden.

## Zielartefakt

Eine Klasse `StringUebung.java`, die aus gegebenen Variablen zusammengesetzte
Texte ausgibt und String-Methoden anwendet.

## Dauer

15 Minuten.

## Voraussetzungen

Lab 1.1 abgeschlossen (Umgang mit Variablen).

## Aufgaben

1. Lege eine Klasse `StringUebung` mit `main`-Methode an.
2. Deklariere `String vorname = "Ada";` und `String nachname = "Lovelace";`.
3. Baue daraus einen vollständigen Namen `String vollerName` durch Verkettung
   (mit Leerzeichen dazwischen) und gib ihn aus.
4. Gib die Länge von `vollerName` aus.
5. Gib `vollerName` einmal komplett in Großbuchstaben aus.
6. Vergleiche `vorname.equals("Ada")` und gib das Ergebnis aus.
7. Baue einen Statustext `"Teilnehmer: " + vollerName + " (Zeichen: " + vollerName.length() + ")"`
   und gib ihn aus.

## Checkpoint

- Die Konsole zeigt: vollständigen Namen, Länge, Großbuchstaben-Variante,
  Vergleichsergebnis (`true`) und den zusammengesetzten Statustext.

## Abschlusskriterien

- Verkettung nutzt ausschließlich `+`, keine manuell eingegebenen fertigen
  Ergebnistexte.
- `.equals()` wird für den Vergleich verwendet, nicht `==`.

## Erweiterung (optional)

Gib zusätzlich `vorname.substring(0, 1)` aus (den ersten Buchstaben) und baue
daraus eine Kurzform wie `"A. Lovelace"`.
