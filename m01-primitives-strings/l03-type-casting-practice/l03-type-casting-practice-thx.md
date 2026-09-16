# Modul 1: Primitive Datentypen, Variablen und Strings

## Lab 1.3 – Typumwandlung (Casting) und kombinierte Übung

---

## Lab-Ziel

Nach diesem Lab kannst du Werte zwischen primitiven Typen und Strings
umwandeln und Variablen, Typumwandlung und String-Operationen in einer
Aufgabe kombinieren.

**Leitfragen:**

<details>
<summary>Was passiert, wenn man einen double einem int zuweist?</summary>

Das ist eine "verengende" Umwandlung (potenzieller Datenverlust) und muss
explizit erzwungen werden: `int ganzzahl = (int) 4.9;` ergibt `4` – der
Nachkommateil wird abgeschnitten, nicht gerundet.

</details>

<details>
<summary>Wie wandelt man einen String in eine Zahl um?</summary>

Mit `Integer.parseInt("42")` für `int` bzw. `Double.parseDouble("4.5")` für
`double`. Enthält der String keine gültige Zahl, wirft das eine
`NumberFormatException` (Exception Handling folgt in Modul 9).

</details>

<details>
<summary>Braucht man einen Cast, um eine Zahl in einen String umzuwandeln?</summary>

Nein. `String.valueOf(42)` oder einfache Verkettung `"" + 42` reichen – das
ist keine Casting-Operation im engeren Sinn, sondern Textumwandlung.

</details>

---

## Casting im Überblick

| Richtung                  | Beispiel                 | Hinweis                             |
| ------------------------- | ------------------------ | ----------------------------------- |
| `double` → `int`          | `(int) 4.9` → `4`        | explizit nötig, schneidet ab        |
| `int` → `double`          | `(double) 5` → `5.0`     | automatisch (erweiternd)            |
| `String` → `int`          | `Integer.parseInt("42")` | wirft Exception bei ungültigem Text |
| `int`/`double` → `String` | `String.valueOf(42)`     | keine Datenverluste                 |

```java
double gemessenerWert = 4.9;
int ganzzahl = (int) gemessenerWert; // 4, nicht 5

String eingabe = "42";
int zahl = Integer.parseInt(eingabe); // 42
```

**Grenze:** `Integer.parseInt("42.5")` schlägt fehl – `parseInt` erwartet nur
ganze Zahlen, für Kommazahlen ist `Double.parseDouble` nötig.

---

## Checkpoint

Du kannst begründen, wann eine Umwandlung automatisch passiert (erweiternd)
und wann ein expliziter Cast nötig ist (verengend), und Text zuverlässig in
Zahlen umwandeln.

Die Übung dieses Labs kombiniert Variablen (Lab 1.1), Strings (Lab 1.2) und
Casting zu einer kleinen, projektunabhängigen Aufgabe – wie im Kurs-Agenda-
Punkt "kleine, projektunabhängige Übungen zu Variablen, Typumwandlung und
String-Operationen" vorgesehen. Ab Modul 2 arbeitest du mit echter
Konsoleneingabe, ab Modul 3 beginnt das Kursprojekt ZahlenJagd.
