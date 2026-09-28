# Use JDK 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy built JAR file into the container
COPY target/*.jar app.jar

# Expose backend server port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
