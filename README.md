## Steps to manually deploy an application

For this demo we are going to manually containerize a typical [Spring Boot](https://spring.io/projects/spring-boot) application and deploy it in an environment. It is important that we understand how it works manually so it becomes easy for us to automate the entire operation.

Let's start by cloning our repo.

```bash
git clone https://github.com/sbamihan/devops.git
```

Once we have repo in our local machine, we can then start with the rest of the steps.

First, build the artifact using Maven. While building, the unit tests and integration tests are automatically executed. If one of the tests fails, the build will not proceed.

```bash
mvn clean package
```

Next, build a docker image.

```bash
docker build -t aboitiz/demo-service .
```

Then, push the image to image registry.

```bash
docker push aboitiz/demo-service .
```

Finally, run the image.
```bash
docker run -it -d --name demo-service aboitiz/demo-service
```

Optionally, you can view the logs.
```bash
docker logs demo-service
```
