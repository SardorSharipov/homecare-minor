# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY target/homecare-0.0.1-SNAPSHOT.jar homecare.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "homecare.jar"]