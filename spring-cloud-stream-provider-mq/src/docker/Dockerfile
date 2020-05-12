FROM java:8

VOLUME /tmp

COPY ${project.artifactId}.jar app.jar

RUN bash -c "touch /app.jar"

RUN apt install git

RUN apt install libssl-dev

EXPOSE ${server.port}

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=pro", "--server.port=8080", "> /log/app.log"]