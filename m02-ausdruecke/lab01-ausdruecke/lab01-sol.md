# Lösungshinweise: Ausdrücke

Eigene Referenzlösungen zur Vorbereitung; die offizielle Musterlösung liegt
in `solutions.zip` und wird passend zur jeweiligen Übung ausgegeben.

## 2.1.1 - Modulo-Operator

```java
package main;

public class Remainder_Modulo_operator_solution {
    public static void main(String[] args) {
        int a = 5 % 3;    // 2
        int b = 5 / 3;    // 1
        int c = 5 % (-3);  // 2
        int d = 5 / (-3);  // -1
        int e = (-5) % 3;  // -2
        int f = (-5) / 3;  // -1
        int g = (-5) % (-3); // -2
        int h = (-5) / (-3); // 1
        System.out.println("5%3 = " + a + " (5/3 = " + b + ")");
        System.out.println("5%(-3) = " + c + " (5/(-3) = " + d + ")");
        System.out.println("(-5)%3 = " + e + " ((-5)/3 = " + f + ")");
        System.out.println("(-5)%(-3) = " + g + " ((-5)/(-3) = " + h + ")");
    }
}
```

Merksatz: Das Vorzeichen des Modulo-Ergebnisses folgt in Java dem Vorzeichen
des **Dividenden** (linker Operand), nicht dem des Divisors.

## 2.2.2 - Casts und Runden

- Runden: `Math.round(9.7304)` liefert `10` (als `long`), im Gegensatz zu
  `(int) 9.7304`, das `9` liefert (Abschneiden statt Runden).
- `long -> int`: ein zu großer `long`-Wert "wraps around" (Überlauf), er wird
  nicht einfach gekappt.
- `int -> char`: ein `int`-Wert wird als Unicode-Codepoint interpretiert
  (z. B. `65` -> `'A'`).
- `boolean -> byte`: **nicht erlaubt** - es gibt keine Konvertierung zwischen
  `boolean` und numerischen Typen in Java.

## 2.3.3 - Variablen deklarieren

```java
package main;

public class VariablesForArithmeticTrainer {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        char op = '\u0000';
        int result = 0;
        int userSolution = 0;
        int noOfTasksPerRound = 10;

        System.out.println(operand1);
        System.out.println(operand2);
        System.out.println(op);
        System.out.println(result);
        System.out.println(userSolution);
        System.out.println(noOfTasksPerRound);
    }
}
```

## 2.4.1 - Boolesche Ausdrücke

```java
package main;

public class Boolean_expressions_solution {
    public static void main(String[] args) {
        int operand1 = 38;
        int operand2 = 47;
        char op = '+';
        int result = operand1 + operand2;
        int userSolution = 84;
        int noOfTasksPerRound = 10;

        boolean solved = userSolution == result;
        System.out.println("solved: " + solved);

        boolean enoughTasks = 3 < noOfTasksPerRound;
        boolean operand2Positive = operand2 > 0;
        boolean nonNegativeDifference = (operand1 - operand2) >= 0;
        boolean divisionCase = (operand1 != operand2) == (op == '/');

        System.out.println("enoughTasks: " + enoughTasks);
        System.out.println("operand2Positive: " + operand2Positive);
        System.out.println("nonNegativeDifference: " + nonNegativeDifference);
        System.out.println("divisionCase: " + divisionCase);

        // Modulo-Identität (a/b)*b+(a%b) == a
        boolean identityHolds = (operand1 / operand2) * operand2 + (operand1 % operand2) == operand1;
        System.out.println("identityHolds: " + identityHolds);
    }
}
```

## 2.5.1 - Wahrheitstabellen

Für zwei `boolean`-Variablen `a`, `b` alle 4 Kombinationen (`true/true`,
`true/false`, `false/true`, `false/false`) durchgehen und `a & b`, `a | b`,
`a ^ b` ausgeben - z. B. mit vier expliziten Zeilen oder einer verschachtelten
Schleife (Schleifen folgen erst in Kap. 7; für diese optionale Übung reichen
auch vier einzelne Ausgaben).

## 2.5.2 - Short-Circuit debuggen

Erwartetes Debug-Ergebnis: bei `a && b` wird `b` nicht mehr ausgewertet,
sobald `a` bereits `false` ist; bei `a || b` wird `b` nicht mehr ausgewertet,
sobald `a` bereits `true` ist. Mit `&`/`|` (ohne Short-Circuit) werden dagegen
immer beide Seiten ausgewertet.
