# Lab 7.2 – Lösung: Werte suchen, zählen, aufsummieren

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
public class ArrayStatistics {

    public static void main(String[] args) {
        int[] values = {42, 17, 73, 50, 8};

        int sum = 0;
        int min = values[0];
        int max = values[0];

        for (int value : values) {
            sum += value;
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        double average = (double) sum / values.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min + ", Max: " + max);

        int countAboveAverage = 0;
        for (int value : values) {
            if (value > average) {
                countAboveAverage++;
            }
        }
        System.out.println("Values above average: " + countAboveAverage);
    }
}
```

## Begründung

Eine einzige Schleife berechnet Summe, Minimum und Maximum gleichzeitig -
das ist effizienter als drei getrennte Durchläufe über dasselbe Array.

## Ausblick

Lab 7.3 wendet dieselben Berechnungen auf die tatsächliche
ZahlenJagd-Versuchshistorie aus Modul 6 an.
