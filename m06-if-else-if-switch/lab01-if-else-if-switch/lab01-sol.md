# Lösungshinweise: If-then-else-if vs. switch-case (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K06.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Die folgenden Beispiele sind eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierten Musterlösungen.

## 6.2.2 - if-then-else-if

```java
package main;

public class ArithmeticTrainer_0_0_2_solution {
    public static void main(String[] args) {
        int operand1 = 38;
        int operand2 = 47;
        char op = '+';
        int result;

        if (op == '+') {
            result = operand1 + operand2;
        } else if (op == '-') {
            result = operand1 - operand2;
        } else if (op == '*') {
            result = operand1 * operand2;
        } else {
            result = operand1 / operand2;
        }

        System.out.println(result);
    }
}
```

## 6.3.4 - switch-Anweisung

```java
package main;

public class ArithmeticTrainer_0_0_3_solution {
    public static void main(String[] args) {
        int operand1 = 38;
        int operand2 = 47;
        char op = '+';
        int result;

        switch (op) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            default:
                result = operand1 / operand2;
                break;
        }

        System.out.println(result);
    }
}
```
