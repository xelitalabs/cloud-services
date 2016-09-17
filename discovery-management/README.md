# discovery-management application

## installation steps

Building the application is straightforward.

### With Maven

In the application folder type:
```sh
mvn clean install
```

```sh
mvn spring-boot:run -Dspring.profiles.active=DEV
```

or

```sh
cd target
java -jar -Dspring.profiles.active=DEV *.jar
```

### With Docker

Please make sure Docker is installed on your system before starting.

To build the docker image, in the application folder type:
```sh
mvn clean package docker:build
```

To launch the application using docker:
```sh
docker-compose up
```

## Playing with the application

### With Maven

Once the application has been started using java command, you can test it by clicking [this link](http://localhost:9191)

### With Docker

Once the application has been started using Docker, you can test it by clicking [this link](http://discovery-management)
