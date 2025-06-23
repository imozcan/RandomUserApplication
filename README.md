# RandomUserApplication

RandomUserApplication is a Java Spring Boot project designed with a clean layered architecture. It fetches random user data from the [randomuser.me](https://randomuser.me/) public API and provides a RESTful interface.

##  Project Structure

```
RandomUserApplication/
├── RandomUserApplication # Main Spring Boot Application
├── RandomUserServiceLib # Service Layer (Business Logic)
├── RandomUserRepositoryLib # Repository Layer (Data Access)
├── RandomUserMeServiceLib # External API Communication Layer
```

Always show details


##  Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data (JPA-like pattern)
- ModelMapper
- Lombok
- Maven
- REST API (RestTemplate)
- randomuser.me API

##  Module Responsibilities

RandomUserApplication: Main Spring Boot app, handles dependency wiring and API controller.
RandomUserServiceLib: Business logic for user data processing.
RandomUserRepositoryLib: Abstract repository interface (simulates persistence for demo).
RandomUserMeServiceLib: Connects to randomuser.me API and maps results.

##  Features

Clean layered architecture (separation of concerns)
Modular structure (easy to maintain or expand)
Uses ModelMapper for clean DTO conversion
Ready to integrate with real databases

##  📄 License

This project is licensed under the [MIT License](LICENSE).
