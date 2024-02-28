## Spring Boot Contact Management API
This repository contains the source code for a simple contact management API built using Spring Boot. The API allows users to perform CRUD (Create, Read, Update, Delete) operations on a collection of contacts stored in a database.

## Features:
Find All Contacts: Retrieve a list of all contacts stored in the database.
Save Contact: Add a new contact to the database.
Delete Contact: Remove a contact from the database by its ID.
Update Contact: Update an existing contact in the database.
## Technologies Used:
Spring Boot: A powerful framework for building Java-based web applications.
Spring Data JPA: Provides easy integration with JPA (Java Persistence API) for database access.
RESTful API: The API follows RESTful principles, allowing clients to interact with resources using standard HTTP methods.
Maven: A build automation tool used for managing project dependencies and building the project.
## Usage:
To use this API, you can clone the repository and run it locally using Spring Boot's embedded Tomcat server. Once the application is running, you can make HTTP requests to the specified endpoints to interact with the contact data.

## Endpoints:
GET /contacts: Retrieve all contacts.
POST /contacts: Add a new contact.
DELETE /contacts/{id}: Delete a contact by ID.
PUT /contacts/{id}: Update a contact by ID.
