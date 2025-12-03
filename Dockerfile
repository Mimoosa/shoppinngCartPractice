FROM maven:latest
LABEL authors="monam"

WORKDIR /app
COPY pom.xml /app
COPY .idea /app
RUN mvn package
CMD ["java", "-jar", "target/shopping_cart_test.jar"]