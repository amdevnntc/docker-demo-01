FROM openjdk:8
EXPOSE 8082
ADD target/spring-boot-docker spring-boot-docker.jar 
ENTRYPOINT ["java","-jar","/spring-boot-docker"]