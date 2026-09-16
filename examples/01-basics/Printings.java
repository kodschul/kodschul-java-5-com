import java.util.Scanner;

/**
 * Modul 1: Einfuehrung - Uebersicht ueber Ausgabe- und Eingabemoeglichkeiten in Java.
 * Zeigt print, println, printf, String.format, Verkettung mit "+" und Scanner-Eingaben.
 */
public class Printings {

    public static void main(String[] args) {
        // println: gibt Text aus und springt danach in eine neue Zeile
        System.out.println("println: Zeile 1");
        System.out.println("println: Zeile 2");

        // print: gibt Text aus, OHNE danach eine neue Zeile zu beginnen
        System.out.print("print: ");
        System.out.print("bleibt ");
        System.out.print("in derselben Zeile");
        System.out.println(); // leerer println-Aufruf erzwingt den Zeilenumbruch

        // Verkettung mit "+": Texte und Variablen werden aneinandergehaengt
        String name = "Anna";
        int alter = 28;
        System.out.println("Name: " + name + ", Alter: " + alter);

        // printf: formatierte Ausgabe mit Platzhaltern (%s, %d, %f, ...)
        // %s = String, %d = ganze Zahl, %.2f = Kommazahl mit 2 Nachkommastellen
        System.out.printf("printf: %s ist %d Jahre alt%n", name, alter);
        System.out.printf("Preis: %.2f Euro%n", 19.999);

        // %n statt \n: plattformunabhaengiger Zeilenumbruch (empfohlen bei printf)
        System.out.printf("Zeile ueber %n printf mit %%n%n");

        // Platzhalter: %5d = mind. 5 Zeichen breit, rechtsbuendig (fuer Tabellen)
        System.out.printf("%5d Stueck%n", 7);

        // String.format: wie printf, aber das Ergebnis wird als String
        // zurueckgegeben statt sofort ausgegeben -> spaeter weiterverwendbar
        String satz = String.format("%s hat %d Punkte erreicht", name, 42);
        System.out.println(satz);

        // char-Ausgabe: einzelne Zeichen mit print/println moeglich
        char zeichen = 'X';
        System.out.println("Zeichen: " + zeichen);

        // Escape-Sequenzen: \n = Zeilenumbruch, \t = Tabulator, \" = Anfuehrungszeichen
        System.out.println("Erste Zeile\nZweite Zeile");
        System.out.println("Spalte1\tSpalte2");
        System.out.println("Er sagte: \"Hallo!\"");

        // Scanner: liest Eingaben von der Konsole (System.in)
        Scanner scanner = new Scanner(System.in);

        // nextLine(): liest eine ganze Zeile Text als String
        System.out.print("Wie heisst du? ");
        String eingabeName = scanner.nextLine();

        // nextInt(): liest eine ganze Zahl, wirft Fehler bei falscher Eingabe
        System.out.print("Wie alt bist du? ");
        int eingabeAlter = scanner.nextInt();

        // nextDouble(): liest eine Kommazahl
        System.out.print("Wie gross bist du (in Metern)? ");
        double eingabeGroesse = scanner.nextDouble();

        System.out.printf("Hallo %s, du bist %d Jahre alt und %.2f m gross.%n",
                eingabeName, eingabeAlter, eingabeGroesse);

        // Scanner am Ende schliessen, um Ressourcen freizugeben
        scanner.close();
    }
}
