# FROM openjdk:11-alpine AS build
# WORKDIR /workspace/app

# COPY . /workspace/app
# RUN --mount=type=cache,target=/root/.gradle ./gradlew clean build
# RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)


FROM openjdk:15-jdk-alpine

COPY build/libs/*.jar app.jar

EXPOSE 8088

ENTRYPOINT [ "java", "-jar", "/app.jar"]
