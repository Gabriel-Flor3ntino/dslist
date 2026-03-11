# DSList - Game List Manager

A Spring Boot application for managing and organizing video game lists. Built as part of the Java Spring Intensivão program.

## 🎮 Features

- **Game Management**: Store and retrieve video game information including title, year, genre, platforms, score, and descriptions
- **Game Lists**: Create and manage custom game lists
- **RESTful API**: Clean REST API endpoints for games and lists operations
- **Database Support**: Supports both H2 (development) and PostgreSQL (production) databases

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (development)
- **PostgreSQL** (production)
- **Maven**

## 📋 Prerequisites

- JDK 21 or higher
- Maven 3.6+
- PostgreSQL (for production environment)

## 🚀 Getting Started

### Clone the repository

```bash
git clone <repository-url>
cd dslist
```

### Configuration

The application uses different database configurations:
- **Development**: H2 in-memory database (auto-configured)
- **Production**: PostgreSQL (configure via `application.properties`)

### Build the project

```bash
./mvnw clean install
```

### Run the application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

### Games

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/games` | Retrieve all games |
| GET | `/lists/{listId}/games` | Retrieve games by list ID |

### Game Lists

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/lists` | Retrieve all game lists |

## 📦 Project Structure

```
src/
├── main/
│   ├── java/com/gabrielflorentino/dslist/
│   │   ├── DslistApplication.java      # Main application entry point
│   │   ├── config/                      # Configuration classes
│   │   ├── controllers/                 # REST controllers
│   │   ├── dto/                         # Data Transfer Objects
│   │   ├── entities/                    # JPA entities
│   │   ├── projections/                 # Data projections
│   │   ├── repositories/                # Data repositories
│   │   └── services/                    # Business logic services
│   └── resources/
└── test/
```

## 🔧 Development

### Running Tests

```bash
./mvnw test
```

### Building for Production

```bash
./mvnw clean package -DskipTests
```

## 📝 License

This project is part of the Java Spring educational program.

## 👨‍💻 Author

**Gabriel Florentino**

---

*Built with ❤️ using Spring Boot*
