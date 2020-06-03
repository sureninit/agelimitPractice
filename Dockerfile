FROM openjdk:8
EXPOSE 8080
ADD target/agelimit.jar agelimit.jar
ENTRYPOINT ["java","-jar","/agelimit.jar"] 