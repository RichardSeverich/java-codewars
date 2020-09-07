# java-codewars

katas of codewars.

This project is using Gradle 4.8.1.

## Prerequisites 🔨

1. Install Windows 10 or Linux

## Installation 🔧

1. Install windows or linux.
2. Install java 8 (1.8.0_201)

## Deploy 🚀

1. Clone project.

```
git clone https://github.com/RichardSeverich/java-codewars.git
```

2. Install dependencies: Enter to project and execute the following command:

```
gradlew
```

## Usage 

### Unit Test

In order to execute unit test: Execute the following command:

Run all unit tests:

```
gradlew test
```

Run single test:

```
gradle test --tests codewars.com.kataNextBiggernumber.BiggerNumNextTest
```

Other examples

```
gradle test --tests org.gradle.SomeTest.someSpecificFeature
gradle test --tests *SomeTest.someSpecificFeature
gradle test --tests *SomeSpecificTest
gradle test --tests all.in.specific.package*
gradle test --tests *IntegTest
gradle test --tests *IntegTest*ui*
gradle test --tests *IntegTest.singleMethod
gradle someTestTask --tests *UiTest someOtherTestTask --tests *WebTest*ui
```

### checkstyle

Execute:

```
gradlew clean check
```


### Test Coverage

Coverage:

```
gradle test jacocoTestReport
```

### findbugs

FindBugs is a program which uses static analysis to look for bugs in Java code.

```
gradle findbugsMain
gradle findbugsTest
```

### PMD

The PMD plugin performs quality checks on your project’s Java source files using PMD and generates reports from these checks.

```
gradle pmdMain
gradle pmdTest
```
