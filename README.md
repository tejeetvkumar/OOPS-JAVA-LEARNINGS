# OOPS JAVA LEARNINGS

A collection of Java programs covering core Object-Oriented Programming (OOP) concepts — classes, constructors, inheritance, polymorphism, interfaces, exception handling, multithreading, collections, and practical mini-projects.

## Repository Structure

```
JAVA-LEARNINGS/
├── README.md
├── .gitignore                          Ignores compiled .class files
├── 01-Basics/
│   ├── first.java                      Hello World program
│   └── second.java                     Constructor overloading demo
├── 02-Shapes/
│   └── ShapeTest.java                  Inheritance + Polymorphism with Shape/Circle/Rectangle
├── 03-Interfaces/
│   └── RentableTest.java               Interface implementation (Rentable → Car, Bike)
├── 04-Payments/
│   └── Main.java                       Payment interface with UPIPayment / CreditCardPayment
├── 05-Exception-Handling/
│   ├── BuiltInExceptions/
│   │   └── PredefinedExceptions.java   try-catch with Scanner, division by zero
│   └── CustomExceptions/
│       └── AgeValidation.java          Custom InvalidAgeException
├── 06-ATM/
│   └── ATMTest.java                    ATM withdrawal with InsufficientBalanceException
├── 07-Multithreading/
│   ├── Runnable/
│   │   └── Ticket.java                 Implements Runnable for ticket booking
│   └── Synchronization/
│       ├── TicketBooking.java          Runnable class with synchronized booking
│       ├── TicketCounter.java          Main class that starts threads
│       └── Interthread.java            Interthread communication (wait/notify)
├── 08-Library/
│   ├── Book.java                       Book class with encapsulation (getters/setters)
│   ├── BookDemo.java                   Demo using Book class
│   └── LibraryTest.java                Test Book class functionality
├── 09-Practice/
│   ├── BookTicket.java                 Duplicate of Ticket.java — synchronized ticket booking
│   └── LibraryTestOld.java             Uses Book class from 08-Library
└── 10-Collection framework/
    ├── ArrayList1.java                 List/ArrayList operations (marks)
    ├── ShoppingCart.java               List/ArrayList operations (cart)
    └── CourseAnalysis.java             Set/HashSet operations (student IDs)
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
- **Interthread Communication** — `wait()`, `notify()`, and `synchronized` for producer/consumer scenarios
- **Collection Framework** — `List`, `ArrayList`, `Set`, `HashSet`, iterators
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
| `09-Practice/BookTicket.java` | Exact duplicate of `07-Multithreading/Runnable/Ticket.java` (both contain a `TicketCounter` Runnable class). Compiles fine on its own but kept as practice reference. |
| `09-Practice/LibraryTestOld.java` | References the `Book` class from `08-Library/`. Compile with `javac -cp 08-Library 09-Practice/LibraryTestOld.java`. |
| `10-Collection framework/CourseAnalysis.java` | Untracked — not yet committed to git. |
| `07-Multithreading/Synchronization/Interthread.java` | Contains an inner `bankaccount` class (lowercase) in the same file — relies on default package access. |

## Compilation Verification

To verify all files compile (excluding the untracked file):

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
javac 09-Practice/BookTicket.java
javac -cp 08-Library 09-Practice/LibraryTestOld.java
javac "10-Collection framework/ArrayList1.java"
javac "10-Collection framework/ShoppingCart.java"
javac "10-Collection framework/CourseAnalysis.java"
```

## Author

[tejeetvkumar](https://github.com/tejeetvkumar)
