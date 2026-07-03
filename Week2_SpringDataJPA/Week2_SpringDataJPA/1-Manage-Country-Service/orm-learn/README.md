# Spring Data JPA - Quick Notes

This is a simple Spring Boot project using Spring Data JPA and H2 database.

## What I used
- `@SpringBootApplication` -> main starter class
- `@Entity` -> maps class to table
- `@Table` -> gives table name
- `@Id` -> primary key
- `@Column` -> maps field to column
- `@Repository` -> database access layer
- `@Service` -> service layer
- `@Transactional` -> runs DB work in one transaction

## Project flow
`Country` -> model  
`CountryRepository` -> JPA repository  
`CountryService` -> service logic  
`OrmLearnApplication` -> runs and prints country list

## Important point
`JpaRepository<Country, String>` gives ready-made methods like:
- `findAll()`
- `findById()`
- `save()`

## Database
H2 is in-memory, so no separate database installation is needed.

## Data
The `data.sql` file inserts:
- India
- United States of America

## Output idea
When the app runs, it loads countries from DB and logs them.

## My short revision
Good example to understand:
- entity mapping
- repository layer
- service layer
- transaction usage
- H2 testing setup
