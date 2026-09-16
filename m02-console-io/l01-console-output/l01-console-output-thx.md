# Modul 2: Konsolen-Ein-/Ausgabe

## Lab 2.1 – Ausgeben mit System.out.println/printf

---

## Lab-Ziel

Nach diesem Lab kannst du Werte formatiert auf der Konsole ausgeben und
kennst den Unterschied zwischen `println`, `print` und `printf`.

**Leitfragen:**

<details>
<summary>Was ist der Unterschied zwischen println und print?</summary>

`println` hängt am Ende automatisch einen Zeilenumbruch an, `print` nicht.
Mehrere `print`-Aufrufe landen also in derselben Zeile.

</details>

<details>
<summary>Wann lohnt sich printf gegenüber String-Verkettung?</summary>

`printf` trennt Text und Werte über Platzhalter (`%s`, `%d`, `%.2f`) und ist
lesbarer, sobald mehrere Werte in einem festen Format kombiniert werden.

</details>

---

## Die drei Ausgabe-Methoden

```java
System.out.println("Hello Java");        // mit Zeilenumbruch
System.out.print("Hello ");
System.out.print("Java");                 // ohne Zeilenumbruch -> "Hello Java"
System.out.printf("Score: %d%n", 42);     // formatiert, %n = Zeilenumbruch
```

- String-Verkettung mit `+` funktioniert, wird bei vielen Werten aber schnell
  unübersichtlich.
- `printf`-Platzhalter: `%s` (Text), `%d` (ganze Zahl), `%.2f` (Kommazahl mit
  2 Nachkommastellen), `%n` (plattformunabhängiger Zeilenumbruch).

```java
String name = "Anna";
int attempts = 3;
System.out.println("Player " + name + " needed " + attempts + " attempts.");
System.out.printf("Player %s needed %d attempts.%n", name, attempts);
```

**Grenze:** `%d` erwartet eine ganze Zahl - `System.out.printf("%d", 4.5)`
wirft eine `IllegalFormatConversionException` zur Laufzeit.

---

## Escape-Sequenzen

| Sequenz | Bedeutung         |
| ------- | ----------------- |
| `\n`    | Zeilenumbruch     |
| `\t`    | Tabulator         |
| `\"`    | Anführungszeichen |
| `\\`    | Backslash         |

**Checkpoint:** Du kannst eine Begrüßung mit Name und Zahl in einer Zeile
formatiert ausgeben - sowohl mit `+`-Verkettung als auch mit `printf`.

Weiter geht es mit Lab 2.2: Einlesen mit `Scanner`.
