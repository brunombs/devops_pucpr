FROM eclipse-temurin:24-jdk

WORKDIR /app

COPY out/production/devops/. .

CMD ["java", "-cp", ".", "com.calculator.Main"]