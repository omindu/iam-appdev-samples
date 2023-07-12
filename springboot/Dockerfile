# Docker file for sprint boot application with java 17

FROM eclipse-temurin:17-jre-alpine

ARG USER=wso2
ARG USER_ID=10001
ARG USER_GROUP=wso2
ARG USER_GROUP_ID=10001

# Add group and user for alpine image

RUN addgroup -g ${USER_GROUP_ID} ${USER_GROUP} && \
    adduser -u ${USER_ID} -G ${USER_GROUP} -s /bin/bash -D ${USER}

WORKDIR /app

COPY . /app

USER 10001

VOLUME /tmp

EXPOSE 8080


ENTRYPOINT ["java","-jar","target/iam-app-dev-0.0.1-SNAPSHOT.jar"]

