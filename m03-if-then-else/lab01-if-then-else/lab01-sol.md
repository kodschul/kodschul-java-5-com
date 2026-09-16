# Lösungshinweise: if-then-else-Anweisung

Eigene Referenzlösung zur Vorbereitung; die offizielle Musterlösung liegt in
`solutions.zip` und wird passend zur Übung ausgegeben.

## 3.2.1 - Verzweigungen

```java
package main;

public class IfThenElseStatement_solution {
    public static void main(String[] args) {
        int operand1 = 38;
        int operand2 = 47;
        char op = '+';
        int result = operand1 + operand2;
        int userSolution = 85;
        int noOfTasksPerRound = 10;

        if (userSolution == result) {
            System.out.println("Correct! Well done :-)");
        } else {
            System.out.println("Sorry, no, the correct answer to " + operand1
                + " " + op + " " + operand2 + " is " + result);
        }

        if (3 < noOfTasksPerRound) {
            System.out.println("enough tasks planned");
        } else {
            System.out.println("not enough tasks planned");
        }

        if (operand2 > 0) {
            System.out.println("operand2 is positive");
        } else {
            System.out.println("operand2 is not positive");
        }

        if ((operand1 - operand2) >= 0) {
            System.out.println("operand1 is not smaller than operand2");
        } else {
            System.out.println("operand1 is smaller than operand2");
        }

        if ((operand1 != operand2) == (op == '/')) {
            System.out.println("division-case condition matches");
        } else {
            System.out.println("division-case condition does not match");
        }
    }
}
```
