 # Utiliser Java 21 comme base
 FROM openjdk:21
 # Définir le port sur lequel l’application va écouter
 EXPOSE 8761
 # Copier le fichier JAR généré dans l’image Docker
 ADD target/eureka-0.0.1-SNAPSHOT.jar Eureka.jar
 # Lancer l'application
 ENTRYPOINT ["java", "-jar", "Eureka.jar"]