import books.Book;
import books.BookManager;
import journal.Journal;
import journal.JournalManager;

public class Main {
    public static void main(String[] args) {
        // Create book manager and add books
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("B001", "A001", "Book1", "Author1", "Publication1"));
        bookManager.addBook(new Book("B002", "A002", "Book2", "Author2", "Publication2"));

        // Create journal manager and add journals
        JournalManager journalManager = new JournalManager();
        journalManager.addJournal(new Journal("J001", "Journal1"));
        journalManager.addJournal(new Journal("J002", "Journal2"));

        // Display books and journals
        System.out.println("Books:");
        bookManager.displayBooks();
        System.out.println("\nJournals:");
        journalManager.displayJournals();
    }
}
