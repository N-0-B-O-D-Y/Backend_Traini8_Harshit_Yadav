Project Name - "Traini8"

# Training Center Registry MVP

## Introduction
This project is a Minimal Viable Product (MVP) for a registry of government-funded training centers. It provides two main APIs: one for registering new training centers and another for retrieving the list of all registered centers. The project is built using Spring Boot.

## Requirements
- Java 8 or later
- Maven 3.6.3 or later
- IDE of your choice (IntelliJ IDEA, Eclipse, VSCode, STS)

## Project Structure

src
├── main
│   ├── java
│   │   └── com
│   │       └── assignment
│   │           └── Buyogo
│   │               ├── controller
│   │               │   └── TrainingCenterController.java
│   │               ├── ExceptionHandler
│   │               │   └── GlobalExceptionHandler.java
│   │               ├── model
│   │               │   ├── Address.java
│   │               │   └── TrainingCenter.java
│   │               ├── Repository
│   │               │   └── TrainingCenterRepo.java
│   │               ├── service
│   │               │   └── TrainingCenterService.java
│   │               └── Traini8Application.java
│   ├── resources
│   │   └── application.properties
├── test
│   └── java
│       └── com
│           └── assignment
│               └── Buyogo
│                   └── Traini8ApplicationTests.java
└── pom.xml


## Setup Instructions

### 1. Dependencies

The project relies on the following Maven dependencies which are specified in the pom.xml file:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>



### 2. Unzip 'Backend_Traini8_Harshit Yadav' files which is attached with the Email from 'hharshityadavv@gmail.com'


### 3. Configure the Database
Update the application.properties file to configure your database. For this project, I'm using an H2 in-memory database.

properties

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true


### 4. Build the Project
Use Maven to build the project:


### 5. Run the Application
Run the Spring Boot application:


### 6. Access the H2 Database Console
To access the H2 database console, navigate to http://localhost:8080/h2-console in your browser. Use the following credentials:
- *JDBC URL*: jdbc:h2:mem:centerdb
- *User Name*: sa
- *Password*:""


## API Endpoints

### For this project, I used 'Postman' API development tool to test my 'GET' & 'POST' APIs

#### 1. Register a New Training Center (POST)
- *URL*: /api/training-centers
- *Method*: POST
- *Request Body*:
  json
  {
    "centerName": "string",
    "centerCode": "string",
    "address": {
      "detailedAddress": "string",
      "city": "string",
      "state": "string",
      "pinCode": "string"
    },
    "studentCapacity": number,
    "coursesOffered": ["string"],
    "contactEmail": "string",
    "contactNumber": "string"
  }
  
- *Response*:
  json
  {
    "id": number,
    "centerName": "string",
    "centerCode": "string",
    "address": {
      "detailedAddress": "string",
      "city": "string",
      "state": "string",
      "pinCode": "string"
    },
    "studentCapacity": number,
    "coursesOffered": ["string"],
    "createdOn": number,
    "contactEmail": "string",
    "contactNumber": "string"
  }
  

#### 2. Get All Registered Training Centers (GET)
- *URL*: /api/training-centers
- *Method*: GET
- *Response*:
  json
  [
    {
      "id": number,
      "centerName": "string",
      "centerCode": "string",
      "address": {
        "detailedAddress": "string",
        "city": "string",
        "state": "string",
        "pinCode": "string"
      },
      "studentCapacity": number,
      "coursesOffered": ["string"],
      "createdOn": number,
      "contactEmail": "string",
      "contactNumber": "string"
    }
  ]
  

### Additional Information

#### Validation
- centerName: Required, maximum 40 characters.
- centerCode: Required, exactly 12 alphanumeric characters.
- address: Required, with fields detailedAddress, city, state, and pinCode.
- contactNumber: Valid 10-digit number.
- contactEmail: Valid email format if provided.

#### Exception Handling
Validation errors are handled by a global exception handler that returns meaningful error messages.

---

This README should guide you through setting up and running this "Traini8" project effectively.
