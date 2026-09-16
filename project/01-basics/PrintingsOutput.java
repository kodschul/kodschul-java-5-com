public class PrintingsOutput {

    public static void main(String[] args) {

        System.out.println("Zeile 1");
        System.out.println("Zeile 2");

        System.out.print("print: ");
        System.out.print("bleibt ");
        System.out.print("in derselben Zeile ");
        System.out.println();

        String name = "Anna";
        float alter = 20;

        boolean isActive = true;
        int booleanNum = (int) isActive;

        System.out.println("Name: " + name + " Alter: " + alter);
        System.out.printf("Hallo %s, du bist %f Jahre alt!", name, alter);

    }
}
