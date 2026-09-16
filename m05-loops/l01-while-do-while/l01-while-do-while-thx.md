# Modul 5: Schleifen

## Lab 5.1 – while/do-while

---

## Lab-Ziel

Nach diesem Lab wiederholst du einen Codeblock mit `while`, solange eine
Bedingung wahr ist, und kennst den Unterschied zu `do-while`.

**Leitfragen:**

<details>
<summary>Wann wird die Bedingung bei while geprüft, wann bei do-while?</summary>

Bei `while` vor jedem Durchlauf (der Block kann also null Mal laufen). Bei
`do-while` erst nach dem ersten Durchlauf (der Block läuft also mindestens
einmal).

</details>

<details>
<summary>Was passiert, wenn die Bedingung nie falsch wird?</summary>

Eine Endlosschleife - das Programm läuft weiter, bis es abgebrochen wird
(z. B. manuell oder durch einen `return`/`break` im Block).

</details>

---

## while-Schleife

```java
int attempt = 1;
int maxAttempts = 5;

while (attempt <= maxAttempts) {
    System.out.println("Attempt " + attempt);
    attempt++;
}
```

- Die Bedingung `attempt <= maxAttempts` wird vor jedem Durchlauf geprüft.
- `attempt++` muss im Block selbst stehen - sonst würde die Schleife nie
  enden.

## do-while-Schleife

```java
int number = 0;
do {
    System.out.println("Runs at least once, number = " + number);
    number++;
} while (number < 0);
```

- Der Block läuft hier einmal, obwohl `number < 0` von Anfang an falsch
  ist - das ist der zentrale Unterschied zu `while`.

**Checkpoint:** Du kannst erklären, in welchem Fall `while` und `do-while`
zu einer unterschiedlichen Anzahl an Durchläufen führen.

Weiter geht es mit Lab 5.2: die `for`-Schleife.
