# Lab 6.2 – Lösung: Array in einer Schleife befüllen

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class ArrayFillLoop {

    public static void main(String[] args) {
        int[] squares = new int[10];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }

        int sum = 0;
        for (int i = 0; i < squares.length; i++) {
            sum += squares[i];
        }
        System.out.println("Sum: " + sum);
    }
}
```

## Begründung

Alle drei Schleifen verwenden denselben Zähler-Index-Zusammenhang
(`i` von 0 bis `squares.length - 1`), obwohl sie unterschiedliche Dinge tun
(befüllen, ausgeben, summieren) - das Muster ist wiederverwendbar.

## Ausblick

Lab 6.3 wendet genau dieses Muster auf ZahlenJagd an: jeder Rateversuch
wird zusätzlich in ein Array geschrieben.
