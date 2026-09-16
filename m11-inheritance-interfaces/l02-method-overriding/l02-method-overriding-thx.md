# Modul 11: Vererbung und Interfaces

## Lab 11.2 – Methoden mit @Override anpassen

---

## Lab-Ziel

Nach diesem Lab überschreibst du `toString()` in den Unterklassen, sodass
jede ihre eigene, unterscheidbare Textdarstellung hat.

**Leitfragen:**

<details>
<summary>Wozu dient die Annotation @Override?</summary>

Sie signalisiert dem Compiler, dass diese Methode eine Methode der
Basisklasse überschreiben soll - bei einem Tippfehler in der
Methodensignatur meldet der Compiler dann einen Fehler, statt einfach eine
neue, unbeabsichtigte Methode zu erzeugen.

</details>

<details>
<summary>Wann wird toString() automatisch aufgerufen?</summary>

Immer, wenn ein Objekt in einen String umgewandelt wird - z. B. bei
`System.out.println(objekt)` oder String-Verkettung mit `+`.

</details>

---

## toString() in Basis- und Unterklasse

```java
public class GuessingGame {
    // ...
    @Override
    public String toString() {
        return "GuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
```

```java
public class EasyGuessingGame extends GuessingGame {
    public EasyGuessingGame() {
        super(50, 12);
    }

    @Override
    public String toString() {
        return "EasyGuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
```

```java
GuessingGame game = new EasyGuessingGame();
System.out.println(game); // ruft automatisch toString() auf
```

- Obwohl die Variable vom Typ `GuessingGame` ist, wird zur Laufzeit die
  überschriebene Methode der tatsächlichen Klasse (`EasyGuessingGame`)
  aufgerufen - das nennt man Polymorphie.

**Checkpoint:** `System.out.println(new EasyGuessingGame())` gibt
"EasyGuessingGame{...}" aus, nicht "GuessingGame{...}".

Weiter geht es mit Lab 11.3: das Comparable-Interface für sortierbare
Highscore-Einträge.
