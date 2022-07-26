
# Sample SpringBoot application
Just a simple todo list application.

Requires Java 11.


## run application

```
mvn spring-boot:run
```

or 

```
./mvnw package
java  -jar target/demo-0.0.1-SNAPSHOT.jar
```

### with mysql profile

```
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```

or

```
./mvnw package
java -Dspring.profiles.active=mysql -jar target/demo-0.0.1-SNAPSHOT.jar
```

or

```
SPRING_PROFILES_ACTIVE=mysql java -jar target/demo-0.0.1-SNAPSHOT.jar
```



## local mysql for testing
```
podman run -it -e MYSQL_USER=springuser  -e MYSQL_PASSWORD=springpassword  -e MYSQL_DATABASE=todo -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 docker.io/mysql
```

## add task using curl

```
curl localhost:8080/user/add -d tak="write todo application"
```

