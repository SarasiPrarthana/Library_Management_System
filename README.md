📚 Library Management System (Java CRUD Application)
🔹 Overview

The Library Management System is a Java-based CRUD application developed to efficiently manage the operations of a library.
It allows users to manage Books, Members, Authors, and Borrow Records with ease.

This project follows the MVC (Model-View-Controller) architecture and implements the Singleton Design Pattern for efficient database connection management.

🚀 Features
🧩 Core CRUD Modules
Module	Description
Book Management -	Add, update, delete, and view books with details such as title, author, ISBN, and category.
Member Management -	Register new members, update member information, and manage membership details.
Borrow Management -	Handle book issuing and returning operations with overdue checks.
Author Management -	Manage author records and link them with books.

🧠 Design Patterns Used
🔸 Singleton Pattern
The Singleton pattern is used for the database connection class, ensuring that only one connection instance exists throughout the entire application.

⚙️ Technologies Used

Java 22
MySQL (for database)
JavaFX (for GUI)
JDBC (for database connectivity)
Maven (for dependency management)
