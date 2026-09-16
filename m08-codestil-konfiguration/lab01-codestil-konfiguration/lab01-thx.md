# Theorie: Codestil und Konfiguration (Platzhalter)

**Status: Platzhalter.** Für Kap. 8 liegt bisher nur die IHV-Gliederung vor
(`3302_IHV (3).pdf`, S. IHV-4), kein vollständiges Kapitel-PDF
(`3302_K08.pdf` fehlt noch, siehe `00-intake.md`). Die folgenden Punkte sind
allgemeines, sicheres Java-Grundwissen zu den IHV-Überschriften - **nicht**
die lizenzierte Kapitelformulierung. Bei Vorlage des Kapitel-PDFs ersetzen.

**Leitfrage:** Wie schreibt man wartbaren Code, und wie kennzeichnet man
seinen Entwicklungsstand?

---

## Literale vermeiden: Konstanten statt "magischer Zahlen"

```java
// schlecht:
for (int i = 0; i < 10; i++) { ... }

// besser:
static final int NO_OF_TASKS_PER_ROUND = 10;
for (int i = 0; i < NO_OF_TASKS_PER_ROUND; i++) { ... }
```

---

## Versionsschemata

```text
MAJOR . MINOR . PATCH      z. B. 1.0.1
  |       |       |
  |       |       +-- kleine Korrektur
  |       +---------- neue, kompatible Funktion
  +------------------ große, inkompatible Änderung
```

---

## Konfiguration per Text-Menü

```java
System.out.println("1) Benutzername setzen");
System.out.println("2) Runde starten");
// Auswahl einlesen und per switch/if verzweigen
```
