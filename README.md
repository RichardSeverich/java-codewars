# csharp-codewars

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

3.  Execute unit test: Execute the following command:

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
