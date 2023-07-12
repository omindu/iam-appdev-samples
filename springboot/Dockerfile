# Docker file for sprint boot application with java 17

FROM eclipse-temurin:17-jre

WORKDIR /app

ARG USER=wso2
ARG USER_ID=10001
ARG USER_GROUP=wso2
ARG USER_GROUP_ID=10001

# Add user
RUN groupadd -g ${USER_GROUP_ID} ${USER_GROUP} && \
    useradd -u ${USER_ID} -g ${USER_GROUP_ID} -m -s /bin/bash ${USER}

USER 10001

VOLUME /tmp

EXPOSE 8080

ADD target/iam-app-dev-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

