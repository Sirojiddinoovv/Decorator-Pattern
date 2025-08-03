# Decorator Pattern - Kotlin + Spring Boot Example

This project demonstrates the **Decorator Design Pattern** implemented using Kotlin and Spring Boot. The decorator pattern is used to dynamically add behavior to objects without modifying their original structure.

## 🎯 Purpose

In this example, decorators are used to extend service functionality in a flexible and maintainable way. It allows wrapping core service behavior with additional features (e.g., logging, validation, performance measurement) without altering the base implementation.

## 🧱 Pattern Overview

The **Decorator Pattern** provides a way to:
- Attach additional responsibilities to an object at runtime
- Promote composition over inheritance
- Follow the Open/Closed Principle

## 🧠 Structure

The project defines:
- A **core interface** (`MyService`) defining basic behavior
- A **base implementation** (`BaseService`)
- **Decorators** that wrap and enhance the base behavior, such as:
  - `LoggingDecorator`
  - `ValidationDecorator`
  - `PerformanceDecorator`

These decorators are composed using Spring's dependency injection and can be layered dynamically.

## 🚀 Tech Stack

- Kotlin
- Spring Boot
- Gradle Kotlin DSL
- Spring Dependency Injection

## ▶️ How to Run

```bash
./gradlew bootRun
```

## 📁 Project Structure

```
src/
 └── main/
     └── kotlin/
         └── com/example/decorator/
             ├── MyService.kt
             ├── BaseService.kt
             ├── LoggingDecorator.kt
             ├── ValidationDecorator.kt
             └── PerformanceDecorator.kt
```

## 📄 License

This project is released under the MIT License.

---

Created by **Nodirbek**
