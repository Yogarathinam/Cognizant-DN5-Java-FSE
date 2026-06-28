# Exercise 2: Implementing Dependency Injection

A quick overview of how Spring connects different parts of an application together.

## Key Takeaways:

- Removes Hardcoding
  You no longer need to use the `new` keyword to create objects inside your classes.

- Automatic Wiring
  Spring automatically handles passing the required dependencies (like databases or repositories) directly into your services.

- Better Flexibility
  Makes the code much easier to update, swap out, and test because components are not tightly locked together.

- Centralized Setup
  All the rules for how components link up are defined clearly in one place (the XML file).
