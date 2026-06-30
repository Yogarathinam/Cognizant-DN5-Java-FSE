# Exercise 4: Creating and Configuring a Maven Project

This project demonstrates the configuration of a standard Maven project for a Library Management System, replacing manual JAR management with automated dependency handling.

## Key Configurations
* **Build Tool:** Maven used for lifecycle management (`mvn clean install`).
* **Java Version:** Configured `maven-compiler-plugin` for Java 1.8 compatibility.
* **Dependencies:**
    * `spring-context`: Core container functionality.
    * `spring-aop`: Aspect-Oriented Programming support.
    * `spring-webmvc`: Web module configuration.

## How to Run
1. Ensure the `pom.xml` is imported as a Maven project in the IDE.
2. Run `LibraryManagementApplication.java` to trigger the Spring IoC context loading.