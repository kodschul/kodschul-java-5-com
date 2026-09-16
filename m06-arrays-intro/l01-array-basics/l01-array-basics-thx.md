# Modul 6: Arrays einführen

## Lab 6.1 – Warum ein Array? Deklaration und Zugriff

---

## Lab-Ziel

Nach diesem Lab deklarierst du ein Array fester Größe, greifst über einen
Index auf Elemente zu und kennst die Grenzen des Zugriffs.

**Leitfragen:**

<details>
<summary>Warum reicht eine einzelne Variable nicht, um mehrere Versuche zu speichern?</summary>

Eine einzelne `int`-Variable kann immer nur einen Wert gleichzeitig halten

- ein neuer Versuch würde den vorherigen überschreiben. Ein Array hält
  mehrere Werte unter einem Namen, adressiert über einen Index.

</details>

<details>
<summary>Was passiert bei einem Zugriff außerhalb der Array-Grenzen?</summary>

Eine `ArrayIndexOutOfBoundsException` zur Laufzeit - das Programm stürzt
ab, wenn der Index nicht abgefangen wird (siehe Modul 9).

</details>

---

## Array deklarieren und befüllen

```java
int[] attemptHistory = new int[5];

attemptHistory[0] = 42;
attemptHistory[1] = 17;

System.out.println(attemptHistory[0]);
System.out.println(attemptHistory.length);
```

- `new int[5]` legt die Größe fest auf 5 Elemente - sie kann danach nicht
  mehr geändert werden.
- Der Index beginnt bei `0`; das letzte gültige Element ist
  `attemptHistory[attemptHistory.length - 1]`.
- Nicht befüllte Elemente sind bei `int[]` automatisch `0` (Standardwert).

**Checkpoint:** Du kannst ein Array einer festen Größe deklarieren, an
einem bestimmten Index einen Wert setzen und wieder auslesen.

Weiter geht es mit Lab 6.2: ein Array in einer Schleife befüllen.
