FROM openjdk:8u121-jre-alpine
ADD "target/bank-1.jar" "bank-1.jar"
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /bank-1.jar"]