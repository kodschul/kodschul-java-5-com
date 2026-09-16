public class ArrayIteration {

    public static void main(String[] args) {
        int[] values = { 42, 17, 73, 50, 8 };

        // indexed for-loop: index is available
        for (int i = 0; i < values.length; i++) {
            System.out.println("Index " + i + ": " + values[i]);
        }

        // for-each: simpler, but no index available
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / (double) values.length));

        int min = values[0];
        int max = values[0];
        for (int value : values) {
            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
