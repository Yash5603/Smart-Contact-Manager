# 📇 Smart Contact Manager

A secure and user-friendly **Smart Contact Manager** web application built with **Spring Boot** that allows users to efficiently manage their personal contacts. The application provides secure authentication, contact management with image uploads, pagination, and RESTful APIs while following the MVC architecture and Spring Security best practices.

---

## 🚀 Features

### 🔐 Authentication & Security
- User Registration (Sign Up)
- Secure Login & Logout
- Password Encryption using BCrypt
- Spring Security Authentication & Authorization
- Session Management
- Protected User Routes

### 👤 Contact Management
- Add New Contact
- View Contact Details
- Update Existing Contact
- Delete Contact
- Upload Contact Profile Images
- Paginated Contact List
- User-specific Contact Management

### 🌐 REST API
- RESTful CRUD APIs
- JSON Request & Response
- HTTP Methods (GET, POST, PUT, DELETE)
- API integration with Spring Boot

---

# 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate
- REST API

### Frontend
- HTML5
- CSS3
- JavaScript
- Thymeleaf
- Bootstrap

### Database
- MySQL

### Build Tool
- Maven

### Version Control
- Git
- GitHub

---

# 📌 Functionalities

✔ User Registration

✔ User Login

✔ Secure Authentication

✔ Add Contact

✔ View Contacts

✔ Contact Details

✔ Update Contact

✔ Delete Contact

✔ Upload Contact Image

✔ Pagination

✔ REST APIs

✔ Logout

---

# 📂 Project Structure

```
Smart-Contact-Manager
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── config
│   │   │   ├── controller
│   │   │   ├── rest
│   │   │   ├── entity
│   │   │   ├── repository
│   │   │   ├── service
│   │   │   └── helper
│   │   │
│   │   ├── resources
│   │   │   ├── static
│   │   │   ├── templates
│   │   │   └── application.properties
│
├── pom.xml
└── README.md
```

---

# 🔒 Security

The application uses **Spring Security** to provide:

- BCrypt Password Encryption
- Secure Authentication
- Session-based Authorization
- Protected User Dashboard
- User-specific Contact Access

Each user can only manage **their own contacts**.

---

# ⚙️ Installation

## Clone the repository

```bash
git clone https://github.com/Yash5603/Smart-Contact-Manager.git
```

## Navigate into the project

```bash
cd Smart-Contact-Manager
```

## Configure MySQL

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/smart_contact_manager
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Build the project

```bash
mvn clean install
```

## Run

```bash
mvn spring-boot:run
```

Visit:

```
http://localhost:8080
```

---

# 📸 Screenshots

<img width="1897" height="865" alt="Screenshot 2026-08-25 194052" src="https://github.com/user-attachments/assets/e2029c17-d747-4468-aa40-a0ea6e6a1c68" />


- Home Page
- Login
- Registration
- Dashboard
- Add Contact
- View Contacts
- Contact Details
- Update Contact
- REST API Response

---

# 👨‍💻 Author

**Yash Verulkar**

GitHub: https://github.com/Yash5603

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub!
