# Hands-on 4 Architectural Concepts Review

### Core Concept Definitions
- **JPA (Java Persistence API):** It is a specification. It gives standard rules and annotations, but not the actual implementation.
- **Hibernate:** It is an ORM framework that implements JPA and handles the real database work.
- **Spring Data JPA:** It is a higher-level layer built on top of JPA providers like Hibernate, mainly to reduce boilerplate code.

### Code Overhead Breakdown
- Traditional Hibernate needs manual session opening, transaction handling, rollback logic, and cleanup code.
- Spring Data JPA reduces this by using interfaces like `JpaRepository<Entity, Type>`.
- With `@Transactional`, transaction handling is mostly managed automatically.

### Short Revision
- JPA = specification
- Hibernate = implementation
- Spring Data JPA = abstraction layer
- Main benefit = less code, easier CRUD, cleaner architecture
