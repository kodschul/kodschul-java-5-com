/**
 * Modul 9: Eigenheiten der String-Klasse.
 * Beispiel: Validierung eines Benutzernamens in einem Registrierungsformular.
 */
public class StringKlasse {

    public static void main(String[] args) {
        String rawUsername = "  MaxMustermann  ";

        // trim() liefert ein neues String-Objekt zurueck (String ist immutable)
        String username = rawUsername.trim();

        System.out.println("Original:  '" + rawUsername + "'");
        System.out.println("Getrimmt:  '" + username + "'");

        String expected = "maxmustermann";

        // Inhaltsvergleich: niemals ==, immer equals/equalsIgnoreCase
        boolean matches = username.equalsIgnoreCase(expected);
        System.out.println("Nutzername gueltig? " + matches);

        // == vergleicht Referenzen, nicht den Inhalt
        String a = "abc";
        String b = new String("abc");
        System.out.println("a == b: " + (a == b));           // false
        System.out.println("a.equals(b): " + a.equals(b));   // true
    }
}
