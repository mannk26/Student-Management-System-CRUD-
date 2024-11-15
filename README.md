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

## Project Structure
src ├── main │ ├── java │ │ ├── in │ │ │ ├── mrityunjay │ │ │ │ ├── controller # REST controller classes │ │ │ │ ├── entity # Entity classes (Student, etc.) │ │ │ │ ├── exception # Custom exception classes │ │ │ │ ├── repository # Repository interfaces for data access │ │ │ │ ├── service # Service interfaces and implementations │ │ │ │ └── StudentCrudApplication.java # Main entry point for the application │ └── resources │ ├── application.properties # Application configuration │ └── static # Optional static resources (e.g., for UI) └── pom.xml # Project dependencies and build configuration

