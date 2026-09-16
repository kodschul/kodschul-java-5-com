# Theorie: Objekte benutzen - Teil 1: Objekte erstellen und Referenzen speichern (Platzhalter)

**Status: Platzhalter.** Für Kap. 4 liegt bisher nur die IHV-Gliederung vor
(`3302_IHV (3).pdf`, S. IHV-2), kein vollständiges Kapitel-PDF
(`3302_K04.pdf` fehlt noch, siehe `00-intake.md`). Die folgenden Punkte sind
allgemeines, sicheres Java-Grundwissen zur IHV-Überschrift - **nicht** die
lizenzierte Kapitelformulierung. Bei Vorlage des Kapitel-PDFs ersetzen.

**Leitfrage:** Was ist ein Objekt, und wie erzeugt man eines?

---

## Ein Objekt erzeugen

```java
Random random = new Random(); // new erzeugt das Objekt im Heap
int value = random.nextInt(10);
```

```mermaid
flowchart LR
    Var["Variable: random"] -->|Referenz| Obj["Random-Objekt im Heap"]
```

---

## Referenz ist kein Objekt

- Eine Referenzvariable speichert nur den Verweis ("Pointer"), nicht das
  Objekt selbst.
- Zwei Variablen können auf **dasselbe** Objekt zeigen:

```java
Random a = random;
Random b = random;
// a und b zeigen auf dasselbe Objekt wie random
```
