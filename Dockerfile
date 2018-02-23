FROM maven:3.5.2-jdk-8

WORKDIR /usr/src/app

COPY . .

EXPOSE 80

RUN mvn clean
RUN mvn package

CMD ["java", "-jar", "target/gs-rest-service-0.1.0.jar"]
