# 📇 Smart Contact Manager

A **Secure Web-Based Contact Management System** built with **Spring Boot** that allows users to securely manage their personal contacts. Users can register, log in, and efficiently organize their contacts with support for contact images, pagination, and CRUD operations.

---

## 🚀 Features

* 🔐 Secure User Authentication & Authorization using **Spring Security**
* 👤 User Registration (Sign Up)
* 🔑 User Login & Logout
* ➕ Add New Contacts
* 📝 Update Existing Contacts
* ❌ Delete Contacts
* 👀 View Contact Details
* 🖼️ Upload and Store Contact Images
* 📄 Pagination for Efficient Contact Browsing
* 🔒 User-Specific Contact Management
* 📱 Responsive UI with Thymeleaf Templates

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate

### Frontend

* HTML5
* CSS3
* JavaScript
* Thymeleaf

### Database

* MySQL

### Build Tool

* Maven

---

## 📂 Project Structure

```
Smart-Contact-Manager/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── helper/
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   ├── templates/
│   │   │   └── application.properties
│── pom.xml
│── README.md
```

---

## 📸 Application Modules

### Authentication

* User Registration
* Secure Login
* Logout
* Password Encryption using BCrypt

### Contact Management

* Add Contact
* Update Contact
* Delete Contact
* View Contact Details
* Store Contact Images
* Paginated Contact List

---

## 🔐 Security

The application uses **Spring Security** to provide:

* Secure Authentication
* Password Encryption (BCrypt)
* Role-Based Authorization
* Protected User Routes
* Session Management

Each user can only access and manage **their own contacts**.

---

## ⚙️ Installation

### Clone the Repository

```bash
git clone https://github.com/your-username/Smart-Contact-Manager.git
```

### Navigate to the Project

```bash
cd Smart-Contact-Manager
```

### Configure Database

Update `application.properties` with your MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/smartcontactmanager
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

Open your browser and visit:

```
http://localhost:8080
```

---

## 📸 Screenshots

<img width="1897" height="865" alt="Screenshot 2026-08-25 194052" src="https://github.com/user-attachments/assets/d099a3e4-8ab8-4b1a-8793-f820382ff87b" />


* Home Page
* Login Page
* Sign Up Page
* Dashboard
* Add Contact
* View Contacts
* Update Contact
* Contact Details
* Profile Page

---

## 👨‍💻 Author

**Yash Verulkar**

* GitHub: https://github.com/Yash5603

---

## ⭐ Support

If you found this project helpful, consider giving it a **⭐ Star** on GitHub!
