# LibraryManagementSystem
A simple Library Management System implemented in Java using OOP and ArrayList. This project allows users to manage a library’s books, including features such as adding, removing, searching, issuing, and returning books.
🔧 Technologies & Concepts Used
Java

Object-Oriented Programming (OOP)

ArrayList

Basic Console I/O

File Handling (Bonus)

🚀 Features
✅ Add a Book
✅ Remove a Book
✅ Search for a Book by Title
✅ Issue a Book to a Student
✅ Return a Book
✅ View All Books
✅ (Bonus) Save/Load Books to/from a File

🗂️ Project Structure
bash
Copy
Edit
LibrarySystem/
├── Book.java                 # Book class with title, author, and availability
├── Library.java              # Handles all library operations using ArrayList
├── Main.java                 # Menu-driven main program
└── books.txt (optional)      # File for storing book data (bonus)
📥 How to Run
Step 1: Compile the code
Open command prompt in the project directory:

bash
Copy
Edit
cd path\to\LibrarySystem
javac *.java
Step 2: Run the program
bash
Copy
Edit
java Main
📝 Sample Menu
markdown
Copy
Edit
===== Library Menu =====
1. Add Book
2. Remove Book
3. Search Book
4. Issue Book
5. Return Book
6. View All Books
0. Exit
========================
🧠 Concepts Demonstrated
Java Classes and Objects

Method Encapsulation

ArrayList<Book> to store dynamic book data

File read/write using FileWriter and Scanner (Bonus)

Simple terminal UI

📦 Future Improvements
Add login/authentication

Track issued books per student

GUI using Java Swing or JavaFX

Use HashMap for faster search by book ID

