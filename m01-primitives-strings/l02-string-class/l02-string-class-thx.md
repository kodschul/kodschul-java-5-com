# Modul 1: Primitive Datentypen, Variablen und Strings

## Lab 1.2 – Die String-Klasse: wichtige Methoden und Verkettung

---

## Lab-Ziel

Nach diesem Lab kannst du Strings verketten, ihre Länge und Teile auslesen
und die wichtigsten `String`-Methoden im Kursalltag anwenden.

**Leitfragen:**

<details>
<summary>Ist ein String in Java ein primitiver Typ?</summary>

Nein. `String` ist eine Klasse (ein Objekt), kein primitiver Datentyp – auch
wenn er sich mit `"..."`-Literalen fast wie einer anfühlt.

</details>

<details>
<summary>Wie verkettet man Strings mit Zahlen?</summary>

Mit dem `+`-Operator: `"Versuch " + 3` ergibt `"Versuch 3"`. Java wandelt die
Zahl dafür automatisch in Text um.

</details>

<details>
<summary>Warum sind Strings in Java unveränderlich (immutable)?</summary>

Jede "Änderung" (z. B. `toUpperCase()`) erzeugt ein neues `String`-Objekt statt
das Original zu verändern. Das macht Strings sicher im Umgang, aber man muss
das Ergebnis einer Methode immer einer Variable zuweisen, sonst geht es
verloren.

</details>

---

## Wichtige String-Methoden

| Methode            | Beispiel               | Ergebnis |
| ------------------ | ---------------------- | -------- |
| `length()`         | `"Java".length()`      | `4`      |
| `toUpperCase()`    | `"java".toUpperCase()` | `"JAVA"` |
| `equals(other)`    | `"a".equals("a")`      | `true`   |
| `substring(start)` | `"Java".substring(1)`  | `"ava"`  |
| `trim()`           | `"  hi  ".trim()`      | `"hi"`   |

**Grenze:** `==` vergleicht bei Strings die Objektreferenz, nicht den Inhalt.
Für Inhaltsvergleiche immer `.equals(...)` verwenden.

```java
String name = "Ada";
String gruss = "Hallo, " + name + "!";
System.out.println(gruss.length());       // 11
System.out.println(gruss.toUpperCase());  // HALLO, ADA!
```

---

## Verkettung in der Praxis

```java
int versuch = 3;
int maxVersuche = 10;
String status = "Versuch " + versuch + " von " + maxVersuche;
System.out.println(status); // Versuch 3 von 10
```

- `String.format("Versuch %d von %d", versuch, maxVersuche)` ist eine
  lesbarere Alternative bei mehreren Platzhaltern.

**Checkpoint:** Du kannst einen zusammengesetzten Ausgabetext aus mehreren
Variablen und Text bauen und weißt, wann `.equals()` statt `==` nötig ist.

Weiter geht es mit Lab 1.3: Typumwandlung und eine kombinierte Übung.
