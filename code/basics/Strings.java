public class Strings {

    public static void main(String[] args) {
        String name = "  Anna  ";

        System.out.println("length: " + name.length());
        System.out.println("trim: '" + name.trim() + "'");
        System.out.println("upper: " + name.trim().toUpperCase());
        System.out.println("lower: " + name.trim().toLowerCase());
        System.out.println("contains 'nn': " + name.contains("nn"));
        System.out.println("replace: " + name.trim().replace("ANNA", "Ben"));

        String sentence = "Anna:4,Ben:7,Cem:2";
        String[] entries = sentence.split(",");
        System.out.println("split count: " + entries.length);
        for (String entry : entries) {
            System.out.println("entry: " + entry);
        }

        String greeting = "Hello" + ", " + "World" + "!";
        System.out.println(greeting);
    }
}
