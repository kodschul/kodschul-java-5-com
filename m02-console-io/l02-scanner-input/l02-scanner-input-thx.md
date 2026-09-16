# Modul 2: Konsolen-Ein-/Ausgabe

## Lab 2.2 – Einlesen mit Scanner

---

## Lab-Ziel

Nach diesem Lab kannst du Text- und Zahleneingaben über `Scanner` einlesen
und kennst die typische Falle beim Mischen von `nextInt()` und `nextLine()`.

**Leitfragen:**

<details>
<summary>Wie liest man eine ganze Zahl bzw. eine ganze Textzeile ein?</summary>

`scanner.nextInt()` liest eine ganze Zahl, `scanner.nextLine()` liest eine
komplette Zeile Text (inklusive Leerzeichen).

</details>

<details>
<summary>Warum "verschluckt" nextLine() manchmal die nächste Eingabe?</summary>

`nextInt()` liest nur die Zahl, lässt aber den Zeilenumbruch danach im
Eingabepuffer stehen. Ein direkt folgender `nextLine()`-Aufruf liest dann
sofort diesen leeren Rest statt auf neue Eingabe zu warten.

</details>

---

## Scanner Grundlagen

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("What is your name? ");
String name = scanner.nextLine();

System.out.print("How old are you? ");
int age = scanner.nextInt();
```

- `Scanner` gehört zu `java.util` und muss importiert werden.
- Wichtigste Methoden: `nextInt()`, `nextDouble()`, `next()` (ein Wort),
  `nextLine()` (ganze Zeile).
- Am Programmende: `scanner.close()`.

---

## Die nextInt()/nextLine()-Falle

```java
int age = scanner.nextInt();
String comment = scanner.nextLine(); // liest sofort "" statt auf Eingabe zu warten!
```

- Nach `nextInt()` bleibt der Zeilenumbruch im Puffer.
- Abhilfe: einen zusätzlichen `scanner.nextLine()` einfügen, um den Puffer zu
  leeren, bevor eine echte Zeile gelesen wird.

```java
int age = scanner.nextInt();
scanner.nextLine(); // Puffer leeren
String comment = scanner.nextLine(); // liest jetzt korrekt
```

**Checkpoint:** Du kannst erklären, warum ein `nextLine()` direkt nach einem
`nextInt()` übersprungen wirkt, und wie man das behebt.

Weiter geht es mit Lab 2.3: das erste Ein-/Ausgabe-Programm.
