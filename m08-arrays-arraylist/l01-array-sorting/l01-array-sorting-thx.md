# Modul 8: Array-Algorithmen und ArrayList

## Lab 8.1 – Einfache Sortierung (Bubble Sort oder Arrays.sort)

---

## Lab-Ziel

Nach diesem Lab sortierst du ein Array sowohl mit einem selbst
geschriebenen einfachen Algorithmus als auch mit `Arrays.sort`.

**Leitfragen:**

<details>
<summary>Wie funktioniert Bubble Sort grob?</summary>

Benachbarte Elemente werden verglichen und vertauscht, falls sie in der
falschen Reihenfolge stehen. Das wird mehrfach über das ganze Array
wiederholt, bis keine Vertauschung mehr nötig ist - größere Werte
"blubbern" so ans Ende.

</details>

<details>
<summary>Warum selbst sortieren, wenn Arrays.sort existiert?</summary>

Um zu verstehen, wie Sortieren grundsätzlich funktioniert (Algorithmus-
Denken); in echtem Code verwendet man danach die eingebaute, getestete
`Arrays.sort`-Methode.

</details>

---

## Bubble Sort von Hand

```java
int[] values = {42, 17, 73, 50, 8};

for (int pass = 0; pass < values.length - 1; pass++) {
    for (int i = 0; i < values.length - 1 - pass; i++) {
        if (values[i] > values[i + 1]) {
            int temp = values[i];
            values[i] = values[i + 1];
            values[i + 1] = temp;
        }
    }
}
```

- Die äußere Schleife wiederholt die Durchläufe, die innere vergleicht
  jeweils benachbarte Elemente.
- Ein `temp`-Wert ist nötig, um zwei Werte zu vertauschen, ohne einen davon
  zu verlieren.

## Arrays.sort

```java
import java.util.Arrays;

int[] values2 = {42, 17, 73, 50, 8};
Arrays.sort(values2);
System.out.println(Arrays.toString(values2));
```

- `Arrays.sort` sortiert aufsteigend und in-place (das Array selbst wird
  verändert), ohne dass man den Algorithmus selbst schreiben muss.

**Checkpoint:** Beide Varianten liefern dasselbe sortierte Ergebnis:
`8, 17, 42, 50, 73`.

Weiter geht es mit Lab 8.2: vom festen Array zur `ArrayList<T>`.
