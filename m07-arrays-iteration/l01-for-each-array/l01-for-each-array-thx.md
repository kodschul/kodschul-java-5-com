# Modul 7: Arrays und Schleifen kombinieren

## Lab 7.1 – for/for-each über ein Array

---

## Lab-Ziel

Nach diesem Lab iterierst du mit `for` und mit `for-each` über ein Array
und weißt, wann welche Variante passt.

**Leitfragen:**

<details>
<summary>Was ist der Unterschied zwischen for und for-each bei Arrays?</summary>

`for` mit Index gibt Zugriff auf die Position (z. B. zum Ändern eines
Elements). `for-each` liefert nur die Werte nacheinander, ohne Index -
kürzer, wenn man nur lesend über alle Elemente gehen will.

</details>

<details>
<summary>Wann braucht man zwingend den Index statt for-each?</summary>

Wenn man ein Element an einer bestimmten Position verändern will, oder wenn
man den Index selbst braucht (z. B. um "Versuch Nummer 3" auszugeben).

</details>

---

## for mit Index vs. for-each

```java
int[] attemptHistory = {42, 17, 73, 50};

for (int i = 0; i < attemptHistory.length; i++) {
    System.out.println("Attempt " + (i + 1) + ": " + attemptHistory[i]);
}

for (int guess : attemptHistory) {
    System.out.println("Guess: " + guess);
}
```

- Die erste Schleife nutzt den Index `i`, um die Versuchsnummer mit
  auszugeben - das geht mit `for-each` nicht direkt.
- Die zweite Schleife (`for-each`, `for (Typ variable : array)`) ist
  kompakter, wenn nur die Werte selbst gebraucht werden.

**Checkpoint:** Du kannst dasselbe Array wahlweise mit Index oder mit
`for-each` durchlaufen und weißt, wann welche Variante sinnvoller ist.

Weiter geht es mit Lab 7.2: Werte suchen, zählen, aufsummieren.
