FROM hub.c.163.com/library/java:8-alpine

MAINTAINER xiaochai 15089565436@163.com

ADD target/*.jar app.jar

EXPOSE 6003

ENTRYPOINT ["java","-jar","/app.jar"]