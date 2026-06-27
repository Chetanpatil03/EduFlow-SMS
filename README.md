# EduFlow-SMS 🎓

EduFlow-SMS is a **Student Management System** built using **Java (MVC architecture)** to manage students, teachers, and admin operations in an educational institution.  
The system provides role-based access and a user-friendly web interface for smooth academic management.

---

## 🚀 Features

### 👤 Admin Module
- Admin authentication
- Manage teachers (add, update, view)
- Manage students
- Dashboard with side navigation menu
- System confguration and monitoring

### 👨‍🏫 Teacher Module
- Teacher login
- View assigned students
- Manage academic data
- Access personal dashboard

### 🎓 Student Module
- Student login
- View personal and academic details
- Access notices and information

---

## 🏗️ Project Structure

```

EduFlow-SMS
│
├── src/main
│   ├── java
│   │   ├── controller
│   │   │   ├── admin
│   │   │   ├── auth
│   │   ├── dao
│   │   ├── model
│   │   ├── service
│   │   └── util
│   │
│   ├── resources
│   │
│   └── webapp
│       ├── WEB-INF
│       ├── admin
│       ├── student
│       ├── teacher
│       ├── style
│       └── *.jsp
│
└── README.md

````

---

## 🛠️ Technologies Used

- **Backend:** Java, Servlets, JSP
- **Architecture:** MVC (Model-View-Controller)
- **Frontend:** HTML, CSS, JSP
- **Database:** MySQL
- **Server:** Apache Tomcat
- **Version Control:** Git & GitHub

---

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/chetanpatil45/EduFlow-SMS.git
  ``

2. **Import project**

   * Open Eclipse / IntelliJ
   * Import as **Maven / Dynamic Web Project**

3. **Configure Database**

   * Create a MySQL database
   * Update DB credentials in your DAO or config file

4. **Run on Server**

   * Deploy project on **Apache Tomcat**
   * Access via browser:

     ```
     http://localhost:8080/EduFlow-SMS
     ```

---

## 🔐 Authentication Flow

* Role-based login (Admin / Teacher / Student)
* Session management for security
* Protected routes using filters (if implemented)

---

## 📌 Future Enhancements

* Attendance management
* Marks & result module
* Email / SMS notifications
* REST API integration
* Spring Boot migration

---

## 👨‍💻 Author

**Chetan Patil**<br>
Java Developer | Student
