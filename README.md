# OOPS JAVA LEARNINGS

A collection of Java programs covering core Object-Oriented Programming (OOP) concepts — constructors, inheritance, polymorphism, and method overriding.

## Repository Structure

| File | Concept Demonstrated |
|------|----------------------|
| `first.java` | Basic Java program — Hello World |
| `second.java` | Constructor overloading (default + parameterized) |
| `Constructor.java` | Constructor chaining with inheritance (`Parent` → `Child`) |
| `ShapeTest.java` | Method overriding — `Shape` base class with `Circle` and `Rectangle` subclasses |

## Concepts Covered

- **Classes & Objects** — defining classes, creating instances
- **Constructors** — default, parameterized, and overloaded constructors
- **Constructor Chaining** — using `super()` to invoke parent constructors
- **Inheritance** — `extends` keyword, parent/child relationships
- **Method Overriding** — `@Override` annotation, runtime polymorphism
- **Polymorphism** — base-class references holding subclass objects

## Prerequisites

- Java JDK 8 or higher
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or a terminal with `java`/`javac` in PATH

## How to Run

Compile and run any example from the project root:

```bash
javac FileName.java
java FileName
```

Example:
```bash
javac ShapeTest.java
java ShapeTest
```

## Expected Outputs

**second.java**
```
default constructor
10
10 20
10 20 30
```

**Constructor.java**
```
Parent parameterized constructor: 10
Child parameterized constructor: 10
Parent default constructor
Child default constructor
```

**ShapeTest.java**
```
Circle area: 78.53981633974483
Rectangle area: 24.0
Area not defined for generic shape
```

## Author

[tejeetvkumar](https://github.com/tejeetvkumar)
