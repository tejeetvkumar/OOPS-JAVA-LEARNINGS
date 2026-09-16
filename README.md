# OOPS JAVA LEARNINGS

A collection of Java programs covering core Object-Oriented Programming (OOP) concepts — classes, constructors, inheritance, polymorphism, interfaces, exception handling, multithreading, and practical mini-projects.

## Repository Structure

```
JAVA-LEARNINGS/
├── README.md
├── 01-Basics/
│   ├── first.java              Hello World program
│   └── second.java             Constructor overloading demo
├── 02-Shapes/
│   └── ShapeTest.java          Inheritance + Polymorphism with Shape/Circle/Rectangle
├── 03-Interfaces/
│   └── RentableTest.java       Interface implementation (Rentable → Car, Bike)
├── 04-Payments/
│   └── Main.java               Payment interface with UPIPayment / CreditCardPayment
├── 05-Exception-Handling/
│   ├── BuiltInExceptions/
│   │   └── PredefinedExceptions.java   try-catch with Scanner, division by zero
│   └── CustomExceptions/
│       └── AgeValidation.java             Custom InvalidAgeException
├── 06-ATM/
│   └── ATMTest.java            ATM withdrawal with InsufficientBalanceException
├── 07-Multithreading/
│   ├── Runnable/
│   │   ├── Ticket.java         Implements Runnable for ticket booking
│   │   └── BookTicket.java     [BROKEN] Duplicate class name — see Practice
│   └── Synchronization/
│       ├── TicketBooking.java  Runnable class with synchronized booking
│       └── TicketCounter.java  Main class that starts threads
├── 08-Library/
│   ├── Book.java               Book class with encapsulation (getters/setters)
│   ├── BookDemo.java           Demo using Book class
│   ├── LibraryTest.java        Test Book class functionality
│   └── LibraryTest-old.java    [DUPLICATE] Identical to LibraryTest.java
└── 09-Practice/
```

## Concepts Covered

- **Classes & Objects** — defining classes, creating instances
- **Constructors** — default, parameterized, and overloaded constructors
- **Inheritance** — `extends` keyword, parent/child relationships
- **Polymorphism** — base-class references holding subclass objects, method overriding
- **Interfaces** — defining contracts, implementing multiple strategies
- **Encapsulation** — private fields with public getter/setter methods
- **Built-in Exceptions** — `try-catch` with `Scanner`, arithmetic exceptions
- **Custom Exceptions** — creating and throwing user-defined exception classes
- **Multithreading** — `Runnable` interface, `Thread`, `synchronized` methods
- **Mini-Projects** — Payment system, ATM, Library management

## Prerequisites

- Java JDK 8 or higher
- Terminal with `java` / `javac` in PATH

## How to Run

Compile and run from the project root:

```bash
# Compile a single file
javac 02-Shapes/ShapeTest.java
java -cp 02-Shapes ShapeTest

# Compile all files in a directory
javac 08-Library/*.java
java -cp 08-Library LibraryTest
```

> **Note:** No files use `package` declarations. Classes in the same folder reference each other directly — compile all `.java` files in that folder together.

## Known Issues

| File | Issue |
|------|-------|
| `07-Multithreading/Runnable/BookTicket.java` | Contains two classes both named `TicketCounter` — will not compile. Duplicate of `Ticket.java`. |
| `08-Library/LibraryTest-old.java` | Exact duplicate of `LibraryTest.java`. Kept for historical purposes. |
| `07-Multithreading/Synchronization/TicketCounter.java` | Requires `TicketBooking.java` in the same directory to compile. |

## Compilation Verification

To verify all files compile (excluding known broken files):

```bash
javac 01-Basics/*.java
javac 02-Shapes/*.java
javac 03-Interfaces/*.java
javac 04-Payments/*.java
javac 05-Exception-Handling/BuiltInExceptions/*.java
javac 05-Exception-Handling/CustomExceptions/*.java
javac 06-ATM/*.java
javac 07-Multithreading/Runnable/Ticket.java
javac 07-Multithreading/Synchronization/*.java
javac 08-Library/*.java
```

## Author

[tejeetvkumar](https://github.com/tejeetvkumar)
