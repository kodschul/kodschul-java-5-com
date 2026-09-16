import java.util.ArrayList;
import java.util.HashSet;

public class ContactBookSolution {

    static class Contact {

        private final String name;
        private final String phone;

        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        String getName() {
            return name;
        }

        String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return name + " (" + phone + ")";
        }
    }

    public static void main(String[] args) {
        String[] rawEntries = { "Anna:0151111", "Ben:0152222", "Anna:0151111", "Cem:0153333" };

        ArrayList<Contact> contacts = new ArrayList<>();
        HashSet<String> knownNames = new HashSet<>();

        for (String entry : rawEntries) {
            try {
                String[] parts = entry.split(":");
                String name = parts[0];
                String phone = parts[1];

                if (knownNames.contains(name)) {
                    System.out.println("Skipping duplicate: " + name);
                    continue;
                }

                contacts.add(new Contact(name, phone));
                knownNames.add(name);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Skipping malformed entry: " + entry);
            }
        }

        System.out.println("All contacts:");
        for (Contact contact : contacts) {
            System.out.println("- " + contact);
        }

        String searchName = "Ben";
        Contact found = null;
        for (Contact contact : contacts) {
            if (contact.getName().equals(searchName)) {
                found = contact;
                break;
            }
        }
        System.out.println(found != null ? "Found: " + found : "Not found: " + searchName);
    }
}
