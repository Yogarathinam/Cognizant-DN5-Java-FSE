# Study Notes: Create a Spring Web Project using Maven

Key Project Structure:
- src/main/java: Holds all executable application business logic source code files.
- src/main/resources: Stores configuration properties, database credentials, and static/XML meta files.
- src/test/java: Separates testing profiles and JUnit/Mockito validation code wrappers.

Core Architectural Concepts:
- @SpringBootApplication: Bootstraps the application by bundling Component Scanning, Auto-Configuration, and Java configuration layers.
- Embedded Tomcat: Allows web projects to be deployed as a standard JAR artifact without requiring manual application server installations.
- POM.xml: Acts as the central declaration ledger for managing external project dependencies and build plugin chains.