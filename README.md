#### This Spring Boot application tested with Java 8.

## How to run

Need to execute the next command:
```
mvnw spring-boot:run
```

By default, JSON configuration file located in application resources with the next default parameters:
```json
{
  "instanceId": "testInstanceId",
  "mongoDb": "mongodb://localhost",
  "heartBeatInSec": 15,
  "httpPort": 8888
}
```

You can run application with your own configuration:
```
mvnw spring-boot:run -Dspring-boot.run.arguments="--config-location={LOCATION}"
```
where ```LOCATION``` - path to your configuration file.

Also, you can build application and run jar file:
```
mvnw clean package
java -jar target/mongoheartbeat-0.0.1-SNAPSHOT.jar --config-location={LOCATION}
```
where ```LOCATION``` - path to your configuration file.
