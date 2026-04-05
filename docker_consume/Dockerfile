FROM maven:3.8.5-eclipse-temurin-17
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn compile dependency:copy-dependencies

EXPOSE 8889
ENTRYPOINT ["java", "-cp", "target/classes:target/dependency/*", "com.example.docker_consumer.DockerConsumerApplication"]