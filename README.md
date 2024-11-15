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
   git clone https://github.com/yourusername/student-crud-management.git
   cd student-crud-management
   
2. **Configure the Database**:

    Set up a MySQL database (e.g., studentdb).
    Update the application.properties file with your database connection details.
    Example:
     spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
     spring.datasource.username=root
     spring.datasource.password=root
     spring.jpa.hibernate.ddl-auto=update

3. **Run the Application**:   Start the application using Maven:
     mvn spring-boot:run

4. **Access Swagger UI**: Once the application is running, open your browser and navigate to:

bash
Copy code
http://localhost:8080/swagger-ui/ 

5. **Test the Endpoints**: You can use Swagger UI to interact with the API. The following endpoints are available:

   POST /api/student/create: Create a new student.
   GET /api/student/all: Retrieve all students.
   GET /api/student/find/{id}: Retrieve a student by ID.
   PUT /api/student/modify: Update an existing student.
   DELETE /api/student/remove/{id}: Delete a student by ID.

6. **API Documentation (Swagger UI)**
   Swagger UI is enabled in this project to help you easily explore and test the API.
   You can access it at the following URL when the application is running locally:
   bash
   Copy code
   http://localhost:8080/swagger-ui/

###Contributing
   Contributions are welcome! If you find any bugs or want to add new features, feel free to fork the repository and submit a pull request. Please make sure     to follow these guidelines:
   Fork the repository and create a new branch.
   Write clear commit messages.
   Submit a pull request with a description of the changes.

**License**
This project is licensed under the MIT License - see the LICENSE file for details.


