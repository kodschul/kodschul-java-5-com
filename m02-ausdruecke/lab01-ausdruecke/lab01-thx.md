# Theorie: Ausdrücke

Quelle: `3302_K02 (1).pdf` komplett (S. 2-1 bis 2-31). Eigene
Zusammenfassung, keine wörtliche Wiedergabe des Kapiteltexts.

**Leitfragen:** Was ist ein Ausdruck? Welche Datentypen gibt es? Wie
vergleicht und kombiniert man boolesche Bedingungen?

---

## Ausdrücke

**Arbeitsdefinition:** Alles, was zur Laufzeit genau einen Wert erzeugt.

```java
((121/11)+4*2)-27    // = -8  (Punkt vor Strich)
(((121/11)+4)*2)-27  // =  3  (Klammern ändern die Reihenfolge)
```

- Operanden können Literale **oder** Ausdrücke sein (z. B. `Math.random()`).

---

## Datentypen

| Kategorie  | Typen                                  |
| ---------- | -------------------------------------- |
| Ganzzahlen | `byte`, `short`, `int`, `long`, `char` |
| Gleitkomma | `float`, `double`                      |
| Logik      | `boolean`                              |

```java
System.out.println((int) 9.7304); // 9 - Cast schneidet ab, rundet nicht!
int dice = (int) (Math.random() * 10 + 1); // Zufallszahl 1..10
```

---

## Variablen

```java
int operand1 = 0;   // Deklaration + Zuweisung
int operand2 = 0;
char op = '\u0000';
int result = 0;
int userSolution = 0;
int noOfTasksPerRound = 10;
```

- Java ist **statisch** und **stark** typisiert - der Compiler prüft den Typ
  schon vor der Ausführung.

---

## Vergleichsoperatoren

Die "großen 6": `==` `!=` `<` `<=` `>` `>=`

```java
boolean solved = userSolution == result; // liefert true/false
```

---

## Logische Operatoren

| Operator | Bedeutung | Short-Circuit-Variante |
| -------- | --------- | ---------------------- |
| `&`      | UND       | `&&`                   |
| `\|`     | ODER      | `\|\|`                 |
| `!`      | NICHT     | -                      |
| `^`      | XOR       | -                      |

```java
boolean ok = (a > 0) && (b > 0); // b wird nicht mehr geprüft, wenn a > 0 false ist
```

e
