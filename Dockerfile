FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/E2ETracking-0.0.1-SNAPSHOT.jar E2ETracking.jar
EXPOSE 8082
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/E2ETracking.jar"]