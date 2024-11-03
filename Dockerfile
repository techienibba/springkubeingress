FROM openjdk:17
WORKDIR /app
COPY ./target/ingress.jar /app
EXPOSE 7112
CMD ["java","-jar","ingress.jar"]