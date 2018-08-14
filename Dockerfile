FROM openjdk:jre

ADD target/${project.build.finalName}.jar /opt/random-generator.jar
CMD java -jar /opt/random-generator.jar