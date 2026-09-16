# Modul 1: Primitive Datentypen, Variablen und Strings

## Lab 1.1 – Primitive Datentypen und Variablen deklarieren

---

## Lab-Ziel

Nach diesem Lab kennst du die wichtigsten primitiven Datentypen in Java,
deklarierst Variablen korrekt und weißt, wann `int`, `double` oder `boolean`
die richtige Wahl ist.

**Leitfragen:**

<details>
<summary>Welche primitiven Datentypen gibt es in Java und wofür stehen sie?</summary>

`int` (ganze Zahlen), `double` (Kommazahlen), `boolean` (wahr/falsch),
`char` (einzelnes Zeichen) sind die vier, die im Kursalltag am häufigsten
vorkommen. Java hat insgesamt acht primitive Typen.

</details>

<details>
<summary>Warum reicht `int` nicht für jede Zahl?</summary>

`int` speichert nur ganze Zahlen in einem festen Wertebereich
(ca. -2,1 bis +2,1 Milliarden). Für Kommazahlen braucht es `double`, für sehr
große Zahlen `long`.

</details>

<details>
<summary>Muss man den Typ einer Variable immer angeben?</summary>

Ja, Java ist statisch typisiert: Der Typ steht bei der Deklaration fest und
ändert sich danach nicht mehr. `var` erlaubt lediglich, den Typ vom Compiler
ableiten zu lassen – er bleibt trotzdem fix.

</details>

---

## Primitive Datentypen im Überblick

| Typ       | Beispielwert   | Verwendung                              |
| --------- | -------------- | --------------------------------------- |
| `int`     | `42`           | ganze Zahlen (Zähler, Anzahl Versuche)  |
| `double`  | `3.14`         | Kommazahlen (Mittelwerte, Messwerte)    |
| `boolean` | `true`/`false` | Ja/Nein-Zustände (z. B. "Spiel läuft?") |
| `char`    | `'A'`          | ein einzelnes Zeichen                   |

- Variablendeklaration: `<Typ> <Name> = <Wert>;`
- Namenskonvention: `camelCase`, sprechende Namen (`anzahlVersuche` statt `x`).

```java
int anzahlVersuche = 0;
double durchschnitt = 4.5;
boolean spielLaeuft = true;
char schwierigkeitsgrad = 'L';
```

**Grenze:** Ein `int` kann keine Kommazahl speichern – `int wert = 4.5;`
erzeugt einen Compilerfehler (Datenverlust), nicht nur eine Warnung.

---

## Variablen zuweisen und ändern

- Deklaration und Zuweisung können getrennt erfolgen:

```java
int punkte;
punkte = 10;
punkte = punkte + 5; // 15
```

- `final` verhindert eine spätere Neuzuweisung (z. B. für Konstanten wie
  `final int MAX_VERSUCHE = 10;`).

**Checkpoint:** Du kannst erklären, welchen Typ du für "Anzahl Versuche",
"Durchschnittswert" und "Spiel beendet?" wählst – und warum.

Weiter geht es mit Lab 1.2: die `String`-Klasse.
