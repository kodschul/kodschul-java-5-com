import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Ben");
        names.add("Cem");

        System.out.println("List: " + names);
        System.out.println("Size: " + names.size());

        names.remove("Ben");
        System.out.println("After remove: " + names);

        names.add(0, "Dana"); // insert at a specific index
        System.out.println("After insert at 0: " + names);

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println("Contains 'Cem': " + names.contains("Cem"));
    }
}
