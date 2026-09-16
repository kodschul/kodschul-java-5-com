# Lab 1.1 – Lösung: Primitive Datentypen und Variablen

## Vollständige Lösung

```java
public class Variablen {

    public static void main(String[] args) {
        int anzahlVersuche = 0;
        double durchschnitt = 4.5;
        boolean spielLaeuft = true;
        char schwierigkeitsgrad = 'L';

        System.out.println("Anzahl Versuche: " + anzahlVersuche);
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Spiel läuft: " + spielLaeuft);
        System.out.println("Schwierigkeitsgrad: " + schwierigkeitsgrad);

        anzahlVersuche = anzahlVersuche + 1;
        System.out.println("Neue Anzahl Versuche: " + anzahlVersuche);
    }
}
```

## Erwartete Ausgabe

```text
Anzahl Versuche: 0
Durchschnitt: 4.5
Spiel läuft: true
Schwierigkeitsgrad: L
Neue Anzahl Versuche: 1
```

## Begründung wichtiger Entscheidungen

- `int` für `anzahlVersuche`, weil Versuche immer ganzzahlig gezählt werden.
- `double` für `durchschnitt`, weil Mittelwerte i. d. R. keine ganzen Zahlen
  sind.
- `char` statt `String` für `schwierigkeitsgrad`, weil genau ein Zeichen
  benötigt wird – `String` wäre hier eine unnötig große Wahl (kommt in
  Lab 1.2 dazu).

## Gültige Alternativen

- `durchschnitt` kann jeden plausiblen Dezimalwert haben; der konkrete Wert
  ist nicht Teil der Prüfkriterien.
- Statt `anzahlVersuche = anzahlVersuche + 1;` ist `anzahlVersuche++;`
  gleichwertig.

## Erweiterung (Lösung)

```java
final int MAX_VERSUCHE = 10;
if (anzahlVersuche >= MAX_VERSUCHE) {
    System.out.println("Maximale Versuche erreicht.");
} else {
    System.out.println("Noch " + (MAX_VERSUCHE - anzahlVersuche) + " Versuche übrig.");
}
```

## Grenzen

`MAX_VERSUCHE` als `final` verhindert nur eine erneute Zuweisung im Code,
schützt aber nicht vor logischen Fehlern (z. B. falscher Vergleichsoperator).
