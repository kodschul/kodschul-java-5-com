# Modul 10: Klassen, Objekte und Kapselung

## Lab 10.1 – Klassen, Attribute, Konstruktoren

---

## Lab-Ziel

Nach diesem Lab schreibst du eine eigene Klasse mit Attributen und einem
Konstruktor und erzeugst davon mehrere Objekte.

**Leitfragen:**

<details>
<summary>Was ist der Unterschied zwischen einer Klasse und einem Objekt?</summary>

Die Klasse ist der Bauplan (welche Attribute/Methoden es gibt); ein Objekt
ist eine konkrete Instanz davon mit eigenen Werten für diese Attribute.

</details>

<details>
<summary>Wozu dient ein Konstruktor?</summary>

Er legt fest, wie ein Objekt bei der Erzeugung (`new Klasse(...)`)
initialisiert wird - z. B. welche Startwerte seine Attribute erhalten.

</details>

---

## Eine einfache Klasse mit Konstruktor

```java
public class Player {

    String name;
    int attempts;

    public Player(String name, int attempts) {
        this.name = name;
        this.attempts = attempts;
    }
}
```

```java
Player player1 = new Player("Anna", 4);
Player player2 = new Player("Ben", 7);

System.out.println(player1.name + ": " + player1.attempts);
System.out.println(player2.name + ": " + player2.attempts);
```

- `this.name = name` unterscheidet das Attribut (`this.name`) vom
  gleichnamigen Konstruktor-Parameter (`name`).
- Jedes Objekt (`player1`, `player2`) hat seine eigenen Attributwerte.

**Checkpoint:** Du erzeugst zwei `Player`-Objekte mit unterschiedlichen
Werten und liest deren Attribute korrekt aus.

Weiter geht es mit Lab 10.2: Kapselung mit privaten Feldern und
Getter/Setter.
