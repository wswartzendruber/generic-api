FROM gradle:7.3.1-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM azul/zulu-openjdk-alpine:17-jre-headless
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/app/build/libs/app.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-jar", "/app/spring-boot-application.jar"]
