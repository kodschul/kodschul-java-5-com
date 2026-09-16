# Theorie: Objekte benutzen - Teil 2: Konstruktoren aufrufen & Konsolen-I/O (Platzhalter)

**Status: Platzhalter.** Für Kap. 5 liegt bisher nur die IHV-Gliederung vor
(`3302_IHV (3).pdf`, S. IHV-2 bis IHV-3), kein vollständiges Kapitel-PDF
(`3302_K05.pdf` fehlt noch, siehe `00-intake.md`). Die folgenden Punkte sind
allgemeines, sicheres Java-Grundwissen zur IHV-Überschrift - **nicht** die
lizenzierte Kapitelformulierung. Bei Vorlage des Kapitel-PDFs ersetzen.

**Leitfrage:** Wie übergibt man einem Objekt Startwerte, und wie liest man
Konsoleneingaben ein?

---

## Konstruktor

Setzt den Anfangszustand beim Erzeugen (`new Klasse(...)`); kann überladen
werden.

```java
public class ScoreCounter {
    private final int noOfTasksPerRound;

    public ScoreCounter(int noOfTasksPerRound) { // Konstruktor
        this.noOfTasksPerRound = noOfTasksPerRound;
    }
}
```

---

## Import-Anweisungen

```java
import java.util.Random; // statt java.util.Random überall auszuschreiben

Random random = new Random();
```

---

## Konsoleneingabe: ein Objekt mit einem Objekt initialisieren

```mermaid
flowchart LR
    Sin["System.in"] --> ISR["InputStreamReader"] --> BR["BufferedReader"] --> App[Anwendung]
```

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
int userSolution = Integer.parseInt(reader.readLine()); // String -> int
```
