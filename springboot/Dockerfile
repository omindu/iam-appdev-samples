# Docker file for sprint boot application with java 17

FROM eclipse-temurin:17-jre

WORKDIR /app

ARG USER=wso2
ARG USER_ID=10001
ARG USER_GROUP=wso2
ARG USER_GROUP_ID=10001

VOLUME /tmp

EXPOSE 8080

ADD target/iam-app-dev-*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

