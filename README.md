# OBJECTIVE

This project is to show how to use annotations from Spring, Spring Boot, Java Persistence API (JPA), and LOMBOK packages to build a Spring application.
This application contains Spring MVC Web application and a RESTful API. The backend database uses SQLite.


# ANNOTATIONS FOR:  JPA, LOMBOK, SPRING, SPRING BOOT

- Project builds:
    - Web application using Spring MVC with views in ThymeLeaf and JSP
    - REST API using RestController
- Project contains:  
    - Spring MVC using ThymeLeaf HTML templates and JSP pages views, **BUT** only one can only be used at one time, **NOT** both (see "Browser" of the "TEST URLs" below).
    - Java Persistence API (JPA) for accessing SQLite database
    - Lombok for generating Java boilerplate codes
- Versions (from pom.xml):
    - Java: 1.8
    - groupId : artifactId : version:
        - javax.servlet : jstl : 1.2
        - nz.net.ultraq.thymeleaf : thymeleaf-layout-dialect : 2.5.2
        - org.apache.tomcat.embed : tomcat-embed-jasper : 9.0.43
        - org.projectlombok : lombok : 1.18.12
        - org.springframework.boot : spring-boot-starter : 2.3.3.RELEASE
        - org.springframework.boot : spring-boot-starter-data-jpa : 2.3.3.RELEASE
        - org.springframework.boot : spring-boot-starter-test : 2.3.3.RELEASE
        - org.springframework.boot : spring-boot-starter-thymeleaf : 2.3.3.RELEASE
        - org.springframework.boot : spring-boot-starter-tomcat : 2.3.3.RELEASE
        - org.springframework.boot : spring-boot-starter-web : 2.3.3.RELEASE
        - org.xerial : sqlite-jdbc : 3.16.1


# 1. SPRING AND SPRING BOOT ANNOTATIONS

- **@Autowired**:
    - *Classes*:  com.example.annotations.mvc.MyMvcController, com.example.annotations.rest.MyRestService, com.example.annotations.rest.MyRestController 
    - *Descriptions*:  Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-autowire
- **@Bean**:
    - *Class*:  com.example.annotations.config.MyAppConfiguration
    - *Descriptions*:  @Bean is a method-level annotation and a direct analog of the XML <bean/> element. The annotation supports most of the attributes offered by <bean/>, such as: init-method, destroy-method, autowiring, lazy-init, dependency-check, depends-on and scope.
    - *Reference 1*:  https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html
    - *Reference 2*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html
    - *Example/Explanation*:  https://www.journaldev.com/21577/spring-bean-annotation
- **@Configuration**:
    - *Class*:  com.example.annotations.config.MyAppConfiguration
    - *Descriptions*:  Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html
    - *Example/Explanation*:  https://www.journaldev.com/21033/spring-configuration-annotation
- **@Controller**:
    - *Class*:  com.example.annotations.mvc.MyMvcController
    - *Descriptions*:  Indicates that an annotated class is a "Controller" (e.g. a web controller).
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Controller.html
    - *Example/Explanation*:  https://zetcode.com/springboot/controller/
- **@EnableJpaRepositories**:
    - *Class*:  com.example.annotations.SpringAllAnnotationsApplication
    - *Descriptions*:  Annotation to enable JPA repositories. Will scan the package of the annotated configuration class for Spring Data repositories by default.
    - *Reference*:  https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/config/EnableJpaRepositories.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-data-annotations
- **@EntityScan**:
    - *Class*:  com.example.annotations.application.SpringAllAnnotationsApplication
    - *Descriptions*:  Configures the base packages used by auto-configuration when scanning for entity classes.
    - *Reference*:  https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/domain/EntityScan.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-entityscan-vs-componentscan
- **@GetMapping**:
    - *Classes*:  com.example.annotations.mvc.MyMvcController, com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation for mapping HTTP GET requests onto specific handler methods.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/GetMapping.html
    - *Example/Explanation*:  https://zetcode.com/spring/getmapping/
- **@PatchMapping**:
    - *Class*:  com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation for mapping HTTP PATCH requests onto specific handler methods.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PatchMapping.html
    - *Example/Explanation*:  https://www.baeldung.com/http-put-patch-difference-spring
- **@PathVariable**:
    - *Class*:  com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation which indicates that a method parameter should be bound to a URI template variable.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PathVariable.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-pathvariable
- **@PostMapping**:
    - *Classes*:  com.example.annotations.mvc.MyMvcController, com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation for mapping HTTP POST requests onto specific handler methods.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PostMapping.html
    - *Example/Explanation*:  https://howtodoinjava.com/spring5/webmvc/controller-getmapping-postmapping/
- **@PutMapping**:
    - *Class*:  com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation for mapping HTTP PUT requests onto specific handler methods.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/PutMapping.html
    - *Example/Explanation*:  https://www.baeldung.com/http-put-patch-difference-spring
- **@RestController**:
    - *Class*:  com.example.annotations.rest.MyRestController
    - *Descriptions*:  A convenience annotation that is itself annotated with @Controller and @ResponseBody.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-controller-vs-restcontroller
- **@RequestMapping**:
    - *Class*:  com.example.annotations.rest.MyRestController
    - *Descriptions*:  Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RequestMapping.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-requestmapping
- **@Service**:
    - *Classes*:  com.example.annotations.rest.MyRestService, com.example.annotations.mvc.MyMvcService
    - *Descriptions*:  Indicates that an annotated class is a "Service"
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-component-repository-service
- **@SpringBootApplication**:
    - *Class*:  com.example.annotations.SpringAllAnnotationsApplication
    - *Descriptions*:  Many Spring Boot developers like their apps to use auto-configuration, component scan and be able to define extra configuration on their "application class". A single @SpringBootApplication annotation can be used to enable those three features.
    - *Reference*:  https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/using-boot-using-springbootapplication-annotation.html
    - *Example/Explanation*:  https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/using-boot-using-springbootapplication-annotation.html
- **@Transactional**:
    - *Class*:  com.example.annotations.rest.MyRestService
    - *Descriptions*:  Describes a transaction attribute on an individual method or on a class.
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Transactional.html
    - *Example/Explanation*:  https://www.baeldung.com/transaction-configuration-with-jpa-and-spring
- **@Value**:
    - *Class*:  com.example.annotations.mvc.MyMvcController
    - *Descriptions*:  For Spring to automatically read the property value from application.yml or application.properties and assign to the specified variable
    - *Reference*:  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Value.html
    - *Example/Explanation*:  https://www.baeldung.com/spring-value-annotation


# 2. JPA ANNOTATIONS (for database-related operations)

- **@Entity**:
    - *Class*:  com.example.annotations.database.sqlite.model.Person
    - *Descriptions*:  Specifies that the class is an entity. This annotation is applied to the entity class.
    - *Reference*:  https://docs.oracle.com/javaee/7/api/javax/persistence/Entity.html
    - *Example/Explanation*:  https://www.baeldung.com/jpa-entities
- **@GeneratedValue**:
    - *Class*:  com.example.annotations.database.sqlite.model.Person
    - *Descriptions*:  Provides for the specification of generation strategies for the values of primary keys.
    - *Reference*:  https://docs.oracle.com/javaee/7/api/javax/persistence/GeneratedValue.html
    - *Example/Explanation*:  https://www.baeldung.com/hibernate-identifiers
- **@Id**:
    - *Class*:  com.example.annotations.database.sqlite.model.Person
    - *Descriptions*:  Specifies the primary key of an entity.
    - *Reference*:  https://docs.oracle.com/javaee/7/api/javax/persistence/Id.html
    - *Example/Explanation*:  https://www.baeldung.com/hibernate-identifiers
- **@Param**:
    - *Class*:  com.example.annotations.database.sqlite.repository.PersonRepository
    - *Descriptions*:  Using named parameters - used in conjunction with @Query annotation
    - *Reference*:  https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.at-query
    - *Example/Explanation*:  https://www.baeldung.com/spring-data-jpa-query
- **@Query**:
    - *Class*:  com.example.annotations.database.sqlite.repository.PersonRepository
    - *Descriptions*:  Declare query at the query method.
    - *Reference*:  https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html#jpa.query-methods.at-query
    - *Example/Explanation*:  https://www.baeldung.com/spring-data-jpa-query


# 3. LOMBOK ANNOTATIONS (for generating most of POJO boilerplate codes like getters/setters/toString/etc)

- **@Getter**:
    - *Class*:  com.example.annotations.dto.LoginLombokDto
    - *Descriptions*:  Indicates to Lombok to generate "getter" method
    - *Reference*:  https://projectlombok.org/api/lombok/Getter.html
    - *Example/Explanation*:  https://www.baeldung.com/intro-to-project-lombok
- **@NoArgsConstructor**:
    - *Class*:  com.example.annotations.dto.LoginLombokDto
    - *Descriptions*:  Indicates to Lombok to generate constructor without any arguments
    - *Reference*:  https://projectlombok.org/api/lombok/NoArgsConstructor.html
    - *Example/Explanation*:  https://www.baeldung.com/intro-to-project-lombok
- **@Setter**:
    - *Class*:  com.example.annotations.dto.LoginLombokDto
    - *Descriptions*:  Indicates to Lombok to generate "setter" method
    - *Reference*:  https://projectlombok.org/api/lombok/Setter.html
    - *Example/Explanation*:  https://www.baeldung.com/intro-to-project-lombok
- **@ToString**:
    - *Class*:  com.example.annotations.dto.LoginLombokDto
    - *Descriptions*:  Indicates to Lombok to generate "toString" method
    - *Reference*:  https://projectlombok.org/api/lombok/ToString.html
    - *Example/Explanation*:  https://www.baeldung.com/intro-to-project-lombok

# BUILD PROJECT

- ./mvnw clean compile package


# RUN SERVER

- Run server with ThymeLeaf HTML template views:  ./mvnw spring-boot:run

- Run server with JSP page views:  ./mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.thymeleaf.enabled=false" 


# TEST URLs

- **Browser**:
    - Login page using ThymeLeaf HTML template:  http://localhost:8080/       OR     http://localhost:8080/login
    - Login page using JSP page:  http://localhost:8080/loginJsp

    - http://localhost:8080/rest/get
    - http://localhost:8080/rest/get/firstname/John
    - http://localhost:8080/rest/get/firstnameandlastname/John/Smith
    - http://localhost:8080/rest/get/lastnameorfullname/Doe/John%20Smith

- **Postman**:
    - http://localhost:8080/rest/post
    - http://localhost:8080/rest/patch
    - http://localhost:8080/rest/put/12345
