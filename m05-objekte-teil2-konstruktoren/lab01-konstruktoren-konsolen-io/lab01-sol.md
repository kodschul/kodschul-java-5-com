# Lösungshinweise: Konstruktoren und Konsolen-I/O (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K05.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen. Die folgenden Beispiele sind eigenes, allgemeines
Java-Grundwissen zur Orientierung, keine lizenzierten Musterlösungen.

## 5.1.2 - import und static import

```java
package main;

import java.util.Random;
import static java.lang.Math.max;

public class ImportExample_solution {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(max(3, 7));
    }
}
```

## 5.2.2 - Konstruktor mit Parametern

```java
package main;

public class ScoreCounter_solution {

    private final int noOfTasksPerRound;

    public ScoreCounter_solution(int noOfTasksPerRound) {
        this.noOfTasksPerRound = noOfTasksPerRound;
    }

    public static void main(String[] args) {
        ScoreCounter_solution counter = new ScoreCounter_solution(10);
        System.out.println(counter.noOfTasksPerRound);
    }
}
```

## 5.3.2 - Referenzen übergeben

```java
package main;

import java.util.Random;

public class RandomTaskPicker_solution {

    private final Random random;

    public RandomTaskPicker_solution(Random random) {
        this.random = random;
    }

    public int pickOperand() {
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        RandomTaskPicker_solution picker = new RandomTaskPicker_solution(new Random());
        System.out.println(picker.pickOperand());
    }
}
```

## 5.4.2 - Konsoleneingabe verarbeiten

```java
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticTrainer_0_0_1_solution {
    public static void main(String[] args) throws IOException {
        int operand1 = 38;
        int operand2 = 47;
        char op = '+';
        int result = operand1 + operand2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is " + operand1 + " " + op + " " + operand2 + "?");
        int userSolution = Integer.parseInt(reader.readLine());

        if (userSolution == result) {
            System.out.println("Correct! Well done :-)");
        } else {
            System.out.println("Sorry, no, the correct answer is " + result);
        }
    }
}
```
