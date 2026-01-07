🔐 CaesarCipher Backend

This repository contains the backend service for the Caesar Cipher project, built with Spring Boot.
It provides the core functionality for encryption and decryption using the classic Caesar Cipher algorithm.

🚀 Features

🔑 Caesar Cipher encryption & decryption API

⚡ Powered by Spring Boot

🖥️ Easy to run locally

📦 Ready for deployment with Docker

🛠️ Getting Started
✅ Prerequisites

☕ Java 17+

🛠️ Maven

🐳 Docker (optional, for containerized deployment)

▶️ Running Locally

Clone the repository:

git clone https://github.com/cyberhypex/ceaserCipher.git


cd ceaserCipher


Install dependencies:

mvn clean install


Make sure port 8080 is free.

Start the application:

mvn spring-boot:run


or run the main function from your IDE.

🐳 Running with Docker

A Dockerfile is included for easy containerization.

Build the Docker image:

docker build -t ceasercipher-backend .


Run the container:

docker run -p 8080:8080 ceasercipher-backend


Access the backend at:

http://localhost:8080


⚠️ No prebuilt image has been published yet. The Dockerfile is used for direct deployment.

📡 API Endpoints
🔒 Encryption
POST /api/encrypt


Request Body (JSON):

{
  "text": "hello world",
  "shift": 3
}


Response:

{
  "encryptedText": "khoor zruog"
}

🔓 Decryption
POST /api/decrypt


Request Body (JSON):

{
  "text": "khoor zruog",
  "shift": 3
}


Response:

{
  "decryptedText": "hello world"
}


⚠️ Note: Using the wrong shift value will not return the correct decoded text.

📂 Project Structure


ceaserCipher/


 ├── src/             # Source code

 
 ├── pom.xml          # Maven dependencies
 
 ├── Dockerfile       # Docker configuration
 
 └── README.md        # Project documentation

 
