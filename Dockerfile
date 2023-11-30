
FROM maven:3.8.4-eclipse-temurin-17 AS build

WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn clean package

# Production Stage
FROM eclipse-temurin:17-jdk-ubi9-minimal



WORKDIR /usr/src/app
COPY --from=build /usr/src/app/target/fintracker-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]