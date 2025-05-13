import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. List All Books");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                }
                case 2 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int id = scanner.nextInt();
                    library.removeBook(id);
                }
                case 3 -> {
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    library.searchBook(keyword);
                }
                case 4 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = scanner.nextInt();
                    library.issueBook(id);
                }
                case 5 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = scanner.nextInt();
                    library.returnBook(id);
                }
                case 6 -> library.listBooks();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
// Note: The above a simple console-based library management system. It allows adding, removing, searching, issuing, and returning books. The user can interact with the system through a menu-driven interface.
// The `Library` class manages the collection of books, while the `Book` class represents individual book objects. The `Main` class contains the main method to run the application.
// The code is designed to be simple and straightforward, focusing on basic functionality without any advanced features or error handling.