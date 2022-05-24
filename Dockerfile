FROM java:8

EXPOSE 3333

ADD target/elockuaa.jar elockuaa.jar

ENTRYPOINT [ "java", "-jar", "/elockuaa.jar" ]