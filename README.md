# Student CRUD Management System

This project is a **Student CRUD (Create, Read, Update, Delete) Management System** built using **Spring Boot**. The system allows users to manage student records, including creating new student entries, retrieving, updating, and deleting student data. It uses a MySQL database for data storage and provides a RESTful API for interacting with the student records.

This project is designed to provide a backend solution for managing student details in an educational institution or similar environments. It also includes **Swagger UI** integration for easy API testing and interaction.

## Features

- **Create Student**: Add new students with relevant details (name, age, department, etc.).
- **Read Students**: View all students or search for individual students by their ID.
- **Update Student**: Modify existing student records.
- **Delete Student**: Remove students from the system.
- **Swagger UI**: Interactive API documentation to view and test all available endpoints.
- **Exception Handling**: Custom exception management for handling cases where students are not found.

## Technologies Used

- **Spring Boot**: Framework used for creating the REST API.
- **Spring Data JPA**: Java Persistence API for managing database interactions.
- **MySQL**: Database used for storing student records.
- **Swagger UI**: For testing and documenting the REST APIs.
- **Lombok**: To reduce boilerplate code like getters, setters, and constructors.


## Setup and Installation

### Prerequisites

Before you start, ensure you have the following installed:

- **Java 11 or higher**
- **Maven**
- **MySQL** (or any other compatible relational database)

### Steps to Setup

1. **Clone the Repository**:
   Clone the repository to your local machine.
   ```bash
   git clone https://github.com/mannk26/Student-Management-System-CRUD-.git
   cd student-crud-management
   
2. **Configure the Database**:

    Set up a MySQL database (e.g., student_db).

   Update the application.properties file with your database connection details.

    Example:
   ```bash
     spring.datasource.url=jdbc:mysql://localhost:3306/student_db
     spring.datasource.username=root
     spring.datasource.password=root
     spring.jpa.hibernate.ddl-auto=update

4. **Run the Application:   Start the application using Maven**:
     ```bash
        mvn spring-boot:run

5. **Access Swagger UI**: Once the application is running, open your browser and navigate to:
   Copy code
   ```bash
   http://localhost:8080/swagger-ui.html

6. **Test the Endpoints**: You can use Swagger UI to interact with the API. The following endpoints are available:

   POST /api/student/create: Create a new student.
   
   GET /api/student/all: Retrieve all students.

   GET /api/student/find/{id}: Retrieve a student by ID.

   PUT /api/student/modify: Update an existing student.

   DELETE /api/student/remove/{id}: Delete a student by ID.

7. **API Documentation (Swagger UI)**
   Swagger UI is enabled in this project to help you easily explore and test the API.
   You can access it at the following URL when the application is running locally:
   Copy code
    ```bash
         http://localhost:8080/swagger-ui.html


## Contributing
   Contributions are welcome! If you find any bugs or want to add new features, feel free to fork the repository and submit a pull request. Please make sure to follow these guidelines:
   Fork the repository and create a new branch.
   Write clear commit messages.!

   Submit a pull request with a description of the changes.

**License**
This project is licensed under the MIT License - see the LICENSE file for details.


## A Peek into the Application
![Screenshot 2025-02-24 204749](https://github.com/user-attachments/assets/a8524389-caa4-464a-b626-1c1b4ca48d63)
![Screenshot 2025-02-24 204814](https://github.com/user-attachments/assets/b13c4772-f21b-4d93-8aed-b032cf2b984c)
![Screenshot 2025-02-24 204925](https://github.com/user-attachments/assets/b175ce23-45fd-4d8b-ab10-dafe2c7c1b47)



