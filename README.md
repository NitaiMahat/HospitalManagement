# 🏥 Hospital Management System

A Spring Boot–based Hospital Management System designed for efficient patient data management with PostgreSQL integration. The system provides secure RESTful APIs, optimized database access, and a scalable layered architecture following industry best practices.

This project demonstrates strong backend engineering skills, including database design, REST API development, testing, and performance optimization.

---

## 📌 Project Overview

The Hospital Management System enables hospitals and clinics to manage patient records, perform advanced searches, and maintain accurate medical data using a modern backend architecture.

It was built using Spring Boot, Hibernate, and PostgreSQL with a focus on scalability, reliability, and maintainability.

---

## 🚀 Features

### 🔐 Patient Management
- Create, update, and delete patient records  
- Unique email validation  
- Composite uniqueness (name + birth date)  
- Automatic timestamp tracking  

### 🔍 Advanced Search & Filtering
- Search by name (partial & case-insensitive)  
- Filter by birth date range  
- Find patients by blood group  
- Email-based lookup  

### 📊 Database Optimization
- Indexed columns for faster queries  
- Composite keys for duplicate prevention  
- Aggregation queries for statistics  
- Bulk update support  

### 🧪 Testing & Reliability
- Unit and integration tests  
- Repository and service validation  
- Regression prevention  
- Data persistence verification  

### ⚙️ Automation & Configuration
- Automatic schema generation  
- Database seeding  
- Environment-based configuration  
- Maven build automation  

---

## 🛠️ Tech Stack

| Category     | Technologies                         |
|--------------|--------------------------------------|
| Language     | Java 21                               |
| Framework    | Spring Boot 3.5.6, Spring Web         |
| ORM          | Hibernate, Spring Data JPA            |
| Database     | PostgreSQL                           |
| Build Tool   | Maven                                |
| Testing      | JUnit 5, Spring Boot Test             |
| Utilities    | Lombok                               |
| Architecture | Entity–Repository–Service Layered    |

---

## 🏗️ Architecture

The system follows a layered architecture:

Controller → Service → Repository → Database


### Key Components
- Entity Layer: Database models with validation
- Repository Layer: JPA-based data access
- Service Layer: Business logic and transactions
- Controller Layer: REST API endpoints

### Design Patterns
- Layered Architecture  
- Dependency Injection  
- Repository Pattern  
- Transaction Management  

---

## 📂 Project Structure

src/
├── controller/
├── service/
├── repository/
├── model/
├── dto/
├── config/
└── main/


---

## ⚙️ Setup & Installation

### Prerequisites
- Java 21+
- Maven
- PostgreSQL
- Internet connection

### Steps

bash
# Clone the repository
git clone https://github.com/your-username/HospitalManagement.git

# Enter project directory
cd HospitalManagement

# Configure database in application.properties

# Build project
mvn clean install

# Run application
mvn spring-boot:run
Make sure PostgreSQL is running and your database credentials are correctly configured.

🧪 Testing
Run all tests using:

mvn test
Includes:

Repository tests

Service layer tests

Integration tests

📖 What I Learned
Through this project, I gained experience in:

Building scalable Spring Boot applications

Designing normalized databases

Optimizing SQL queries

Using JPA/Hibernate effectively

Implementing transactional services

Writing reliable unit tests

Applying clean architecture principles

Managing Maven projects

💼 Skills Demonstrated
RESTful API Development

Object-Oriented Programming

Database Design & Normalization

Hibernate/JPA ORM

SQL Optimization

Transaction Management

Unit & Integration Testing

Exception Handling

