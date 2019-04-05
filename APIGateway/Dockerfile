FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/APIGateway-0.0.1-SNAPSHOT.jar APIGateway.jar
EXPOSE 8765
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/APIGateway.jar"]