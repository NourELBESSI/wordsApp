FROM openjdk:17-alpine
# Copy the executable into the container at /app
ADD target/*.jar nosql.jar
# Make port 9090 available to the world outside this container
EXPOSE 9090
# Run app.jar when the container launches
ENTRYPOINT ["java", "-jar", "/app/nosql.jar"]
