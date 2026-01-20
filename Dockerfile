# Start from a lightweight Java 17 image
FROM eclipse-temurin:17-jdk-jammy


# Set working directory
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copy source code
COPY src src

# Make gradlew executable
RUN chmod +x gradlew

# Build the fat JAR
RUN ./gradlew clean bootJar --no-daemon

# Expose port (Render will map it via $PORT)
EXPOSE 8080

# Use Render-provided PORT environment variable
CMD ["sh", "-c", "java -jar build/libs/ship-out-be-0.0.1-SNAPSHOT.jar --server.port=${PORT}"]
