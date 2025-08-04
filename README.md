# 🏦 Bank Management System (Java + MySQL)

A desktop-based Bank Management System built using Java Swing for GUI, MySQL for data storage, and JDBC for database interaction. It simulates core banking functions such as account login, deposit, withdrawal, fast cash, balance check, PIN change, and transaction history.

---

## 🗂️ Project Structure

### Database: `bankmanagementsystem`

#### 📋 Tables Used:

- **login**  
  Stores user credentials: `formno`, `cardnumber`, `pin`

- **signup / signupthree / signuptwo**  
  Store customer registration data (multi-step signup)

- **bank**  
  Stores transaction records: `pin`, `date`, `type`, `amount`

---

## ✅ Features

- Login using card number & PIN  
- Deposit & Withdraw money  
- View Mini Statement (Recent transactions)  
- Check Balance  
- Change PIN  
- Fast Cash (Quick withdrawal options)

---

## 💻 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java       | Core programming and GUI using Swing |
| MySQL      | Backend database |
| JDBC       | Java-MySQL connectivity |

---

## ⚙️ How to Run

1. **Clone or Download the Project**

2. **Setup MySQL Database**
   - Create a database named: `bankmanagementsystem`
   - Use the table names :
     - `login`, `signup`, `signupthree`, `signuptwo`, `bank`
   - Insert initial test data (sample login, transactions)

3. **Configure JDBC in Java Code**
   Update your DB connection URL:
   ```java
   Connection con = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "yourpassword"
   );
