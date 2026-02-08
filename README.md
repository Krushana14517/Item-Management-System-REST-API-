# Item Management System REST API 🚀

A robust Spring Boot RESTful API designed to manage an e-commerce product catalog. This project demonstrates full CRUD (Create, Read, Update, Delete) operations using an in-memory data store.

## 🛠️ Implementation Details
- **Language:** Java 17+
- **Framework:** Spring Boot 3.x
- **Data Storage:** ArrayList (In-memory)
- **ID Generation:** `AtomicInteger` (Thread-safe auto-increment starting from 101)
- **Validation:** Jakarta Validation (Hibernate Validator)
- **Hosting:** Railway

## 📋 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/addItem` | Add a new item (ID generated automatically) |
| **GET** | `/getItem` | Retrieve all items in the store |
| **GET** | `/getItem/{id}` | Retrieve a specific item by its unique ID |
| **PUT** | `/{id}` | Update details of an existing item |
| **DELETE** | `/delete/{id}` | Remove an item from the store |



## 💡 Key Technical Highlights

1. **Data Integrity & Validation:** We use Jakarta Validation annotations to ensure data quality:
   - `@NotBlank`: Ensures names and categories are not empty.
   - `@Positive`: Ensures prices are always greater than zero.

2. **Search & Safety Logic:**
   - **Search Strategy:** Instead of using `.get(index)`, the system iterates through the list to match the specific `Integer id`. This prevents `IndexOutOfBoundsException`.
   - **Safe Deletion:** Used `java.util.Iterator` in the delete method to prevent `ConcurrentModificationException` while removing items from the list.

3. **In-Memory Store:**
   - Data is stored in an `ArrayList`. 
   - **Note:** Since it's an in-memory store, the data will reset whenever the server restarts or redeploys on Railway.

## 🧪 Sample Request (getITem/addItem)
**URL:** `https://item-management-system-rest-api-production-48b5.up.railway.app/getItem/101`
**URL:** `https://item-management-system-rest-api-production-48b5.up.railway.app/addItem`  
**Method:** `POST`  
**Headers:** `Content-Type: application/json`

**Body (JSON):**
```json
{
  "name": "Gaming Keyboard",
  "description": "Mechanical RGB keyboard with blue switches.",
  "price": 59.99,
  "category": "Peripherals"
}
```
## 👤 Author
**Krushna Prakash Mahajan** *Java Backend Developer*
