# Exercise 1: Basic Spring Setup

Theme: Setting up a Library Management System using XML.

## Key Concepts:

- IoC Container
  We use `ClassPathXmlApplicationContext` to load up our configurations and manage our objects (beans).

- Dependency Injection
  Used "Setter Injection" inside `applicationContext.xml` to automatically plug the BookRepository into the BookService.

- Bean Configuration
  Because we declare our beans in the XML file, Spring handles creating the objects for us. We don't have to write `new` anymore!

## How the Flow Works:
`applicationContext.xml` -> tells the IoC Container what to do -> Container builds `BookRepository` and `BookService` -> Container links them together.

## IntelliJ Setup Reminders:
- Right-click the `src` folder -> Mark Directory as -> Sources Root
- Right-click the `resources` folder -> Mark Directory as -> Resources Root