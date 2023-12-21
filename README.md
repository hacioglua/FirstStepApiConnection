#  First step in using spring boot and spring library

## Overview
This project is a Spring Boot application that provides a RESTful API for managing and retrieving sports resources. It includes functionality for retrieving all resources, processing GET requests for a specific resource, and processing POST requests with a SportDTO payload. The application also handles a custom exception, CustomException, to handle runtime errors.

## Project Structure
The project is structured as follows:

* com.example.ahtproject.controller: Contains the controller classes that handle incoming HTTP requests.
   - ApiController: Main controller class defining endpoints for retrieving all resources, processing GET requests, processing POST requests, and a test endpoint.

* com.example.ahtproject.dto: Contains the Data Transfer Object (DTO) classes used for transferring data between layers.
   - SportDTO: Represents the data structure for sports resources.

* com.example.ahtproject.enums: Contains an enumeration representing different types of sports resources.
   - ResourceType: Enumerates various sports resource types like NBA, EuroLeague, NCAA, WNBA, and FIBA.

* com.example.ahtproject.exception: Contains the custom exception class.
   - CustomException: Extends RuntimeException and is used to handle custom exceptions.

* com.example.ahtproject: Contains the main application class.
   - AhtProjectApplication: Spring Boot application class with the main method to run the application.

## Usage
### Running the Application
To run the application, execute the main method in the AhtProjectApplication class.

### Endpoints
* GET /api/getall: Retrieve all sports resources.
* GET /api/get/{resourceId}: Process GET request for a specific sports resource identified by resourceId.
* POST /api/post: Process POST request with a SportDTO payload.
* GET /api/test/{number}: Test endpoint returning the provided number.

## Dependencies
The project is a Spring Boot application, and it relies on the following dependencies:

* Spring Boot: Framework for building Java-based enterprise applications.
* Lombok: Library simplifying Java code by providing annotations to reduce boilerplate code.
* Spring Web: Module providing basic web-related features such as handling HTTP requests.

## Configuration
No specific configuration is required for running this application. However, ensure that the necessary dependencies are included in the project.

## Contributing
Feel free to contribute to the project by submitting bug reports, feature requests, or pull requests. Follow standard GitHub practices for contributing.

## License
This project is licensed under the MIT License.

Feel free to customize this README according to your specific project details and requirements.
