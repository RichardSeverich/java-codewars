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
gradlew test --tests codewars.com.kataNextBiggernumber.BiggerNumNextTest
```

Run single folder:

```
gradlew test --tests codewars.com.micky.katas.*
```

Other examples

```
gradlew test --tests org.gradle.SomeTest.someSpecificFeature
gradlew test --tests *SomeTest.someSpecificFeature
gradlew test --tests *SomeSpecificTest
gradlew test --tests all.in.specific.package.*
gradlew test --tests *IntegTest
gradlew test --tests *IntegTest*ui*
gradlew test --tests *IntegTest.singleMethod
gradlew someTestTask --tests *UiTest someOtherTestTask --tests *WebTest*ui
```

### checkstyle

Execute:

```
gradlew clean check
```


### Test Coverage

Coverage:

```
gradlew test jacocoTestReport
```

### findbugs

FindBugs is a program which uses static analysis to look for bugs in Java code.

```
gradlew findbugsMain
gradlew findbugsTest
```

### PMD

The PMD plugin performs quality checks on your project’s Java source files using PMD and generates reports from these checks.

```
gradlew pmdMain
gradlew pmdTest
```
