## Steps to manually deploy an application

For this demo we are going to manually containerize a typical [Spring Boot](https://spring.io/projects/spring-boot) application and deploy it in an environment. It is important that we understand how it works manually so it becomes easy for us to automate the entire operation.

First, let's start by cloning our repo.

```bash
git clone https://github.com/sbamihan/devops.git
```

Next, build the artifact using Maven. While building, the unit tests and integration tests are automatically executed. If one of the tests fails, the build will not proceed.

```bash
mvn clean package
```

Then, build a docker image.

```bash
docker build -t aboitiz/employee-service .
```

Finally, run the image.
```bash
docker run -it -d --name employee-service aboitiz/employee-service
```

Optionally, you can view the logs.
```bash
docker logs employee-service
```
