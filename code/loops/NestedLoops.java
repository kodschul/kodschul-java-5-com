public class NestedLoops {

    public static void main(String[] args) {
        // multiplication table 1-5
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.printf("%3d", row * col);
            }
            System.out.println();
        }

        // stop the inner loop early with break
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j > i) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
