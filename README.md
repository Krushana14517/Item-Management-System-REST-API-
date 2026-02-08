# Item-Management-System-REST-API<br>
A robust Spring Boot RESTful API designed to manage an e-commerce product catalog. This project demonstrates full CRUD (Create, Read, Update, Delete) operations using an in-memory data store.


## Implementation Details<br>
Language: Java 17+.<br>
Framework: Spring Boot 4.0.<br>
Data Storage: ArrayList (In-memory).<br>
ID Generation: AtomicInteger (Thread-safe auto-increment starting from 101).<br>
Validation: Hibernate Validator (Jakarta Validation).<br>


## 🛠️ API Endpoints<br>
Method	Endpoint	      Description<br>
POST  ->	( /addItem )	  --  Add a new item (ID generated automatically).<br>
GET	  ->   ( /getItem )	  --    Retrieve all items in the store.<br>
GET	  ->  ( /getItem/{id} )	--  Retrieve a specific item by its unique ID.<br>
PUT    ->	( /{id} )     --      Update details of an existing item.<br>
DELETE ->	( /delete/{id} )	--  Remove an item from the store<br>


## 📋 Implementation Details<br>

### 1. Data Integrity & Validation<br>
We use Jakarta Validation annotations to ensure data quality:<br>
@NotBlank: Ensures names and categories are not empty.<br>
@Size(min = 10): Ensures descriptions provide enough detail.<br>
@Positive: Ensures prices are always greater than zero.<br>

### 2. Logic Choices<br>
Search Strategy: Instead of using .get(index), we iterate through the list to match the specific Integer id. This prevents IndexOutOfBoundsException.<br>
Safe Deletion: Used java.util.Iterator in the delete method to prevent ConcurrentModificationException while removing items from the list.<br>
Wrapper Classes: Used Integer and Double to support null handling during JSON parsing.<br>


## 💻 How to Run the Project<br>

### Prerequisites<br>
Java 17 or higher<br>
Maven 3.6+<br>

### Steps<br>
1.Clone the Repository:<br>
Bash<br>
git clone https://github.com/Krushana14517/item-crud-api.git<br>

2.Build the Application:<br>
Bash<br>
mvn clean install<br>

3.Run the Application:<br>
Bash<br>
mvn spring-boot:run<br>

4.Test the API: The server will start at http://localhost:8080. You can use Postman to test the endpoints.<br>


## 🧪 Sample Request (POST /addItem)<br>
Body (JSON):<br>

JSON<br>
{<br>
  "name": "Gaming Keyboard",<br>
  "description": "Mechanical RGB keyboard with blue switches.",<br>
  "price": 59.99,<br>
  "category": "Peripherals"<br>
}<br>


## 👤 Author<br>
Krushna Prakash Mahajan Java Backend Developer<br>



