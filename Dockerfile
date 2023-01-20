# Build the application
FROM openjdk:17-alpine AS build

RUN apk add --update maven
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean package -DskipTests

# Create the final image
FROM openjdk:17-alpine
COPY --from=build /usr/src/app/target/*.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app.jar"]
