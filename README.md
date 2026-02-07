# Item-Management-System-REST-API-
A robust Spring Boot RESTful API designed to manage an e-commerce product catalog. This project demonstrates full CRUD (Create, Read, Update, Delete) operations using an in-memory data store.


## Implementation Details
Language: Java 17+.<br>
Framework: Spring Boot 4.0.
Data Storage: ArrayList (In-memory).
ID Generation: AtomicInteger (Thread-safe auto-increment starting from 101).
Validation: Hibernate Validator (Jakarta Validation).


## 🛠️ API Endpoints
Method	Endpoint	      Description
POST  	/addItem	      Add a new item (ID generated automatically).
GET	    /getItem	      Retrieve all items in the store.
GET	    /getItem/{id}	  Retrieve a specific item by its unique ID.
PUT    	/{id}           Update details of an existing item.
DELETE	/delete/{id}	  Remove an item from the store


## 📋 Implementation Details

### 1. Data Integrity & Validation
We use Jakarta Validation annotations to ensure data quality:
@NotBlank: Ensures names and categories are not empty.
@Size(min = 10): Ensures descriptions provide enough detail.
@Positive: Ensures prices are always greater than zero.

### 2. Logic Choices
Search Strategy: Instead of using .get(index), we iterate through the list to match the specific Integer id. This prevents IndexOutOfBoundsException.
Safe Deletion: Used java.util.Iterator in the delete method to prevent ConcurrentModificationException while removing items from the list.
Wrapper Classes: Used Integer and Double to support null handling during JSON parsing.


## 💻 How to Run the Project

### Prerequisites
Java 17 or higher
Maven 3.6+

### Steps
1.Clone the Repository:
Bash
git clone https://github.com/Krushana14517/item-crud-api.git

2.Build the Application:
Bash
mvn clean install

3.Run the Application:
Bash
mvn spring-boot:run

4.Test the API: The server will start at http://localhost:8080. You can use Postman to test the endpoints.


## 🧪 Sample Request (POST /addItem)
Body (JSON):

JSON
{
  "name": "Gaming Keyboard",
  "description": "Mechanical RGB keyboard with blue switches.",
  "price": 59.99,
  "category": "Peripherals"
}


## 👤 Author
Krushna Prakash Mahajan Java Backend Developer



