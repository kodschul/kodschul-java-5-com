# Übungen: Ausdrücke

Quelle: `3302_IHV (3).pdf` Kap. 2.1.1, 2.2.2, 2.3.3, 2.4.1, 2.5.1, 2.5.2.
Status laut `02-plan.md` (SLF, Tag 1).

## 2.1.1 - Ausdrücke mit dem Modulo-Operator (optional)

1. Neue Klasse `Expressions_solution` in `x02_Expressions`: alle Ausdrücke
   aus dem Kapitel ausgeben, je einer pro Zeile.
2. Neue Klasse `Remainder_Modulo_operator_solution` (Umbenennung des
   JLS-Demo-Programms zu `%`), mit verschiedenen Vorzeichenkombinationen
   testen (siehe `lab01-sol.md`).

## 2.2.2 - Experimente mit Casts und Runden primitiver Datentypen (optional)

1. Neue Klasse `CastForPrimitivesSolution` in `x02_Expressions`.
2. Finden Sie eine Rundungsmethode in `Math` für `9.7304` und geben Sie das
   Ergebnis aus.
3. Probieren Sie interessante Casts aus und geben Sie sie aus:
   `long -> int` (mit einem Wert außerhalb des `int`-Bereichs, `L`-Suffix
   beachten), `int -> char` (Wert zwischen 1 und 128, z. B. `>= 32`),
   `boolean -> byte` (geht das überhaupt?).

## 2.3.3 - Erste Variablen deklarieren für ArithmeticTrainer (obligatorisch)

Neues Projekt/Modul `x03_Variables`, Klasse `VariablesForArithmeticTrainer`
mit `main`. Deklarieren und initialisieren Sie sechs Variablen: zwei
Operanden (`int`), den Operator (`char`), das Ergebnis (`int`), die
Benutzerlösung (`int`) und die Anzahl Aufgaben pro Runde (`int`). Geben Sie
alle sechs Werte aus.

## 2.4.1 - Ausdrücke mit Variablen aus ArithmeticTrainer (obligatorisch)

Kopie von `Boolean_expressions` als `Boolean_expressions_solution`.
Formulieren Sie folgende Aussagen als boolesche Ausdrücke, speichern Sie sie
je in einer eigenen Variablen und geben Sie sie sowohl über die Variable als
auch direkt aus:

- `3` ist kleiner als `noOfTasksPerRound`.
- `operand2` ist größer als `0`.
- Die Differenz aus `operand1` und `operand2` ist größer oder gleich `0`.
- `operand1` ist ungleich `operand2`, genauso wie `op` gleich `'/'` ist.

Zusätzlich: zeigen Sie mit der Modulo-Identität `(a/b)*b+(a%b) == a` (JLS
§15.17.3), dass sie für `operand1`/`operand2` gilt.

## 2.5.1 - Bool'sche Wahrheitstabellen generieren (optional)

Erzeugen Sie für `&`, `|`, `^` je eine vollständige Wahrheitstabelle mit
Ausgabe auf der Konsole.

## 2.5.2 - Debugging-Übung für Short-Circuit-Operatoren (optional)

Setzen Sie Breakpoints in einem Ausdruck mit `&&`/`||` und beobachten Sie im
Debugger, welcher Teilausdruck tatsächlich ausgewertet wird.
