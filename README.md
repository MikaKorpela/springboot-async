# springboot-async

This project contains examples how to execute methods asynchronously in Spring Boot.

## Spring Boot Version and Dependencies

This project shall use Spring Boot version 3.0.4, and has the following Maven dependencies:

* spring-boot-starter-web
* spring-boot-starter-test
* spring-boot-starter-validation
* spring-retry
* spring-aspects
* lombok

See the ```pom.xml``` for more details.

## Calling Asynchronous Methods

Asynchronous calls cannot be made within a same class. Therefore, this project has ```SyncService``` and ```AsyncService```.

## Testing Asynchronous Methods

The ```@EnableAsync``` must be declared in the test class, and the ```@TestConfiguration``` must define a ```TaskExecutor``` bean.

There must be also a sleep between method execution and assertions that the results are available.
