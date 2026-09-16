# Lab 8.2 – Lösung: Vom festen Array zur ArrayList\<T\>

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

```java
import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Ben");
        names.add("Cem");
        names.add("Dana");

        System.out.println(names);
        System.out.println(names.size());

        names.remove("Ben");
        System.out.println(names);
        System.out.println(names.size());
    }
}
```

## Begründung

`remove("Ben")` entfernt das erste Vorkommen des angegebenen Werts; die
Liste rückt danach automatisch zusammen - bei einem Array müsste man dafür
selbst ein neues, kleineres Array anlegen und alle verbleibenden Werte
manuell umkopieren.

## Zusatz

Ein festes `String[4]` kann Elemente nicht "entfernen" im eigentlichen
Sinn - man könnte höchstens eine Position auf `null` setzen, aber die
Array-Größe bliebe 4, und die Lücke müsste man selbst behandeln.

## Ausblick

Lab 8.3 verwendet genau dieses Muster für eine Highscore-Liste, die zuerst
im Array, dann in einer `ArrayList<String>` verwaltet wird.
