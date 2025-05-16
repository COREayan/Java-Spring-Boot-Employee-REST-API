# 👨‍💼 Employee Management REST API

This is a Spring Boot project that implements basic CRUD(Create, Read, Update, Delete) operations for managing employee data via RESTful APIs. It serves as a foundational project to understand how Spring Boot works with REST endpoints and an MySQL database.

📌 Features
- Create a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete an employee
- RESTful API architecture
- MySQL Database

Well-structured with best practices using Spring Boot annotations

🧱 Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- JUnit and Mockito
- Docker

Backend Setup 
1. Clone the repositor:
2. Update the database configuration in <code>application.properties</code>
3. Build the project:
4. Run the application:


Flow of the Program 
1. Initally there is no table in database 'employee_directory' called 'employee'.
![img_1.png](Images_For_README/img_1.png)
2. After running the Spring Boot Application, 'employee' table is created.
![img.png](Images_For_README/img.png)
3. Initially, the table is blank.

![img.png](Images_For_README/img_2.png)
4. 

API Endpoints
1. Create Employee
- POST <code> /api/employees</code>
  {
  "firstName": "Jane",
  "lastName": "Smith",
  "email": "jane.smith@example.com"
  }
2. Get All Employees
- GET <code> /api/employees</code>
3. Get Employee by ID
- GET <code> /api/employees/1</code>
4. Update Employee
- PUT <code> /api/employees</code>
{
"id": 1,
"firstName": "Jane Updated",
"lastName": "Smith",
"email": "jane.updated@example.com"
}
5. Delete Employee
- DELETE <code> /api/employees/1</code>