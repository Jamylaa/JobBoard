 # Utiliser Java 21 comme base
 FROM openjdk:21
 # Définir le port sur lequel l’application va écouter
 EXPOSE 8072
 # Copier le fichier JAR généré dans l’image Docker
 ADD target/candidaature-0.0.1-SNAPSHOT.jar Candidaature.jar
 # Lancer l'application
 ENTRYPOINT ["java", "-jar", "Candidaature.jar"]