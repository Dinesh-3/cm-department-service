FROM openjdk:11
COPY target/*.jar department-service.jar
ENTRYPOINT ["java","-jar","/department-service.jar"]
EXPOSE 5002