# Modular Mart - E-commerce Platform Using Microservices

**Modular Mart** is a microservices-based e-commerce platform built with **Spring Boot** to showcase the implementation of a distributed architecture. The platform integrates payment processing, order management, notifications, and more, ensuring scalability, reliability, and a seamless shopping experience for users.

---

## Features

- **Microservices Architecture**: Modular design with separate services for Orders, Payments, Notifications, and more.
- **Centralized Configuration**: Configuration management using a **Config Server**.
- **Service Discovery**: Implemented **Netflix Eureka Server** for microservice registration and discovery.
- **Inter-Service Communication**: Used **OpenFeign** for seamless REST communication between microservices.
- **Messaging System**: Integrated **Apache Kafka** and **Zookeeper** for reliable communication between Order, Payment, and Notification services.
- **Notification Service**: Sends user notifications using **Maildev**.
- **Secure Payment Integration**: Incorporated **PayPal SDK** for secure and efficient payment processing.
- **API Gateway**: Unified entry point for all requests with load balancing capabilities.
- **Containerization**: Managed services with **Docker Compose** for easy orchestration.
- **Database Management**: Utilized **MongoDB** and **PostgreSQL** with schema version control via **Flyway**.

---

## Architecture Diagram

*(Include an architecture diagram here to visually represent the microservices and their interactions, if available.)*

---

## Technologies Used

| Technology       | Purpose                                            |
|-------------------|----------------------------------------------------|
| Spring Boot       | Framework for building microservices              |
| Microservices     | Distributed architecture design                   |
| Netflix Eureka    | Service discovery                                 |
| OpenFeign         | Inter-service communication                      |
| Apache Kafka      | Messaging and event streaming                     |
| Zookeeper         | Kafka coordination                                |
| Docker Compose    | Service orchestration                             |
| MongoDB           | NoSQL database for unstructured data              |
| PostgreSQL        | Relational database for structured data           |
| Flyway            | Database migrations                               |
| PayPal SDK        | Payment processing                                |
| Maildev           | Email notifications for users                     |

---

## Prerequisites

1. **Java** 17 or higher
2. **Docker** and **Docker Compose**
3. **MongoDB** and **PostgreSQL** setup
4. **Apache Kafka** and **Zookeeper**

---

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/modular-mart.git
cd modular-mart
```

### 2. Start Services with Docker Compose
```bash
docker-compose up
```

### 3. Configure Services
Set up the necessary configurations in the **Config Server**.

### 4. Access the Application
- API Gateway: `http://localhost:8080`
- Eureka Server Dashboard: `http://localhost:8761`

---

## Microservices Overview

| Service Name      | Description                                      | Port  |
|-------------------|--------------------------------------------------|-------|
| Config Server     | Centralized configuration management             | 8888  |
| Eureka Server     | Service discovery                                | 8761  |
| API Gateway       | Entry point for all requests                     | 8080  |
| Order Service     | Manages user orders                              | 8081  |
| Payment Service   | Handles payments via PayPal SDK                  | 8082  |
| Notification Service | Sends email notifications via Maildev         | 8083  |

---

## How It Works

1. **Order Placement**: Users place an order via the Order Service.
2. **Payment Processing**: Payment details are securely processed using the PayPal SDK in the Payment Service.
3. **Messaging**: Apache Kafka ensures reliable communication between services.
4. **User Notification**: The Notification Service sends order confirmation emails to the user.

---

## Contributing

Contributions are welcome! Follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m 'Add feature-name'`.
4. Push to the branch: `git push origin feature-name`.
5. Open a pull request.

---

## License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---

## Contact

For questions or collaboration, feel free to reach out:

- **Name**: Ashmit Jagtap  
- **LinkedIn**: [linkedin.com/in/ashmit-jagtap](https://linkedin.com/in/ashmit-jagtap)  
- **GitHub**: [github.com/your-username](https://github.com/ashmit-coder)  

