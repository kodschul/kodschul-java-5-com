import java.util.ArrayList;
import java.util.HashSet;

public class ContactBookStarter {

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

        // TODO 1: for each entry in rawEntries, split it by ":" into name and phone.
        // If the name is already in knownNames, print "Skipping duplicate: <name>"
        // and don't add it again. Otherwise add a new Contact to "contacts" and
        // the name to "knownNames".
        // Bonus: wrap the split/access in try/catch (ArrayIndexOutOfBoundsException)
        // in case an entry has no ":" in it.

        // TODO 2: print every contact in "contacts" (one per line).

        // TODO 3: search "contacts" for a contact named "Ben" using a loop and print
        // it if found, otherwise print "Not found: Ben".
    }
}
