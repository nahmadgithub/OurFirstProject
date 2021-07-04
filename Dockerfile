FROM adoptopenjdk/openjdk8:alpine

COPY /target/responder-service-0.0.1.jar .

EXPOSE 8080

CMD ["java", "-jar", "responder-service-0.0.1.jar"]