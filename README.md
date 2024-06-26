# Calculator Application

This project is a simple calculator web application built using Maven and Spring Boot. It allows multiple users to perform basic arithmetic operations through a web interface.

## Features

- Perform addition, subtraction, multiplication, and division.
- Maintain session-specific calculations for each user.

## Project Structure

![img_2.png](src%2Fmain%2Fresources%2Fimg%2Fimg_2.png)

## Calculator

Represents the calculator's state including the current result, input, and operator. It handles basic arithmetic operations.

![img_3.png](src%2Fmain%2Fresources%2Fimg%2Fimg_3.png)

## CalculatorController

Handles HTTP requests, performs calculations based on user input, and manages sessions for multiple users.

![img_4.png](src%2Fmain%2Fresources%2Fimg%2Fimg_4.png)![img.png](src/main/resources/img/img6.png)

## Deployment

![img_2.png](src/main/resources/img/img_25.png)
![img_1.png](src/main/resources/img/img_15.png)

The application is deployed on an Amazon EC2 instance, taking advantage of its scalability 
and reliability. The deployment involves packaging the application into a JAR file and transferring it to the EC2 instance. It runs on Java 11, ensuring compatibility and performance.

### Prerequisites

- JDK 11 or higher
- Maven
- Amazon EC2 instance (for deployment)


## Architecture

The calculator application follows a typical web application architecture using the Spring Boot framework, ensuring scalability, maintainability, and ease of deployment. Here’s a breakdown of its key components:
![image](https://github.com/juaneortiz1/SpringMvcCalculator/assets/97971732/fbeba40c-59ab-45a8-8b4a-ae3bfa3f5b2f)

### Frontend
The frontend utilizes Thymeleaf templates for rendering dynamic HTML content. This allows for a responsive user interface that interacts seamlessly with the backend services.

### Backend

#### Controller Layer
The `CalculatorController` handles incoming HTTP requests, processes user inputs, and coordinates with the service layer to perform arithmetic operations. It manages sessions to maintain state across multiple user interactions.

#### Model Layer
The `Calculator` encapsulates the core business logic of arithmetic operations (addition, subtraction, multiplication, division). It ensures that calculations are performed accurately and efficiently.

#### Session Management
Spring Session is leveraged to manage user sessions securely. This ensures that each user interaction with the calculator is isolated and maintains its own calculation state.

### Technologies Used
- **Java**: The primary programming language for backend development.
- **Spring Boot**: Provides a robust framework for building web applications, including dependency management and configuration.
- **Maven**: Used for project management and build automation.
- **Thymeleaf**: Enables server-side rendering of HTML templates with support for dynamic data.
- **Amazon EC2**: Cloud computing service used for hosting the application, providing scalability and reliability.


**Build the Project**

   ```bash
   mvn clean package
   ```

**Use the Calculator**

    - Enter numbers and perform calculations using the calculator interface.


## Author

Juan Esteban Ortiz






