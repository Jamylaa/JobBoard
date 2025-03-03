 # Utiliser Java 21 comme base
 FROM openjdk:21
 # Définir le port sur lequel l’application va écouter
 EXPOSE 8020
 # Copier le fichier JAR généré dans l’image Docker
 ADD target/gateway-0.0.1-SNAPSHOT.jar Gateway.jar
 #COPY target/Candidat-0.0.1-SNAPSHOT.jar app.jar
 # Lancer l'application
 ENTRYPOINT ["java", "-jar", "Gateway.jar"]