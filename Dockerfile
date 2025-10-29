FROM openjdk:17

COPY target/employee.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "app.jar"]