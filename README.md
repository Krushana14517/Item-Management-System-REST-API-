# Item Management System REST API 🚀

A robust Spring Boot RESTful API designed to manage an e-commerce product catalog. This project demonstrates full CRUD (Create, Read, Update, Delete) operations using an in-memory data store.

---

## 🛠️ Implementation Details

* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Data Storage:** ArrayList (In-memory)
* **ID Generation:** `AtomicInteger` (Thread-safe auto-increment starting from 101)
* **Validation:** Jakarta Validation (Hibernate Validator)
* **Hosting:** Railway

---

## 📋 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/addItem` | Add a new item (ID generated automatically) |
| **GET** | `/getItem` | Retrieve all items in the store |
| **GET** | `/getItem/{id}` | Retrieve a specific item by ID |
| **PUT** | `/update/{id}` | Update details of an existing item |
| **DELETE** | `/delete/{id}` | Remove an item from the store |

---

## 🚀 How to Run the Project

### 1. Prerequisites
Ensure you have the following installed:
* **JDK 17** or higher
* **Maven 3.6+**
* An IDE (IntelliJ IDEA, Eclipse, or VS Code)

### 2. Setup & Execution
1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/Krushana14517/Item-Management-System-REST-API-.git](https://github.com/Krushana14517/Item-Management-System-REST-API-.git)
    cd Item-Management-System-REST-API-
    ```
2.  **Build the Project:**
    ```bash
    mvn clean install
    ```
3.  **Run the Application:**
    ```bash
    mvn spring-boot:run
    ```
    *The API will be accessible at: `http://localhost:8080`*

---

## 💡 Key Technical Highlights

* **Data Integrity & Validation:** Uses `@NotBlank` and `@Positive` annotations to ensure high-quality data input.
* **Search Strategy:** Iterates through the list to match IDs, avoiding `IndexOutOfBoundsException`.
* **Safe Deletion:** Implemented `java.util.Iterator` to prevent `ConcurrentModificationException` during item removal.
* **In-Memory Store:** Uses a thread-safe approach with `ArrayList`, though data resets upon server restart.



---

## 🧪 Sample API Usage

**Endpoint:** `POST /addItem`  
**URL:** `https://item-management-system-rest-api-production-48b5.up.railway.app/getItem`  
**URL:** `https://item-management-system-rest-api-production-48b5.up.railway.app/addItem`  
**Body (JSON):**
```json
{
  "name": "Gaming Keyboard",
  "description": "Mechanical RGB keyboard with blue switches.",
  "price": 59.99,
  "category": "Peripherals"
}
```

---

## 👤 Author

**Krushna Prakash Mahajan** *Java Backend Developer*
