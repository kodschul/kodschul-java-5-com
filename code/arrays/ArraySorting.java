import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] values = { 42, 17, 73, 50, 8 };

        for (int pass = 0; pass < values.length - 1; pass++) {
            for (int i = 0; i < values.length - 1 - pass; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort: " + Arrays.toString(values));

        int[] values2 = { 42, 17, 73, 50, 8 };
        Arrays.sort(values2);
        System.out.println("Arrays.sort: " + Arrays.toString(values2));
    }
}
