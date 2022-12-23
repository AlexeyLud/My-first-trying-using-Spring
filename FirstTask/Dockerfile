FROM openjdk:11
ENV TZ=Europe/Minsk
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
WORKDIR "/app"
COPY "./target/FirstTask-1.0-SNAPSHOT.jar" "/app"
CMD ["java", "-jar", "/app/FirstTask-1.0-SNAPSHOT.jar"]

