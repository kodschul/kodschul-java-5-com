# Lab 5.2 – Lösung: for-Schleife

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class ForLoopBasics {

    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
```

## Begründung

`sum` wird außerhalb der Schleife deklariert, damit ihr Wert über alle
Durchläufe hinweg erhalten bleibt - eine Variable im Schleifenkopf würde
bei jedem Durchlauf neu erzeugt.

## Zusatz

Für nur gerade Zahlen genügt eine zusätzliche Bedingung im Schleifenkörper:

```java
if (number % 2 == 0) {
    System.out.println(number);
}
```

## Ausblick

Lab 5.3 setzt genau diese `for`-Schleife um mehrere ZahlenJagd-Versuche
ein.
