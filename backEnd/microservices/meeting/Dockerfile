# Utiliser Java 21 comme base
FROM openjdk:21
# Définir le port sur lequel l’application va écouter
EXPOSE 8089
# Copier le fichier JAR généré dans l’image Docker
ADD target/meeting-0.0.1-SNAPSHOT.jar Meeting.jar
# Lancer l'application
ENTRYPOINT ["java", "-jar", "Meeting.jar"]