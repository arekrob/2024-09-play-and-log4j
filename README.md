# Demonstration of an error that appears when using Play 3.0.5 and log4j 2.21.1

When you run this project using `sbt run`, the following error appears:
```
ERROR Could not create plugin of type class org.apache.logging.log4j.core.layout.JsonLayout for element JsonLayout: java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/ser/FilterProvider java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/ser/FilterProvider
```
despite that the class `com/fasterxml/jackson/databind/ser/FilterProvider` exists in the `jackson-databind`, which
is included in the project (in `build.sbt`).

I tried to update log4j to the most recent version 2.17.0, but this is not supported by Scala 2.14.3:
```
com.fasterxml.jackson.databind.JsonMappingException: Scala module 2.14.3 requires Jackson Databind version >= 2.14.0 and < 2.15.0 - Found jackson-databind version 2.17.0
```

I am running the project on openjdk version "21.0.2" 2024-01-16.
