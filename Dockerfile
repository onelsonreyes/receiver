FROM java:openjdk-8u91-jdk
CMD java ${JAVA_OPTS} -jar receiver-service.jar
COPY build/libs/receiver-service.jar .