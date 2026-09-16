# Modul 4: Bedingungen

## Lab 4.2 – switch-case für Mehrfachauswahl

---

## Lab-Ziel

Nach diesem Lab wählst du zwischen mehreren festen Fällen mit `switch`
statt mit einer langen `if`/`else if`-Kette.

**Leitfragen:**

<details>
<summary>Wann ist switch besser lesbar als if/else if?</summary>

Wenn ein einzelner Wert (z. B. `String` oder `int`) gegen mehrere feste,
diskrete Möglichkeiten geprüft wird - z. B. eine Auswahl aus einer festen
Liste von Optionen.

</details>

<details>
<summary>Was passiert, wenn kein case zutrifft und kein default da ist?</summary>

Der `switch`-Block wird einfach übersprungen, ohne Fehler und ohne
Ausgabe - ein fehlender `default` kann also einen Fall stillschweigend
ignorieren.

</details>

---

## switch-Ausdruck (moderne Schreibweise)

```java
String difficultyInput = "2";

String difficultyLabel = switch (difficultyInput) {
    case "1" -> "easy";
    case "2" -> "hard";
    default -> "medium";
};

System.out.println("Difficulty: " + difficultyLabel);
```

- Der `->`-Pfeil-Syntax (seit Java 14) braucht kein `break`; jeder Zweig
  liefert genau einen Wert.
- `default` fängt jeden Fall ab, der zu keinem `case` passt - hier `medium`
  für alles außer `"1"` und `"2"`.

## Vergleich zur if/else-Variante

```java
String difficultyLabel;
if (difficultyInput.equals("1")) {
    difficultyLabel = "easy";
} else if (difficultyInput.equals("2")) {
    difficultyLabel = "hard";
} else {
    difficultyLabel = "medium";
}
```

Beide Varianten sind hier gleichwertig; `switch` wird lesbarer, je mehr
feste Fälle es gibt.

**Checkpoint:** Für die Eingaben `"1"`, `"2"` und einen beliebigen anderen
Wert liefert dein `switch` jeweils das erwartete Label.

Weiter geht es mit Modul 5: Schleifen.
