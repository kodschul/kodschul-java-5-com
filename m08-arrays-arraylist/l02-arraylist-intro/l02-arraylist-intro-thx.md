# Modul 8: Array-Algorithmen und ArrayList

## Lab 8.2 – Vom festen Array zur ArrayList\<T\>

---

## Lab-Ziel

Nach diesem Lab verwendest du `ArrayList<T>` anstelle eines festen Arrays,
wenn die Anzahl der Elemente vorher nicht feststeht.

**Leitfragen:**

<details>
<summary>Was ist der zentrale Unterschied zwischen int[] und ArrayList<Integer>?</summary>

Ein Array hat eine feste Größe, die bei der Erzeugung festgelegt wird. Eine
`ArrayList` kann während der Laufzeit wachsen (`add`) und schrumpfen
(`remove`), ohne dass man die Größe vorher kennen muss.

</details>

<details>
<summary>Warum ArrayList<String> statt ArrayList<int[]> für eine Highscore-Liste?</summary>

Für den ersten Schritt reicht ein einfaches Textformat wie `"Name:Versuche"`

- das ist einfach zu verstehen und zu vergleichen. Eine saubere Lösung mit
  echten Objekten folgt erst in Modul 11.

</details>

---

## Warum ein Array hier an Grenzen stößt

```java
String[] highscoreArray = new String[3]; // Größe muss vorher feststehen
highscoreArray[0] = "Anna:4";
highscoreArray[1] = "Ben:7";
// Ein vierter Spieler passt nicht mehr, ohne ein neues, größeres Array anzulegen.
```

## ArrayList\<String\>: dynamisch wachsend

```java
import java.util.ArrayList;

ArrayList<String> highscoreList = new ArrayList<>();
highscoreList.add("Anna:4");
highscoreList.add("Ben:7");
highscoreList.add("Cem:2"); // beliebig viele weitere Einträge möglich
System.out.println(highscoreList);
System.out.println(highscoreList.size());
```

- `add` fügt an - keine feste Größe muss vorher bekannt sein.
- `size()` ersetzt `length` (ArrayList ist keine Array, sondern eine Klasse
  mit Methoden statt einem Feld).

**Checkpoint:** Du kannst erklären, wann ein Array ausreicht und wann eine
`ArrayList` nötig ist, und kennst `add`/`size` als Grundoperationen.

Weiter geht es mit Lab 8.3: die ZahlenJagd-Highscore-Liste.
