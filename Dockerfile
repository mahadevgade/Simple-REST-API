

FROM openjdk:17

MAINTAINER <Mahadev>

EXPOSE 8080

COPY target/sbApp.jar  /usr/app

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "sbApp.jar"]

