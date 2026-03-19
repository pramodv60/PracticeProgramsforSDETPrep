# PraticeProgramsForSDETPrep

Maven project for SDET practice with **Java 11**, Selenium, TestNG, Log4j2, Extent Reports, and Maven Surefire.

## Stack

| Dependency        | Purpose                    |
|-------------------|----------------------------|
| Java 11           | Build & compile target     |
| Selenium Java     | Browser automation         |
| TestNG            | Test framework             |
| Log4j2            | Logging (api + core)       |
| Extent Reports    | HTML test reports          |
| Maven Surefire    | Run TestNG from Maven      |

## Run tests

```bash
mvn clean test
```

Reports:

- **Extent Reports:** `target/extent-reports/ExtentReport_*.html`
- **Logs:** `target/logs/sdet-practice.log`

## Structure

- `src/main/java` – main code
- `src/main/resources` – `log4j2.xml` for logging
- `src/test/java` – TestNG tests; extend `BaseTest` for Extent + Log4j
- `testng.xml` – TestNG suite (used by Surefire)

## Requirements

- JDK 11 or higher (for compilation)
- Maven 3.6+