# Lab 3.1 – Lösung: Warum Methoden? Parameter, Rückgabewert

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Aufgaben 1-4

```java
public class MethodPractice {

    public static void main(String[] args) {
        printSeparator();
        System.out.println("square(6) = " + square(6));
        System.out.println("max(4, 9) = " + max(4, 9));
    }

    static int square(int number) {
        return number * number;
    }

    static void printSeparator() {
        System.out.println("--------------------");
    }

    static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }
}
```

## Erweiterung

```java
static int min(int a, int b, int c) {
    int smallest = a;
    if (b < smallest) {
        smallest = b;
    }
    if (c < smallest) {
        smallest = c;
    }
    return smallest;
}
```

## Alternative

`max`/`min` lassen sich auch mit dem eingebauten `Math.max`/`Math.min`
schreiben; das eigene Nachbauen dient hier dem Verständnis von
Bedingungen und Rückgabewerten.
