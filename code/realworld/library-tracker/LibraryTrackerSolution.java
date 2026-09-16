import java.util.ArrayList;

public class LibraryTrackerSolution {

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

        System.out.println("Checkout 'Effective Java': " + checkout(catalog, "Effective Java"));
        System.out.println("Checkout 'Effective Java' again: " + checkout(catalog, "Effective Java"));

        System.out.println("Return 'Effective Java': " + returnBook(catalog, "Effective Java"));

        System.out.println("Books by Robert C. Martin:");
        searchByAuthor(catalog, "Robert C. Martin");

        System.out.println("Total books ever created: " + Book.getTotalBooks());
    }

    private static boolean checkout(ArrayList<Book> catalog, String title) {
        for (Book book : catalog) {
            if (book.getTitle().equals(title) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    private static boolean returnBook(ArrayList<Book> catalog, String title) {
        for (Book book : catalog) {
            if (book.getTitle().equals(title) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                return true;
            }
        }
        return false;
    }

    private static void searchByAuthor(ArrayList<Book> catalog, String author) {
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                System.out.println("- " + book);
            }
        }
    }
}
