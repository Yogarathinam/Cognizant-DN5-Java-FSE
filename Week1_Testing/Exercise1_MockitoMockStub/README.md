# Exercise 1: Mocking and Stubbing

This shows how to test code by itself by faking the outside connections.

## What was done:

- Mocking
  Created `ExternalApi` as a fake object to simulate a service without using the actual network.

- Stubbing
  Used `when(...).thenReturn(...)` to force the fake object to return specific data during the test.

- Verification
  Used standard JUnit checks to prove that `MyService` works correctly with the fake data.