import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book removed.");
    }

    public void searchBook(String keyword) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isIssued()) {
                book.issue();
                System.out.println("Book issued.");
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned.");
                return;
            }
        }
        System.out.println("Book not found or wasn't issued.");
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

