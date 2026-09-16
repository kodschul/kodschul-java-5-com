# Modul 3: Methoden (Funktionen)

## Lab 3.1 – Warum Methoden? Parameter, Rückgabewert

---

## Lab-Ziel

Nach diesem Lab kannst du eigene Methoden mit Parametern und Rückgabewert
schreiben und begründen, wann sich das Auslagern von Code lohnt.

**Leitfragen:**

<details>
<summary>Warum reicht main() allein nicht für größere Programme?</summary>

Ohne Methoden landet der gesamte Ablauf in einem einzigen Block - das ist ab
wenigen Dutzend Zeilen unübersichtlich und lässt sich nicht wiederverwenden.

</details>

<details>
<summary>Was ist der Unterschied zwischen Parameter und Rückgabewert?</summary>

Ein Parameter ist eine Eingabe, die eine Methode beim Aufruf entgegennimmt.
Der Rückgabewert ist das Ergebnis, das die Methode an den Aufrufer zurückgibt.

</details>

---

## Methoden-Grundgerüst

```java
static <Rückgabetyp> <name>(<Parameterliste>) {
    // Anweisungen
    return <wert>; // nur wenn Rückgabetyp nicht void ist
}
```

```java
static int add(int a, int b) {
    return a + b;
}

static void printGreeting(String name) {
    System.out.println("Hello " + name + "!");
}
```

- `void` bedeutet: die Methode gibt nichts zurück.
- Der Aufruf `add(2, 3)` liefert `5` als Ausdruck, den man z. B. einer
  Variable zuweisen kann.

---

## Wann lohnt sich eine eigene Methode?

- Code wird an mehreren Stellen gebraucht (Wiederverwendung).
- Ein Ablaufschritt hat einen klaren, benennbaren Zweck (Lesbarkeit).
- Ein Teil soll unabhängig testbar sein.

```java
public static void main(String[] args) {
    int sum = add(4, 7);
    printGreeting("Anna");
    System.out.println("Sum: " + sum);
}
```

**Grenze:** Eine Methode ohne `return`-Anweisung, aber mit Rückgabetyp
ungleich `void`, ist ein Compilerfehler ("missing return statement").

**Checkpoint:** Du kannst eine Methode mit zwei `int`-Parametern schreiben,
die eine berechnete `int`-Zahl zurückgibt.

Weiter geht es mit Lab 3.2: ZahlenJagd als erste eigene Methode.
