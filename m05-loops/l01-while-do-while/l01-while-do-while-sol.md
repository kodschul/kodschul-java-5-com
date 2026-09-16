# Lab 5.1 – Lösung: while/do-while

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class LoopBasics {

    public static void main(String[] args) {
        int number = 1;
        while (number <= 5) {
            System.out.println(number);
            number++;
        }

        int check = -1;
        do {
            System.out.println("Runs at least once");
            check++;
        } while (check < 0);
    }
}
```

## Begründung

`check < 0` ist von Anfang an falsch, trotzdem läuft der `do-while`-Block
einmal - das demonstriert den Kernunterschied zu `while`, wo der Block in
diesem Fall gar nicht laufen würde.

## Zusatz

Für die Rückwärtszählung reicht es, Startwert und Bedingung/Schritt
umzukehren:

```java
int countdown = 5;
while (countdown >= 1) {
    System.out.println(countdown);
    countdown--;
}
```

## Ausblick

Lab 5.2 zeigt, wie dieselbe Zählschleife mit `for` kompakter geschrieben
wird.
