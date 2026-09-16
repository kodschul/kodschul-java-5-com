/**
 * Modul 4: Objekte erstellen und Referenzen speichern.
 * Beispiel: einfache Kontaktverwaltung, Referenzsemantik zeigen.
 */
public class ObjekteErstellen {

    public static void main(String[] args) {
        // Objekt erzeugen: new reserviert Speicher im Heap
        Contact contact = new Contact();
        contact.name = "Anna Beispiel";
        contact.phoneNumber = "0151-1234567";

        System.out.println(contact.name + ": " + contact.phoneNumber);

        // Referenz kopieren: beide Variablen zeigen auf dasselbe Objekt
        Contact sameContact = contact;
        sameContact.phoneNumber = "0151-9999999";

        // Aenderung ueber sameContact ist auch ueber contact sichtbar
        System.out.println("Ueber contact:     " + contact.phoneNumber);
        System.out.println("Ueber sameContact: " + sameContact.phoneNumber);
    }
}

// einfache Datenklasse ohne eigenen Konstruktor (Konstruktoren folgen in Modul 5)
class Contact {
    String name;
    String phoneNumber;
}
