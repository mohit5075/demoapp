# Use OpenJDK 11 as the base image
FROM openjdk:17-oracle

# Metadata as a label
LABEL maintainer="goyalmk2001@gmail.com" version="1.0" description="Demo Application"

# Copy the application JAR into the container
COPY target/demo-app-0.0.1-SNAPSHOT.jar /demo-app.jar

# Command to run the application
CMD ["java", "-jar", "demo-app.jar"]