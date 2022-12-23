FROM openjdk:8
ARG JAR_FILE=target/MYMessageDI.jar
WORKDIR D:/gdf/MYMessageDI/app
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]
