# Modul 6: Arrays einführen

## Lab 6.2 – Array in einer Schleife befüllen

---

## Lab-Ziel

Nach diesem Lab befüllst du ein Array mit einer `for`-Schleife statt mit
einzelnen Zuweisungen - das Muster, das ZahlenJagd für die
Versuchshistorie braucht.

**Leitfragen:**

<details>
<summary>Warum passt der Schleifenzähler oft direkt als Array-Index?</summary>

Wenn man von 0 bis `length - 1` zählt, entspricht der Zähler genau den
gültigen Indizes des Arrays - so lässt sich jedes Element ansprechen, ohne
für jeden Index eine eigene Zeile zu schreiben.

</details>

<details>
<summary>Was ist der Unterschied zwischen der Array-Größe und der Anzahl befüllter Elemente?</summary>

Die Array-Größe (`length`) ist fest und wird bei der Erzeugung festgelegt.
Wie viele Elemente tatsächlich sinnvoll befüllt wurden, muss man selbst
mitzählen (z. B. mit einem eigenen Zähler), wenn nicht immer alle Plätze
genutzt werden.

</details>

---

## Array in einer Schleife befüllen

```java
int[] squares = new int[5];

for (int i = 0; i < squares.length; i++) {
    squares[i] = (i + 1) * (i + 1);
}

for (int i = 0; i < squares.length; i++) {
    System.out.println(squares[i]);
}
```

- Die erste Schleife befüllt das Array, die zweite liest es wieder aus -
  beide nutzen denselben Zähler-Index-Zusammenhang.
- `squares.length` statt einer festen Zahl zu verwenden macht den Code
  unabhängig von der konkreten Array-Größe.

**Checkpoint:** Dein Array wird vollständig über eine Schleife befüllt und
über eine zweite Schleife wieder ausgegeben.

Weiter geht es mit Lab 6.3: jeden ZahlenJagd-Rateversuch in ein Array
schreiben.
