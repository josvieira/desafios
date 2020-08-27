FROM openjdk:8-jre-alpine
MAINTAINER Josiene Vieira <josienevieira20@gmail.com>   
ADD target/.jar app.jar   
COPY target/.jar /app/app.jar   
WORKDIR /app   
ENTRYPOINT ["java", "-jar", "/app.jar"]
