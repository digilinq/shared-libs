# Shared Libraries


## Unit Testing

[JUnit 5 Maven Dependency](https://howtodoinjava.com/junit5/junit5-maven-dependency/)
To run JUnit 5 tests through Maven, below are the main required dependencies:

- [junit-jupiter-api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api): It is the main module where all core annotations are located, such as @Test, Lifecycle method annotations and [assertions](https://howtodoinjava.com/junit5/junit-5-assertions-examples/).
- [junit-jupiter-engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine): It has test engine implementation which is required at runtime to execute the tests.
- [junit-platform-suite](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-suite): The [@Suite](https://howtodoinjava.com/junit5/junit5-test-suites-examples/) support provided by this module to make the JUnitPlatform runner obsolete.
- [junit-jupiter-params](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params): Support for [parameterized tests](https://howtodoinjava.com/junit5/parameterized-tests/) in JUnit 5.


