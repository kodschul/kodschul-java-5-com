/**
 * Modul 6: if-then-else-if vs. switch-case.
 * Beispiel: einfacher Taschenrechner nach Operator-Zeichen.
 */
public class VerzweigungSwitch {

    public static void main(String[] args) {
        double operand1 = 12;
        double operand2 = 5;
        char operator = '/';

        double result = calculate(operand1, operand2, operator);
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }

    // if-else-if: exklusive Verzweigung, Reihenfolge wird der Reihe nach geprueft
    private static double calculate(double a, double b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            return calculateWithSwitch(a, b, op);
        }
    }

    // switch: Abkuerzung fuer Verzweigung auf Basis eines einzelnen Werts
    private static double calculateWithSwitch(double a, double b, char op) {
        switch (op) {
            case '/':
                if (b == 0) {
                    System.out.println("Division durch 0 nicht erlaubt.");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Unbekannter Operator: " + op);
                return 0;
        }
    }
}
