import java.util.ArrayList;

public class LibraryTrackerStarter {

    static class Book {

        private static int totalBooks = 0;

        private final String title;
        private final String author;
        private boolean checkedOut;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.checkedOut = false;
            totalBooks++;
        }

        String getTitle() {
            return title;
        }

        String getAuthor() {
            return author;
        }

        boolean isCheckedOut() {
            return checkedOut;
        }

        void setCheckedOut(boolean checkedOut) {
            this.checkedOut = checkedOut;
        }

        static int getTotalBooks() {
            return totalBooks;
        }

        @Override
        public String toString() {
            return title + " by " + author + (checkedOut ? " (checked out)" : " (available)");
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> catalog = new ArrayList<>();
        catalog.add(new Book("Clean Code", "Robert C. Martin"));
        catalog.add(new Book("Effective Java", "Joshua Bloch"));
        catalog.add(new Book("The Pragmatic Programmer", "Andrew Hunt"));

        // TODO 1: implement checkout(catalog, "Effective Java") below, then call it
        // here
        // and print whether it succeeded.

        // TODO 2: implement returnBook(catalog, "Effective Java") below, call it, and
        // print whether it succeeded.

        // TODO 3: implement searchByAuthor(catalog, "Robert C. Martin") below, call it,
        // and print each matching book.

        System.out.println("Total books ever created: " + Book.getTotalBooks());
    }

    private static boolean checkout(ArrayList<Book> catalog, String title) {
        // TODO: loop over "catalog"; if a book's title matches and it's not already
        // checked out, call setCheckedOut(true) and return true. If it's already
        // checked out or not found, return false.
        return false;
    }

    private static boolean returnBook(ArrayList<Book> catalog, String title) {
        // TODO: loop over "catalog"; if a book's title matches and it IS checked out,
        // call setCheckedOut(false) and return true. Otherwise return false.
        return false;
    }

    private static void searchByAuthor(ArrayList<Book> catalog, String author) {
        // TODO: loop over "catalog" and print every book whose author matches.
    }
}
