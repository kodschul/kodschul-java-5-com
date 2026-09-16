# Lab 1.3 – Lösung: Typumwandlung und kombinierte Übung

## Vollständige Lösung

```java
public class TypUmwandlung {

    public static void main(String[] args) {
        String eingabeVersuche = "7";
        String eingabeMittelwert = "4.5";

        int versuche = Integer.parseInt(eingabeVersuche);
        double mittelwert = Double.parseDouble(eingabeMittelwert);
        int gerundeterMittelwert = (int) mittelwert;

        String ausgabe = "Versuche: " + versuche + ", Mittelwert: " + mittelwert
            + " (gerundet abgeschnitten: " + gerundeterMittelwert + ")";
        System.out.println(ausgabe);
    }
}
```

## Erwartete Ausgabe

```text
Versuche: 7, Mittelwert: 4.5 (gerundet abgeschnitten: 4)
```

## Begründung wichtiger Entscheidungen

- `Integer.parseInt`/`Double.parseDouble` statt manuellem Parsen, weil das
  die Standardwerkzeuge der Java-Standardbibliothek sind.
- Der Cast `(int) mittelwert` schneidet den Nachkommateil ab (`4.5` → `4`),
  rundet also nicht mathematisch – wichtig für Übung und Prüfung
  gleichermaßen.

## Gültige Alternativen

`Math.round(mittelwert)` würde stattdessen mathematisch runden (`4.5` → `5`
als `long`); für diese Übung ist explizit der abschneidende Cast gefordert.

## Erweiterung (Lösung)

Mit `eingabeMittelwert = "vier-komma-fünf";` wirft
`Double.parseDouble(eingabeMittelwert)` eine
`NumberFormatException: For input string: "vier-komma-fünf"` und das Programm
bricht ab. Das ist erwartetes Verhalten an dieser Stelle im Kurs – der
kontrollierte Umgang damit (`try-catch`) folgt in Modul 9.

## Grenzen

Ohne Exception Handling stürzt das Programm bei ungültiger Eingabe komplett
ab; das ist hier bewusst noch nicht abgefangen.
