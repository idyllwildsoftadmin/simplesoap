FROM openjdk:8-jdk-alpine
MAINTAINER desertx.com
COPY target/simple-web-service-soap-0.0.1-SNAPSHOT.jar simple-web-service-soap-0.0.1-SNAPSHOT.jar
EXPOSE 8080:8080
ENTRYPOINT ["java","-jar","/simple-web-service-soap-0.0.1-SNAPSHOT.jar"]