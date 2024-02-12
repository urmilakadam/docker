FROM openjdk:17-oracle
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java --add-opens=java.base/java.lang=ALL-UNNAMED $JAVA_OPTS -jar app.jar
