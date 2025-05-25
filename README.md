A robust and user-friendly Expense Tracker web application built with Spring Boot. This application allows users to manage their personal finances by tracking expenses and incomes, categorizing transactions, and viewing insightful reports.

📋 Table of Contents
Features

Tech Stack

Getting Started

Screenshots

License

🚀 Features
User Authentication: Secure registration and login functionalities using Spring Security.

Expense & Income Management: Add, edit, delete, and view transactions with ease.

Categorization: Organize transactions into customizable categories.

Reporting: Generate reports to analyze spending habits over time.

Responsive UI: Seamless user experience across devices.



🛠 Tech Stack
Backend: Java 17, Spring Boot, Spring Data JPA, Spring Security

Frontend: Thymeleaf, Bootstrap 5

Database: MySQL / H2 (for development)

Build Tool: Maven


🏁 Getting Started
Prerequisites
Java 17 or higher

Intellij IDEA

Maven 3.6+

MySQL Server (if not using H2)

Git

Installation
Clone the repository:

bash
Copy code
git clone https://github.com/Kamalikabose2001/Expense-Tracker-WebApplication.git
cd expense-tracker
Configure the database:



properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
For H2 (in-memory database):

No additional setup required. The application is pre-configured to use H2 for development purposes.

Build and run the application:

bash
Copy code
mvn clean install
mvn spring-boot:run
Access the application:

Web Interface: http://localhost:8080

Transactions
GET /api/transactions - Retrieve all transactions

GET /api/transactions/{id} - Retrieve a specific transaction

POST /api/transactions - Create a new transaction

PUT /api/transactions/{id} - Update an existing transaction

DELETE /api/transactions/{id} - Delete a transaction

Categories
GET /api/categories - Retrieve all categories

POST /api/categories - Create a new category

PUT /api/categories/{id} - Update an existing category

DELETE /api/categories/{id} - Delete a category

Note: All endpoints (except authentication) require a valid JWT token in the Authorization header.

📸 Screenshots

![Screenshot 2025-05-25 152804](https://github.com/user-attachments/assets/8552419a-676c-44e5-8b50-606ef79c36ca)

![Screenshot 2025-05-25 152929](https://github.com/user-attachments/assets/af625342-39cc-4b60-9309-67a12eb771ac)

![Screenshot 2025-05-25 154026](https://github.com/user-attachments/assets/395e6d5a-3ae7-4ad0-ae46-0a45905c6ef9)

![Screenshot 2025-05-25 154150](https://github.com/user-attachments/assets/f395cf1b-42c4-44f4-8b62-f6e42de096aa)

![Screenshot 2025-05-25 154243](https://github.com/user-attachments/assets/0b01b67e-5a63-452b-95ac-89ac7677c6f3)


📄 License
This project is licensed under the MIT License.








