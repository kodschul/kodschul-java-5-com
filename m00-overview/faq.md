# FAQ

Häufige Fragen von Teilnehmer:innen, direkt und unabhängig beantwortet.

## Zum Kurs allgemein

**Brauche ich Programmiervorkenntnisse?**
Nein. Der Kurs setzt keine Programmiererfahrung voraus, nur grundlegende
Computerkenntnisse. Modul 1 startet bei primitiven Datentypen.

**Welche IDE brauche ich?**
Eclipse oder IntelliJ IDEA, beide mit installiertem JDK. Der Setup-Check
findet am ersten Kurstag um 09:00 statt - bring dein Notebook mit
funktionierendem JDK+IDE mit.

**Brauche ich zusätzliche Bibliotheken oder einen Paketmanager (Maven,
Gradle)?**
Nein. Der gesamte Kurs verwendet ausschließlich die JDK-Standardbibliothek
(`java.util.Scanner`, `java.util.ArrayList`, `java.util.Arrays`,
`java.util.Collections`) und Konsolen-I/O.

**Warum heißt das Projekt "ZahlenJagd" und nicht z. B. "Taschenrechner"?**
Ein Zahlen-Ratespiel eignet sich didaktisch gut, weil es von Anfang an einen
klaren, überprüfbaren Erfolgsfall hat (richtig geraten) und sich natürlich
mit jedem neuen Sprachmittel erweitern lässt (Bedingungen, Schleifen, Arrays,
Klassen, Vererbung).

**Was, wenn ich in einem Modul nicht mitkomme?**
Jeder Kurstag hat einen Puffer-/Vertiefungsblock am Nachmittag (15:00-16:30
bzw. Tag 5 früher). Dort werden offene Fragen aus dem Tag aufgegriffen und
Zusatzübungen je nach Kenntnisstand angeboten.

**Wie viele Teilnehmer:innen sind maximal dabei?**
Maximal 10 pro Durchführung.

## Zu den Übungen

**Muss ich meine Lösung 1:1 wie in `-sol.md` schreiben?**
Nein. `-sol.md` ist eine eigene Referenzlösung, keine einzig richtige
Musterlösung. Solange dein Code die im Checkpoint der `-exc.md` geforderte
Funktionalität korrekt erfüllt, ist eine andere Umsetzung ebenfalls gültig.

**Was ist der Unterschied zwischen `-sol.md` und `solutions.zip`?**
`-sol.md` ist eine im Kurs erklärte, nachvollziehbare Eigenlösung mit
Begründung. Die offizielle, geprüfte Musterlösung liegt separat in
`solutions.zip` und wird bei Bedarf vom Trainer bereitgestellt.

**Was bedeutet "Checkpoint" in den Aufgaben?**
Der Checkpoint beschreibt das beobachtbare Ergebnis, an dem du erkennst,
dass die Aufgabe erfolgreich gelöst ist (z. B. "beide Highscore-Listen sind
korrekt sortiert").

**Muss ich jede Zusatzaufgabe machen?**
Nein. Zusatzaufgaben ("Zusatz") sind optional und für Teilnehmer:innen
gedacht, die schneller fertig sind - sie sind nicht Teil des
Mindest-Checkpoints.

**Was, wenn mein Code nicht dem entspricht, was in einem späteren Modul als
Ausgangspunkt ("Baseline") erwartet wird?**
Jedes Projekt-Lab nennt den erwarteten Checkpoint-Pfad in
`output/project/checkpoints/checkpoint-mNN-<thema>/`. Du kannst deinen
eigenen Code jederzeit gegen diesen Stand abgleichen oder bei Bedarf davon
neu starten.

## Zu Java-Konzepten

**Warum wird `attempt` manchmal in einer `for`-Schleife und manchmal in
einer `while`-Schleife gezählt?**
Solange jede Wiederholung garantiert einen Versuch verbraucht (Modul 5-8),
reicht eine `for`-Schleife. Sobald ein Leseversuch fehlschlagen und trotzdem
wiederholt werden kann, ohne einen Versuch zu kosten (Modul 9 f.), ist eine
`while`-Schleife mit manuellem Zähler nötig.

**Warum wird aus `void playRound()` irgendwann `int playRound()` bzw.
`int play(Scanner scanner)`?**
Weil spätere Module (Highscore-Liste in Modul 8, Objektstatus in Modul 10)
den Rückgabewert (die benötigte Versuchsanzahl) tatsächlich brauchen. Eine
`void`-Methode kann kein Ergebnis liefern.

**Was ist der Unterschied zwischen `Arrays.sort` und `Collections.sort`?**
`Arrays.sort` sortiert ein Array (`int[]`, `String[]`, ...) in-place.
`Collections.sort` sortiert eine `List<T>` (z. B. `ArrayList<Player>`) und
setzt voraus, dass die Elemente `Comparable<T>` implementieren oder ein
Comparator übergeben wird.

**Warum nicht gleich in Modul 8 eine `Player`-Klasse mit `Comparable`
verwenden, statt erst das Textformat `"Name:Versuche"`?**
Modul 8 führt bewusst zuerst `ArrayList<T>` isoliert ein (ein neues Konzept
nach dem anderen). Erst nachdem in Modul 10 Klassen und in Modul 11 Vererbung
und Interfaces bekannt sind, ergibt eine eigene `Player`-Klasse mit
`Comparable` didaktisch Sinn.

**Was passiert, wenn ich vergesse, `scanner.next()` im `catch`-Block
aufzurufen?**
Die ungültige Eingabe bleibt im Puffer stehen; der nächste `nextInt()`-Aufruf
schlägt sofort wieder mit derselben `InputMismatchException` fehl - das
Programm bleibt in einer Endlosschleife aus Fehlermeldungen hängen.

**Warum `protected` statt `private` bei `upperBound`/`maxAttempts` in
`GuessingGame`?**
Weil die Unterklassen (`EasyGuessingGame`, `HardGuessingGame`) in Modul 11.2
direkt auf diese Felder zugreifen, um sie in ihrem eigenen `toString()`
auszugeben. `private` würde diesen Zugriff verhindern.

**Ist `Math.random() * upperBound` inklusive oder exklusive `upperBound`?**
`Math.random()` liefert einen Wert zwischen `0.0` (inklusive) und `1.0`
(exklusive). `(int) (Math.random() * upperBound) + 1` liefert damit eine
Ganzzahl zwischen `1` und `upperBound` (beide inklusive).

## Zum Projekt und Tag 5

**Was genau muss am Ende (Tag 5) fertig sein?**
Eine lauffähige `GuessingGameApp`: Schwierigkeitsgrad wählbar, beliebig oft
spielbar, Ergebnisse werden in einer `ArrayList<Player>` gesammelt und am
Ende korrekt sortiert ausgegeben - mit Fehlerbehandlung für ungültige
Eingaben (geerbt aus Modul 9).

**Muss ich am Ende präsentieren?**
Ja, im Zeitblock 10:45-12:15 an Tag 5 stellt jede:r Teilnehmer:in kurz die
eigene Version von ZahlenJagd vor. Das ist informell gehalten, kein
formelles Assessment.

**Was, wenn meine Version nicht exakt dem Checkpoint entspricht?**
Das ist unproblematisch - der Checkpoint zeigt eine mögliche, geprüfte
Lösung. Eigene Abwandlungen, solange sie funktionieren, sind Teil des
Lernprozesses und werden bei der Präsentation gerne gezeigt.

**Was passiert im Puffer-Block am Nachmittag von Tag 5?**
Reserve für übergangene Themen aus Tag 1-4 sowie optional ein kurzer
Ausblick auf Interfaces/Collections-Vertiefung für Folgekurse - kein neuer
Pflichtstoff.

## Grenzen und Unsicherheiten

**Deckt dieser Kurs Multithreading, Netzwerkprogrammierung oder Datenbanken
ab?**
Nein. Der Kurs bleibt bewusst bei Konsolenanwendungen mit der JDK-
Standardbibliothek; diese Themen sind nicht Teil der 5 Kurstage.

**Werden eigene Interfaces (über `Comparable` hinaus) oder das
Command-Pattern behandelt?**
Nicht als Pflichtstoff. Diese Themen sind bewusst als optionaler Ausblick im
Tag-5-Puffer oder für einen Folgekurs vorgesehen, um den Kurs bei 12 Modulen
zu halten.
