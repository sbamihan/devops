## Steps to deploy an application

These steps show how to containerize a typical [Spring Boot](https://spring.io/projects/spring-boot) application and deploy it in an environment.

First, if you are using Maven you need to build it

```bash
mvn clean package
```

While building, the unit tests and integration tests are automatically executed. If one of the tests fails, the build will not proceed.



Next, build a docker image

```bash
docker build -t aboitiz/demo-service .
```


Then, push the image to image registry

```bash
docker push aboitiz/demo-service .
```


Finally, run the image
```bash
docker run -it -d --name demo-service aboitiz/demo-service
```


Optionally, you can view the logs
```bash
docker logs demo-service
```
