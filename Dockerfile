FROM gradle:8.13-jdk21 as builder
WORKDIR /app
COPY . /app
RUN ./gradlew bootJar --no-daemon

FROM openjdk:21
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
