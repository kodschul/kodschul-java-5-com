# Modul 5: Schleifen

## Lab 5.3 – ZahlenJagd erlaubt mehrere Versuche

---

## Lab-Ziel

Nach diesem Lab erlaubt ZahlenJagd mehrere Versuche in einer Schleife, bis
richtig geraten wurde oder die Versuche aufgebraucht sind.

**Leitfragen:**

<details>
<summary>Warum reicht return allein nicht, um korrekt zu beenden?</summary>

`return` beendet zwar die Methode bei einem Treffer sofort, aber ohne
Obergrenze (`maxAttempts`) würde die Schleife bei ständig falschen
Versuchen nie von selbst enden.

</details>

<details>
<summary>Was passiert, wenn maxAttempts erreicht ist, ohne dass geraten wurde?</summary>

Die Schleife endet regulär (die Bedingung `attempt <= maxAttempts` wird
falsch), und danach wird die "keine Versuche mehr"-Meldung ausgegeben.

</details>

---

## Von der Einzelprüfung zur Schleife

```java
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                scanner.close();
                return;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        scanner.close();
    }
}
```

- `return` innerhalb der Schleife beendet `playRound()` sofort bei einem
  Treffer - ohne weitere, unnötige Versuche.
- Die "keine Versuche mehr"-Meldung steht bewusst nach der Schleife: sie
  wird nur erreicht, wenn kein `return` ausgeführt wurde.

**Checkpoint:** Dein Programm erlaubt bis zu 10 Versuche, beendet sich bei
einem Treffer sofort und meldet andernfalls, dass die Versuche
aufgebraucht sind.

Weiter geht es mit Modul 6: Arrays einführen.
