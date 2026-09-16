/**
 * Modul 8: Codestil (Konstanten statt magischer Zahlen) und Versionsschema.
 * Beispiel: konfigurierbares Menue eines Kopfrechen-Trainers.
 */
public class KonstantenUndVersionen {

    // benannte Konstante statt wiederkehrendem Literal
    private static final int NO_OF_TASKS_PER_ROUND = 10;
    private static final String APP_VERSION = "1.2.0"; // MAJOR.MINOR.PATCH

    public static void main(String[] args) {
        System.out.println("ArithmeticTrainer v" + APP_VERSION);
        System.out.println("Diese Runde hat " + NO_OF_TASKS_PER_ROUND + " Aufgaben.");

        printMenu();
    }

    private static void printMenu() {
        System.out.println("1) Benutzernamen setzen");
        System.out.println("2) Runde starten (" + NO_OF_TASKS_PER_ROUND + " Aufgaben)");
        System.out.println("3) Beenden");
    }
}
