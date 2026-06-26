# Exercise 2: Verifying Interactions

This exercise demonstrates the `verify()` capability of Mockito, which ensures that dependencies are interacting as expected during runtime.

## Key Concepts
* **Behavior Verification:** Unlike testing return values, `verify()` checks if a specific method was executed on the mock object.
* **Quantification:** Used `times(1)` to assert the method was called exactly once, preventing double-execution bugs in production logic.