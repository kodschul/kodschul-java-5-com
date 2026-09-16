/**
 * Modul 1: Einfuehrung - Uebersicht ueber die 8 primitiven Datentypen in Java.
 */
public class Primitives {

    public static void main(String[] args) {
        // byte: 8 Bit, -128 bis 127 -> fuer sehr kleine Zahlen, spart Speicher
        byte kleineZahl = 100;

        // short: 16 Bit, -32.768 bis 32.767
        short mittlereZahl = 30000;

        // int: 32 Bit, Standardtyp fuer ganze Zahlen
        int alter = 28;

        // long: 64 Bit, fuer sehr grosse ganze Zahlen -> braucht das Suffix "L"
        long einwohnerzahl = 8_000_000_000L;

        // float: 32 Bit Kommazahl, weniger genau -> braucht das Suffix "f"
        float pi_ungenau = 3.14f;

        // double: 64 Bit Kommazahl, Standardtyp fuer Kommazahlen
        double pi_genau = 3.14159265358979;

        // char: ein einzelnes Unicode-Zeichen in einfachen Anfuehrungszeichen
        char zeichen = 'A';

        // boolean: nur true oder false, fuer Bedingungen und Zustaende
        boolean istWahr = true;

        System.out.println("byte: " + kleineZahl);
        System.out.println("short: " + mittlereZahl);
        System.out.println("int: " + alter);
        System.out.println("long: " + einwohnerzahl);
        System.out.println("float: " + pi_ungenau);
        System.out.println("double: " + pi_genau);
        System.out.println("char: " + zeichen);
        System.out.println("boolean: " + istWahr);

        // Ueberlauf: byte kann max. 127 speichern, danach springt der Wert ins Negative
        byte ueberlauf = 127;
        ueberlauf++;
        System.out.println("Ueberlauf bei byte (127 + 1): " + ueberlauf);

        // Typumwandlung (Cast): double -> int schneidet die Nachkommastellen ab
        double kommazahl = 9.99;
        int ganzeZahl = (int) kommazahl;
        System.out.println("Cast double -> int: " + ganzeZahl);
    }
}
