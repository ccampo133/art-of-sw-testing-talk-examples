The `Calculator` class and it's corresponding tests contain simple examples of unit testing.

The `LoginService` class and the classes in the authentication package demonstrate simple dependency injection. The 
tests for `LoginService` demonstrate simple usage as a pseudo-REPL; they don't really test anything.

To build (which runs all tests):

    $ ./gradlew build

To create an Eclipse project:

    $ ./gradlew eclipse

To create an IntelliJ IDEA project:

    $ ./gradlew idea

Requires Java 8
