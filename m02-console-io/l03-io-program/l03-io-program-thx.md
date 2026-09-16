# Modul 2: Konsolen-Ein-/Ausgabe

## Lab 2.3 – Das erste Ein-/Ausgabe-Programm

---

## Lab-Ziel

Nach diesem Lab hast du ein lauffähiges Ein-/Ausgabe-Programm gebaut, das
genau die Struktur hat, aus der ab Modul 3 das Kursprojekt ZahlenJagd
entsteht.

**Leitfragen:**

<details>
<summary>Was hat ein Ein-/Ausgabe-Programm mit ZahlenJagd zu tun?</summary>

ZahlenJagd beginnt als dieselbe Grundstruktur: Scanner anlegen, Eingabe
lesen, Wert prüfen, formatiert ausgeben. Ab Modul 3 wird daraus eine
eigene Methode.

</details>

<details>
<summary>Warum jetzt schon auf sprechende Variablennamen achten?</summary>

Der Code aus diesem Lab wird als Ausgangspunkt für ZahlenJagd wiederverwendet

- klare Namen erleichtern das Erweitern in den nächsten Modulen erheblich.

</details>

---

## Zwischenstand: ConsoleInputOutput

```java
import java.util.Scanner;

public class ConsoleInputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.printf("Hello %s, you are %d years old.%n", name, age);

        scanner.close();
    }
}
```

- Dieser Stand liegt als `output/project/starter/ConsoleInputOutput.java` im
  Kursprojekt und ist der Ausgangspunkt für Modul 3.
- Ab Modul 3 wird aus dieser Struktur die erste Methode von ZahlenJagd:
  Zufallszahl erzeugen statt Alter abfragen, Ratewert statt Kommentar prüfen.

**Checkpoint:** Dein Programm liest Name und Alter ein und gibt eine
formatierte Begrüßung aus - ohne Fehler bei normaler Eingabe.

Weiter geht es mit Modul 3: ZahlenJagd als Methode.
