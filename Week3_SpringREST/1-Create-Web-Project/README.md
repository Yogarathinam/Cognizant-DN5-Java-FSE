# Study Notes: Spring Core Bean Context Loading

Key Framework Configurations:
- ApplicationContext manages the collection scope lifecycle events of application tokens.
- ClassPathXmlApplicationContext looks up local paths inside src/main/resources to build metadata bindings.
- Singleton Scope means the container structures exactly one mutual object instance per bean definition mapping request.
- Prototype Scope generates a fresh entity object construction inside heap boundaries every single time getBean is executed.
- list and ref parameters allow raw collections to absorb external configurations efficiently.
