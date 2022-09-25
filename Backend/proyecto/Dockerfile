# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
    FROM openjdk:8
    ADD target/proyecto-2.7.4-SNAPSHOT proyecto-2.7.4-SNAPSHOT
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} proyecto-2.7.4-SNAPSHOT
    ENTRYPOINT ["java", "-jar","proyecto-2.7.4-SNAPSHOT"]
    EXPOSE 8080