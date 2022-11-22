FROM openjdk:17-alpine
# Set the working directory to /app
WORKDIR /app
# Copy the executable into the container at /app
ADD target/*.jar nosql.jar
# Make port 8080 available to the world outside this container
EXPOSE 9090
# Run app.jar when the container launches
ENTRYPOINT ["java", "-jar", "/app/nosql.jar"]
