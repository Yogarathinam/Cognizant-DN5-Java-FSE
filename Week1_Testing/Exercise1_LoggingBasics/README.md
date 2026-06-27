# Exercise 1: Logging Errors and Warnings

This shows how to use SLF4J and Logback to write standardized log messages in Java.

## Key Concepts:

- SLF4J
  Acts as a wrapper. It lets you swap out the actual logging tool later without having to rewrite your code.

- Log Levels
  ERROR: Critical failures that need to be fixed immediately.
  WARN: Unexpected things that happen, but the system doesn't crash.
  INFO: General updates about what the system is doing.

- Implementation
  The project uses Logback as the default tool to actually handle the logging behind the scenes.
