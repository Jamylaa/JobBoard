# Utiliser Java 21 comme base
FROM openjdk:21
# Définir le port sur lequel l’application va écouter
EXPOSE 8085
# Copier le fichier JAR généré dans l’image Docker
ADD target/candidat-0.0.1-SNAPSHOT.jar Candidat.jar
#COPY target/Candidat-0.0.1-SNAPSHOT.jar app.jar
# Lancer l'application
ENTRYPOINT ["java", "-jar", "Candidat.jar"]