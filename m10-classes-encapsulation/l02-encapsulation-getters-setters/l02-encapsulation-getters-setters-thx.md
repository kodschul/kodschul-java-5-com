# Modul 10: Klassen, Objekte und Kapselung

## Lab 10.2 – Kapselung: private Felder, Getter/Setter

---

## Lab-Ziel

Nach diesem Lab machst du Attribute `private` und stellst kontrollierten
Zugriff über Getter (und ggf. Setter) bereit.

**Leitfragen:**

<details>
<summary>Warum Attribute private machen statt sie direkt zugänglich zu lassen?</summary>

Damit der Zugriff kontrolliert erfolgt (z. B. keine ungültigen Werte von
außen gesetzt werden können) und die interne Umsetzung später geändert
werden kann, ohne den Aufrufer-Code anzupassen.

</details>

<details>
<summary>Braucht jedes Attribut zwingend einen Setter?</summary>

Nein - ein Attribut, das nach der Konstruktion nie mehr geändert werden
soll (z. B. `final`), braucht nur einen Getter, keinen Setter.

</details>

---

## Von öffentlichen zu privaten Feldern

```java
public class Player {

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
}
```

```java
Player player = new Player("Anna", 4);
System.out.println(player.getName() + ": " + player.getAttempts());
// player.name = "Ben"; // nicht mehr möglich - name ist private
```

- `private final` verhindert sowohl direkten Zugriff von außen als auch
  eine Änderung nach der Konstruktion.
- Getter (`getName`, `getAttempts`) stellen einen kontrollierten,
  lesenden Zugriff bereit.

**Checkpoint:** Ein direkter Zugriff auf `player.name` von außerhalb der
Klasse führt zu einem Compile-Fehler; die Getter liefern die korrekten
Werte.

Weiter geht es mit Lab 10.3: ZahlenJagd-Logik in eine Klasse umbauen.
