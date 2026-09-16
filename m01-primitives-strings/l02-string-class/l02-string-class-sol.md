# Lab 1.2 – Lösung: Die String-Klasse

## Vollständige Lösung

```java
public class StringUebung {

    public static void main(String[] args) {
        String vorname = "Ada";
        String nachname = "Lovelace";

        String vollerName = vorname + " " + nachname;
        System.out.println(vollerName);
        System.out.println(vollerName.length());
        System.out.println(vollerName.toUpperCase());
        System.out.println(vorname.equals("Ada"));

        String status = "Teilnehmer: " + vollerName + " (Zeichen: " + vollerName.length() + ")";
        System.out.println(status);
    }
}
```

## Erwartete Ausgabe

```text
Ada Lovelace
12
ADA LOVELACE
true
Teilnehmer: Ada Lovelace (Zeichen: 12)
```

## Begründung wichtiger Entscheidungen

- `.equals()` statt `==`, weil `==` bei Strings nur die Objektreferenz
  vergleicht und bei zur Laufzeit gebauten Strings zu falschen Ergebnissen
  führen kann.
- Verkettung mit `+` statt hartkodierten Texten, damit das Ergebnis bei
  anderen Namen automatisch korrekt bleibt.

## Gültige Alternativen

`String.format("%s %s", vorname, nachname)` liefert dasselbe Ergebnis wie
`vorname + " " + nachname`.

## Erweiterung (Lösung)

```java
String kurzform = vorname.substring(0, 1) + ". " + nachname;
System.out.println(kurzform); // A. Lovelace
```

## Grenzen

`substring(0, 1)` schlägt mit einer `StringIndexOutOfBoundsException` fehl,
wenn `vorname` ein leerer String ist – im Kurs noch nicht behandelt
(Exception Handling folgt in Modul 9).
