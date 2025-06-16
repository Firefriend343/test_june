# My Java Project

This is a simple Java project that demonstrates a "Hello, World!" application along with a unit test using JUnit 5.10.

## Project Structure

```
my-java-project
├── src
│   ├── main
│   │   └── java
│   │       └── HelloWorld.java
│   └── test
│       └── java
│           └── HelloWorldTest.java
├── pom.xml
└── README.md
```

## Getting Started

To run this project, you will need to have Maven installed on your machine. 

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher

### Building the Project

To build the project, navigate to the project directory and run:

```
mvn clean install
```

### Running the Application

To run the HelloWorld application, execute the following command:

```
mvn exec:java -Dexec.mainClass="HelloWorld"
```

### Running Tests

To run the unit tests, use the following command:

```
mvn test
```

## License

This project is licensed under the MIT License.