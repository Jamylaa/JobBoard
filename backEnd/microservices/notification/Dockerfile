 # Utiliser Java 21 comme base
 FROM openjdk:21
 # Définir le port sur lequel l’application va écouter
 EXPOSE 8086
 # Copier le fichier JAR généré dans l’image Docker
 ADD target/notification-0.0.1-SNAPSHOT.jar Notification.jar
 # Lancer l'application
 ENTRYPOINT ["java", "-jar", "Notification.jar"]