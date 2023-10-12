FROM openjdk:17-jdk-alpine
COPY target/icecream-0.0.1-SNAPSHOT.jar icecream-app.jar
ENTRYPOINT ["java", "-jar", "icecream-app.jar"]