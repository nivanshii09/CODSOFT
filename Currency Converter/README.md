# Currency Converter

A Java-based console application that allows users to convert values between different currencies. This project was developed as **Project 1** during the CodSoft Java Development Internship.

The application demonstrates Java Object-Oriented Programming concepts, clean code structure, and modular design principles.

---

## Project Overview

The Currency Converter provides a simple way to convert amounts from one currency to another using predefined exchange rates. The project is designed with separate classes for currency handling, exchange rate management, conversion logic, and user interaction.

---

## Features

- Convert amounts between multiple currencies
- Supports INR, USD, EUR, GBP, and JPY
- Console-based user interface
- Currency validation
- Amount validation
- Object-Oriented Programming implementation
- Clean and maintainable project structure

---

## Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| VS Code | Development Environment |
| HashMap | Exchange Rate Storage |
| OOP Concepts | Application Design |

---

## Project Structure

```
CurrencyConverter
│
├── src
│   │
│   ├── Main.java
│   ├── Currency.java
│   ├── ExchangeRateService.java
│   ├── CurrencyConverter.java
│   └── UserInterface.java
│
├── README.md
└── .gitignore
```

---

## OOP Concepts Used

### Encapsulation
Private variables and public methods are used to control data access.

### Abstraction
Conversion logic and user interaction are separated into different classes.

### Classes and Objects
The project uses multiple classes to represent different responsibilities.

### Modularity
Each class performs a specific task, making the application easier to maintain and extend.

---

## Supported Currencies

| Currency Code | Currency Name |
|--------------|---------------|
| INR | Indian Rupee |
| USD | US Dollar |
| EUR | Euro |
| GBP | British Pound |
| JPY | Japanese Yen |

---

## How to Run

### Clone the Repository

```bash
git clone https://github.com/your-username/CurrencyConverter.git
```

### Compile the Project

```bash
javac src/*.java
```

### Run the Application

```bash
java -cp src Main
```

---

## Sample Output

```
==================================
      Currency Converter
==================================

Supported Currencies:
- INR
- USD
- EUR
- GBP
- JPY

Enter Source Currency: USD
Enter Target Currency: INR
Enter Amount: 100

========== Result ==========
100.00 USD = 8333.33 INR
```

---

## Future Improvements

- Integration with real-time currency exchange APIs
- Graphical User Interface (GUI)
- Database support
- Currency conversion history
- Automated testing

---

## Author

Your Name

---

## Internship Details

Project 1  
CodSoft Java Development Internship