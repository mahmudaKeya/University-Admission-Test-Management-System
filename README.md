# University-Admission-Test-Management-System
A Spring Boot Project

University Admission Test Management System.  Java Spring Boot
This repository uses Java, SpringBoot and PostgreSQL.

Link: http://localhost:8080/api/v1/students

POST: http://localhost:8080/api/v1/students Add a new students information
Sample JSON for this request: { "id": "1", "name": "Rebeca", "email": "rebeca.jamal@gmail.com", "dob": "2000-01-05", "age": "21"} }
GET: http://localhost:8080/api/v1/students/{id}: Get student by id
DELETE: http://localhost:8080/api/v1/students/{id}: Delete student by id
PUT: http://localhost:8080/api/v1/students/{id}: Update student by id
POST: http://localhost:8080/api/v1/students: Posting new Information
Sample JSON for this request: { "name": "Bilal", "email": "bilal.ahmed@gmail.com", "dob": "1995-12-17"}
The code
In this repository to use PostgreSQL in Java, it is necessary to add some dependencies.

Dependencies (pom.xml file)
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true

server.error.include-message = always
