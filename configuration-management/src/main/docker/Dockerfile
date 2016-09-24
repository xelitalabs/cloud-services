FROM openjdk:8-alpine

VOLUME /tmp

ADD configuration-management-1.0-SNAPSHOT.jar /app.jar
RUN chmod +x /app.jar

ADD docker_wait.sh /docker_wait.sh
RUN chmod +x /docker_wait.sh

EXPOSE 9898
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
