
# Sample todo application in SpringBoot

## Build and run

### Development with default H2 database

```
./mvnw package
java -Dspring.profiles.active=mysql -jar target/demo-0.0.1-SNAPSHOT.jar
```

or

```
mvn spring-boot:run
```


### Development with MySQL database

Start a local database in  a container

```
podman run -it -e MYSQL_USER=springuser  -e MYSQL_PASSWORD=springpassword  -e MYSQL_DATABASE=todo -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 docker.io/mysql
```


```
./mvnw package
java -Dspring.profiles.active=mysql -jar target/demo-0.0.1-SNAPSHOT.jar
```

or

```
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```


## add task using CURL

```
curl localhost:8080/task/add -d task=First
```