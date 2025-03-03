# Utiliser Java 21 comme base
FROM openjdk:21
# Définir le port sur lequel l’application va écouter
EXPOSE 8081
# Copier le fichier JAR généré dans l’image Docker
ADD target/job-0.0.1-SNAPSHOT.jar Job.jar
# Lancer l'application
ENTRYPOINT ["java", "-jar", "Job.jar"]