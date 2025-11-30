# automation-basic-examples

![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-8-green)
![JUnit](https://img.shields.io/badge/JUnit-5.9.1-purple)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
![Status: Completed](https://img.shields.io/badge/Status-Completed-brightgreen)

This repository contains exercises, homework tasks, examples and unit tests created as part of a module in the **Kodilla "Automated Tester" Java course**, focusing on **Java Testing Basics** in Java 21.

The module focuses on:

- inheritance and method overriding
- abstract classes and polymorphism
- composition vs inheritance
- introduction to unit testing
- static vs dynamic testing
- JUnit 5 configuration and writing first test suites

The project was developed in **IntelliJ IDEA** as part of the learning path for future **QA/Test Automation Engineers**.

---

## Description

The project includes a wide variety of Java implementations and test suites divided into thematic packages.

### Object-Oriented Programming
- inheritance (`extends`)
- constructors, `super()`, encapsulation
- abstract classes & methods
- polymorphism
- composition vs inheritance (“has-a” vs “is-a”)

### Testing Fundamentals
- static & dynamic testing
- manual assertions (`ResultChecker`)
- JUnit 5 test structure
- unit tests for classes and utilities
- boundary-value & edge-case testing
- writing automated unit tests using:
    - `assertEquals`
    - `assertTrue` / `assertFalse`
    - delta for comparing doubles
    - test suites structure

### Additional Practice Utilities
The repo also includes self-written exercises under **MyExercises**, covering:
- collections
- data validation
- enums & switch
- simple stream and optional operations

---

## Project Structure

```
kodilla-basic-tests/
├── src/
│ ├── main/java/com/kodilla/
│ │ ├── abstracts/
│ │ │ ├── Animal.java
│ │ │ ├── AnimalProcessor.java
│ │ │ ├── Dog.java
│ │ │ ├── Duck.java
│ │ │ └── homework/
│ │ │ ├── Shape.java
│ │ │ ├── Circle.java
│ │ │ ├── Triangle.java
│ │ │ ├── Square.java
│ │ │ ├── Job.java
│ │ │ ├── Person.java
│ │ │ ├── Lawyer.java
│ │ │ ├── Firefighter.java
│ │ │ └── Teacher.java
│ │ │
│ │ ├── bank/homework/
│ │ │ ├── Bank.java
│ │ │ └── CashMachine.java
│ │ │
│ │ ├── basic_assertion/
│ │ │ ├── Calculator.java
│ │ │ ├── PrimeChecker.java
│ │ │ ├── ResultChecker.java
│ │ │ └── Application.java
│ │ │
│ │ ├── inheritance/
│ │ │ ├── Car.java
│ │ │ ├── Convertible.java
│ │ │ └── homework/
│ │ │ ├── OperatingSystem.java
│ │ │ ├── OldSystems.java
│ │ │ ├── NewSystems.java
│ │ │ └── SystemsApp.java
│ │ │
│ │ ├── school/
│ │ │ ├── Student.java
│ │ │ └── Grades.java
│ │ │
│ │ └── MyExercises/
│ │ ├── ShoppingList.java
│ │ ├── Student.java
│ │ ├── StudentGrades.java
│ │ ├── TemperatureConverter.java
│ │ ├── ToDoList.java
│ │ ├── MyExercises.java
│ │ │
│ │ ├── Books/
│ │ │ ├── Publication.java
│ │ │ ├── Readable.java
│ │ │ ├── Book.java
│ │ │ ├── Magazine.java
│ │ │ └── BookRepository.java
│ │ │
│ │ ├── enumIswitch/
│ │ │ ├── App.java
│ │ │ ├── Status.java
│ │ │ └── Ticket.java
│ │ │
│ │ └── streamIoptional/
│ │ ├── User.java
│ │ ├── UserRepository.java
│ │ └── App.java
│ │
│ └── test/java/com/kodilla/
│ ├── abstracts/...Test classes
│ ├── bank/homework/...Test classes
│ ├── basic_assertion/...Test classes
│ ├── inheritance/...Test classes
│ ├── school/...Test classes
│ └── MyExercises/...Test classes
│
├── build.gradle
├── LICENSE
├── README.md
└── structure.txt
```

---

## Getting Started

### Dependencies

This module uses **Gradle** as the build system.

**build.gradle (core configuration):**

```gradle
plugins {
    id 'java'
}

group = 'com.kodilla'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}

test {
    useJUnitPlatform()
}
```

### Explanation of components

- **Java plugin** – enables compilation and running Java code
- **JUnit 5 (Jupiter)** – used for writing automated unit tests
- **Maven Central** – dependency repository
- **Gradle Wrapper (./gradlew)** – ensures the project builds on any machine

All classes run directly through IntelliJ IDEA, and tests can run through either the built-in test runner or Gradle.

---

## Test Suites Overview

The project includes comprehensive JUnit 5 test coverage across all modules and custom exercises, exceeding **60% total test coverage**.

### basic_assertion
- verifies arithmetic operations  
- prime number evaluation  
- manual result checking logic  

### bank/homework
- ATM logic (`CashMachine`)
- bank transaction aggregation
- empty and invalid transaction handling

### abstracts & abstracts/homework
- abstract class behaviour
- shape calculations (Circle, Square, Triangle)
- job hierarchy classes

### inheritance & inheritance/homework
- car inheritance structure
- operating system start/stop logic

### school
- grade averaging  
- handling missing grades  

### MyExercises
- shopping list operations  
- student grade utilities  
- temperature conversion  
- to-do list behaviour  

### Books module
- repository behaviour  
- filtering publications  
- interface/abstract class relations  

### streamIoptional
- stream transformations  
- Optional handling & fallbacks  

These suites ensure stable and predictable behaviour across all components and demonstrate testing best practices with JUnit 5.

---

## Optional Terminal Commands

**Build project:**

```bash
./gradlew build
```

**Run all tests:**

```bash
./gradlew test
```

**Clean project:**

```bash
./gradlew clean
```

---

## Authors

Created by:

**Joanna Kamińska**  
GitHub: https://github.com/joanna-kaminska-qa

---

## Version History

- **0.3** – Expanded test coverage & structural improvements (achieved >60% total test coverage)
- **0.2** – README added, structural improvements
- **0.1** – Initial upload

---

## License

This project is licensed under the **MIT License**.  
See the `LICENSE` file for details.

---

## Acknowledgments

- Kodilla Automated Tester Java course
- JUnit documentation
- Java official documentation  
