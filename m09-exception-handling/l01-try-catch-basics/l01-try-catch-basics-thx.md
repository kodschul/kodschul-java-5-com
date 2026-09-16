# Modul 9: Fehler abfangen

## Lab 9.1 – try-catch-Grundlagen

---

## Lab-Ziel

Nach diesem Lab fängst du eine Exception mit `try-catch` ab, statt das
Programm abstürzen zu lassen.

**Leitfragen:**

<details>
<summary>Was passiert ohne try-catch, wenn eine Exception auftritt?</summary>

Das Programm bricht sofort ab (Stacktrace wird ausgegeben) - alle
nachfolgenden Anweisungen werden nicht mehr ausgeführt.

</details>

<details>
<summary>Was steht typischerweise im catch-Block?</summary>

Eine sinnvolle Reaktion auf den Fehlerfall: eine Meldung an den Nutzer,
ein Standardwert, ein erneuter Versuch - nicht einfach nur "den Fehler
verschlucken" ohne Reaktion.

</details>

---

## try-catch am Beispiel einer Division

```java
int a = 10;
int b = 0;

try {
    int result = a / b;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}

System.out.println("Program continues.");
```

- Der `catch`-Block fängt genau den angegebenen Exception-Typ
  (`ArithmeticException`) ab.
- Ohne `try-catch` würde "Program continues." nie erreicht - das Programm
  würde bei der Division abbrechen.

**Checkpoint:** Dein Programm läuft nach einer abgefangenen Division durch
Null weiter, statt abzustürzen.

Weiter geht es mit Lab 9.2: ungültige Eingaben behandeln.
