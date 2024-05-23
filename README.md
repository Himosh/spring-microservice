# Springboot Microservice Architecture with Service Registry and API Gateway

This project demonstrates a microservice architecture implemented with Spring Boot, Eureka Server as the Service Registry, and Spring Cloud Gateway as the API Gateway. It consists of two microservices: Student Service and School Service.

## Components

### 1. Service Registry (Eureka Server)

- The Service Registry is implemented using Eureka Server, which provides service discovery for microservices in a distributed environment.
- It keeps track of available microservices and allows client microservices to discover and communicate with each other.

### 2. Student Service

- The Student Service is a microservice responsible for managing student data.
- It registers itself with the Service Registry and fetches registry information.
- Implements CRUD operations for student entities and communicates with the School Service to fetch school details.

### 3. School Service

- The School Service is a microservice responsible for managing school data.
- It registers itself with the Service Registry and fetches registry information.
- Implements CRUD operations for school entities.

### 4. API Gateway (Spring Cloud Gateway)

- The API Gateway acts as an intermediary between client applications and microservices.
- It provides a unified entry point for API requests and routes them to the appropriate microservice based on URL patterns.
- Implements routing, load balancing, caching, security, and monitoring for all API requests.

## Usage

1. **Clone the Repository:**
   - Clone this repository to your local machine using `git clone https://github.com/your-username/microservice-architecture.git`.

2. **Setting Up the Service Registry (Eureka Server):**
   - Navigate to the `ServiceRegistryApplication` class and run it to start the Eureka Server.
   - Access the Eureka Server dashboard at `http://localhost:8761` to view registered microservices.

3. **Running Microservices (Student Service and School Service):**
   - Navigate to the `student-service` and `school-service` directories.
   - Run the `StudentServiceApplication` and `SchoolServiceApplication` classes to start the respective microservices.
   - Ensure that the microservices are registered with the Eureka Server.

4. **Accessing Microservices via API Gateway:**
   - Navigate to the `api-gateway` directory.
   - Run the `ApiGatewayApplication` class to start the API Gateway service.
   - Send API requests to the gateway at `http://localhost:8080`.
   - Example:
     - To access student data: `http://localhost:8080/student`
     - To access school data: `http://localhost:8080/school`

## Dependencies

- Java 21
- Spring Boot 3.0.2
- Spring Cloud 2022.0.1
- Spring Cloud Netflix Eureka Client
- Spring Cloud Netflix Eureka Server
- Spring Cloud Netflix Zuul (for API Gateway)

## Configuration

- Application properties are configured for each microservice to register with the Eureka Server.
- URL patterns for routing requests are defined in the Spring Cloud Gateway configuration file.

## Contributing

Contributions are welcome! Please feel free to submit issues or pull requests for any improvements or additional features.

