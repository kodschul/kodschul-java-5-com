package d1;

public class HelloWorld {

        public static void main(String[] args) {

                int num1 = 10;
                double num2 = 10;
                float num3 = 10;

                String abc = "";
                String cdef = new String();

                int snake_case = 10;
                int camelCase = 10;
                int PascalCase = 100;

                boolean isTrue = 3 * 4 == 12;

                double randomNumber = Math.random();

                int diceNumber = (int) ((randomNumber * 6) + 1);

                System.out.println("Dice:");
                System.out.println(diceNumber);

                System.out.println(Integer.MIN_VALUE + " ; " + Integer.MAX_VALUE);
                System.out.println(Double.MIN_VALUE + " ; " + Double.MAX_VALUE);

        }
}