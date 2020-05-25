FROM openjdk:8-jdk-alpine
VOLUME /mnt/test/jar/crud/docker-tmp
ARG docker-spring-boot-crud-0.0.1
COPY spring-boot-crud-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","/bin/bash"]
