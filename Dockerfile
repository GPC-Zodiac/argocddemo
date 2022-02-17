FROM eclipse-temurin:11-jre-alpine
EXPOSE 8181
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} argocddemo.jar
ENTRYPOINT  ["java","-jar","/argocddemo.jar"]