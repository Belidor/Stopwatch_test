Author: Artem Kupratsevich

Test project for a GrudU course "QA engineer to Mobile QA engineer"

Technologies: Appium, Java, TestNG and Allure frameworks.  

| |  |
|------------------|-------------------|
| App Version  | 3.0.0.6             |
| Device Hardware| Pixel 4 |
| OS Version   | 10.0           |
| App Name   | The Simpliest Stopwatch 2           |

## Installation

Clone the repo

```bash
git clone git@gitlab.griddynamics.net:akupratsevich/stopwatch-test.git
```

Update [Maven](https://maven.apache.org/download.cgi) dependencies

```bash
mvn install
```

Run test suite
```bash
mvn clean test
```

Open Allure report
```bash
allure serve target/surefire-reports
```
