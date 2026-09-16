# Lab 11.3 – Lösung: Comparable-Interface für sortierbare Highscore-Einträge

Eigene Referenzlösung; die offizielle Musterlösung liegt in solutions.zip.

## Vollständige Lösung

Identisch mit
`output/project/checkpoints/checkpoint-m11-inheritance/Player.java` und
`HighscoreDemo.java`:

```java
public class Player implements Comparable<Player> {

    private final String name;
    private final int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

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

```java
import java.util.ArrayList;
import java.util.Collections;

public class HighscoreDemo {

    public static void main(String[] args) {
        ArrayList<Player> highscores = new ArrayList<>();
        highscores.add(new Player("Anna", 4));
        highscores.add(new Player("Ben", 7));
        highscores.add(new Player("Cem", 2));
        highscores.add(new Player("Dana", 9));

        Collections.sort(highscores);

        System.out.println("Highscore list (sorted by attempts):");
        for (Player player : highscores) {
            System.out.println(player);
        }
    }
}
```

## Begründung

`Integer.compare(this.attempts, otherPlayer.attempts)` statt einer
manuellen Subtraktion (`this.attempts - otherPlayer.attempts`) vermeidet
mögliche Ganzzahlüberläufe bei sehr großen Werten und ist die von der
Java-Standardbibliothek empfohlene Vorgehensweise.

## Ausblick

Modul 12 (Tag 5) führt Schwierigkeitsauswahl, Highscore-Liste und alle
bisherigen Bausteine in einem finalen Projekt-Checkpoint zusammen.
