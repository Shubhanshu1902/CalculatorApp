FROM openjdk:11
COPY ./target/gs-maven-0.1.0.jar ./
WORKDIR ./
CMD ["java", "-jar", "gs-maven-0.1.0.jar"]