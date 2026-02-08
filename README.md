# Item Management System REST API 🚀

A robust Spring Boot RESTful API designed to manage an e-commerce product catalog. 

## 🛠️ Implementation Details
- **Language:** Java 17+
- **Framework:** Spring Boot 3.x
- **Data Storage:** ArrayList (In-memory)
- **ID Generation:** AtomicInteger (Thread-safe, starting from 101)
- **Validation:** Jakarta Validation (Hibernate Validator)

## 📋 API Endpoints
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/addItem` | Add a new item |
| **GET** | `/getItem` | Retrieve all items |
| **GET** | `/getItem/{id}` | Get item by ID |
| **PUT** | `/{id}` | Update an item |
| **DELETE** | `/delete/{id}` | Delete an item |

## 💡 Key Highlights
- **Safe Deletion:** Used `Iterator` to prevent `ConcurrentModificationException`.
- **Validation:** Enforced `@NotBlank` and `@Positive` for data integrity.
- **Error Handling:** Implemented `ResponseStatusException` for 404 Not Found scenarios.

## 👤 Author
**Krushna Prakash Mahajan** *Java Backend Developer*
