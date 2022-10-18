FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
CMD java -javaagent:skywalking-agent.jar \
         -Dskywalking.agent.service_name=service-home \
         -Dskywalking.collector.backend_service="10.9.9.2:11800" \
         -jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]