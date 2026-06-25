# Exercise 4: AAA Pattern & Test Fixtures

Implementation of JUnit lifecycle management and test structuring.

## Key Concepts:

- AAA Pattern
  Tests are strictly organized into Arrange (data setup), Act (method execution), and Assert (validation) segments.

- Lifecycle Hooks
  Uses `@Before` to initialize objects prior to each test and `@After` to clean up afterwards, ensuring tests remain independent.
