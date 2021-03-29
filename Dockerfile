FROM maven:3.6.3-jdk-11-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -B -f pom.xml clean package -DskipTests

FROM openjdk:11-jre-slim
COPY --from=build /workspace/target/*.jar app.jar
RUN apt update
RUN apt install -y curl
ENTRYPOINT ["java","-jar","app.jar"]
