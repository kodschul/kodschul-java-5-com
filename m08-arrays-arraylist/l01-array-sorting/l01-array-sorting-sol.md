# Lab 8.1 – Lösung: Einfache Sortierung

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
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
        System.out.println(Arrays.toString(values));

        int[] values2 = {42, 17, 73, 50, 8};
        Arrays.sort(values2);
        System.out.println(Arrays.toString(values2));
    }
}
```

## Begründung

`values.length - 1 - pass` in der inneren Schleife verkleinert den
betrachteten Bereich mit jedem Durchlauf, weil die größten Werte nach
jedem Durchlauf bereits an ihrer endgültigen Position (am Ende) stehen.

## Ausblick

Lab 8.2 zeigt, warum ein festes Array nicht immer ausreicht und wann eine
`ArrayList<T>` besser passt.
