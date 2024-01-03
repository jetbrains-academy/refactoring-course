[![official project](https://jb.gg/badges/official.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![Gradle Build](https://github.com/jetbrains-academy/refactoring-course/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/jetbrains-academy/refactoring-course/actions/workflows/gradle-build.yml)

# Introduction to IDE Code Refactoring in Kotlin

This course will introduce you to refactorings and the IDE features that will help you to perform them in an effective way.
You will learn to recognize refactoring opportunities in code and to deal with them.
Using automatic IDE refactorings, you will transform code to improve its structure, readability, and maintainability.

The course consists of 8 sections. Each section focuses on one group of refactorings and 
provides brief theory and several small tasks for practice.
We will move on from small local refactoring changes to more complex ones, which affect the entire project architecture.

Topics covered:

- refactoring definition; 
- code quality and code smells;
- kinds of refactoring techniques;
- IDE refactoring features;
- code style and formatting;
- code style schema and EditorConfig;
- automatic formatting using IDE;
- naming rules;
- rename refactoring;
- move refactoring;
- pull up and push down refactoring;
- extract refactoring;
- inline refactoring;
- design patterns and their relationships with refactoring.


## Technical requirements

Before starting this course, check the following requirements.

1. Your computer needs to have a stable internet connection.
2. Git version control system needs to be installed on your computer (link to the git site: https://git-scm.com/).
3. Make sure that the path to the root folder of the course does not contain spaces, special characters, or non-Latin characters.
4. Make sure that you use the [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?_ga=2.189310830.494255415.1682514714-1823138827.1669894241&_gac=1.83806948.1682684894.Cj0KCQjw3a2iBhCFARIsAD4jQB3QkDU43KtbIx2HzEz02KvcN7Ma3QGzkIbyX4KS3H4x8b2bl9p4EfYaAvWsEALw_wcB&_gl=1*1h13lr8*_ga*MTgyMzEzODgyNy4xNjY5ODk0MjQx*_ga_9J976DJZ68*MTY4MjY5NDIyMy4xMjUuMS4xNjgyNjk0MjM4LjQ1LjAuMA..#section=windows) with version at least `2023.1.1`.
5. Make sure that you use the [JetBrains Academy](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy) plugin with version at least `2023.1`.

The course is integrated into the [IntelliJ IDEA IDE](https://www.jetbrains.com/idea/), which has a free Community license.
You can use this license to complete the course.
If you have some troubles with the course installation, feel free to contact us by email at education@jetbrains.com.

## Getting started

This course is [available](https://plugins.jetbrains.com/plugin/23048-introduction-to-ide-code-refactoring) on JetBrains
Marketplace and can be installed from the IntelliJ IDEA IDE directly, but you can also use it in the Course Creator mode
or create a course archive from the source code.

### Getting started: create a course preview from the source code

You can create a [course preview](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/educator-start-guide.html#preview_course) from the source code:
1. Clone the repository:
    ```text
    git clone https://github.com/jetbrains-academy/refactoring-course.git
    ```

2. Build the project:
    ```text
    ./gradlew build
    ```

3. Install the [JetBrains Academy](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/install-jetbrains-academy-plugin.html) plugin from JetBrains Marketplace.

4. Create a new [course preview](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/educator-start-guide.html#preview_course).

### Getting started: create a course archive

You can create a [course archive](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/educator-start-guide.html#fe7010f2) from the source code:
1. Clone the repository:
    ```text
    git clone https://github.com/jetbrains-academy/refactoring-course.git
    ```

2. Build the project:
    ```text
    ./gradlew build
    ```

3. Install the [JetBrains Academy](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/install-jetbrains-academy-plugin.html) plugin from JetBrains Marketplace.

4. Create a new [course archive](https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/educator-start-guide.html#fe7010f2).

## Run tests

To run tests locally, you just need to build the project and run the following command:

```text
./gradlew test
```

The tests use the Java Reflection API under the hood to check the user's tasks.

## Want to know more?

If you have questions about the course or the tasks or if you find some errors,
you can ask questions and participate in discussions in repository [issues](https://github.com/jetbrains-academy/refactoring-course/issues).

## Contribution

Please be sure to review the [project's contributing guidelines](./contributing.md) to learn how to help the project.
