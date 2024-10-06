# Use a base image with Java 17
FROM eclipse-temurin:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle build files
COPY build.gradle settings.gradle ./

# Copy the rest of the project files
COPY . .

# Build the project
RUN ./gradlew build --no-daemon

# Expose the application port
EXPOSE 8080

# Set the entrypoint to run the Spring Boot app
ENTRYPOINT ["java", "-jar", "/app/build/libs/jlfitness-server-0.0.1-SNAPSHOT.jar"]