# Modul 11: Vererbung und Interfaces

## Lab 11.3 – Comparable-Interface für sortierbare Highscore-Einträge

---

## Lab-Ziel

Nach diesem Lab implementiert `Player` das Interface `Comparable<Player>`,
sodass eine `ArrayList<Player>` direkt mit `Collections.sort` sortiert
werden kann.

**Leitfragen:**

<details>
<summary>Was verpflichtet ein Interface eine Klasse zu tun?</summary>

Ein Interface schreibt eine Menge von Methoden vor, die eine Klasse, die
es implementiert, bereitstellen muss - `Comparable<Player>` verlangt z. B.
die Methode `compareTo(Player other)`.

</details>

<details>
<summary>Warum ist das besser als das Lambda aus Modul 8 (attempts(a) - attempts(b))?</summary>

Die Vergleichslogik gehört jetzt fest zur `Player`-Klasse selbst (statt an
jeder Aufrufstelle neu definiert zu werden), und es gibt kein
fehleranfälliges Parsen eines Textformats wie `"Name:Versuche"` mehr.

</details>

---

## Comparable implementieren

```java
public class Player implements Comparable<Player> {

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() { return name; }
    public int getAttempts() { return attempts; }

    @Override
    public int compareTo(Player otherPlayer) {
        return Integer.compare(this.attempts, otherPlayer.attempts);
    }

    @Override
    public String toString() {
        return name + ": " + attempts + " attempts";
    }
}
```

## Direktes Sortieren mit Collections.sort

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Player> highscores = new ArrayList<>();
highscores.add(new Player("Anna", 4));
highscores.add(new Player("Ben", 7));
highscores.add(new Player("Cem", 2));
highscores.add(new Player("Dana", 9));

Collections.sort(highscores);

for (Player player : highscores) {
    System.out.println(player);
}
```

- `Collections.sort(highscores)` funktioniert ohne Lambda, weil `Player`
  bereits weiß, wie es sich mit anderen `Player`-Objekten vergleicht
  (`compareTo`).
- `Integer.compare(a, b)` liefert negativ/0/positiv je nachdem, ob `a`
  kleiner, gleich oder größer als `b` ist - das genügt `Collections.sort`.

**Checkpoint:** Die ausgegebene Liste ist aufsteigend nach `attempts`
sortiert, ohne dass an der Aufrufstelle eine Vergleichslogik geschrieben
werden musste.

Weiter geht es mit Modul 12 (Tag 5): Projektabschluss und finaler
Checkpoint.
