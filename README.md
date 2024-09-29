# Apparel Submission Platform

This platform allows users to submit information about their unused or worn-out apparel for proper disposal, donation, or recycling.

## Tech Stack
- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MongoDB

## Prerequisites
Before running the project, ensure you have the following installed:
- **Java** (version 8 or above) for Spring Boot
- **Maven** (for building the Spring Boot app)
- **VS Code** with the **Live Server** extension for running the frontend.

## How to Run the Project Locally

### Clone the Repository
Open a terminal and run the following command to clone the repository:

```bash
git clone https://github.com/vaib-p/apparel-submission-platform.git

**1. Backend Setup**
Navigate to the apparel-backend folder to set up the Spring Boot backend:

bash
cd apparel-backend
Ensure you have Java and Maven installed on your machine. Then, run the following commands to build and start the Spring Boot application:

bash
mvn clean install
mvn spring-boot:run

The backend server should now be running at http://localhost:8080.

2. Frontend Setup
Open VS Code, then navigate to the apparel-frontend folder:

bash

cd ../apparel-frontend
Use the Live Server extension in VS Code to run the frontend. Right-click the index.html file and select "Open with Live Server". This will start the frontend on a local server, usually at http://127.0.0.1:5500.

Access the Application
Once both the backend and frontend are running, open your browser and go to:

Frontend: http://127.0.0.1:5500 (Live Server)
Backend API: http://localhost:8080 (Spring Boot)
You can now use the form to submit apparel information, update, or delete records.

Features
Submission of apparel with type, condition, and category.
Update and delete apparel entries.
Input for contact and address details.
