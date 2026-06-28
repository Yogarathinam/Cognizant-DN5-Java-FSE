# Exercise 1: Configuring a Basic Spring Application

**Theme:** XML-based configuration for a Library Management System

---

## Key Concepts

- **[IoC Container](ca://s?q=Explain_IoC_Container_in_Spring):**  
  Spring’s `ClassPathXmlApplicationContext` is used to load bean definitions and manage object lifecycles.

- **[Dependency Injection](ca://s?q=Dependency_Injection_in_Spring):**  
  Setter Injection is applied in `applicationContext.xml` to wire `BookRepository` into `BookService`.

- **[Bean Configuration](ca://s?q=Spring_Bean_XML_Configuration):**  
  Beans are declared in XML, so Spring takes care of object creation instead of the developer writing `new` statements.

---

## Diagram Flow

```mermaid
flowchart TD
    A[applicationContext.xml] --> B[IoC Container]
    B --> C[BookRepository Bean]
    B --> D[BookService Bean]
    C --> D
    
In IntelliJ, mark src as Sources Root:
Right‑click on the src folder → Mark Directory as → Sources Root

In IntelliJ, mark resources as Resources Root:
Right‑click on the resources folder → Mark Directory as → Resources Root