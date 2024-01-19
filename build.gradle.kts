import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.intellij") version "1.16.1"
    java
    kotlin("jvm") version "1.8.20" apply true
    application
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
}

intellij {
    version.set("2022.1.1")
    plugins.set(listOf("java", "Kotlin"))
    type.set("IC")
}

buildscript {
    extra["kotlin_version"] = "1.8.20"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.8.20"))
    }
}

fun printOutput(output: Any): Task {
    return tasks.create("printOutput") {
        println("#educational_plugin_check(er_version 1")
        val lines = output.toString().split("(?<=\n)|(?=\n)")
        for (line in lines) {
            println("#educational_plugin$line")
        }
    }
}

allprojects {
    apply {
        plugin("application")
        plugin("java")
        plugin("kotlin")
    }

    repositories {
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://packages.jetbrains.team/maven/p/kotlin-test-framework/kotlin-test-framework")
        }
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.20")
        testImplementation("junit:junit:4.13.1")

        val junitJupiterVersion = "5.9.0"
        implementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
        runtimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
        implementation("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
        runtimeOnly("org.junit.platform:junit-platform-console:1.9.0")

        implementation("org.ini4j:ini4j:0.5.4")
    }

    tasks {
        withType<JavaCompile> {
            sourceCompatibility = "11"
            targetCompatibility = "11"
        }
        withType<KotlinCompile> {
            kotlinOptions.jvmTarget = "11"
        }

        withType<Test> {
            useJUnitPlatform()

            outputs.upToDateWhen { false }

            addTestListener(object : TestListener {
                override fun beforeSuite(suite: TestDescriptor) {}
                override fun beforeTest(testDescriptor: TestDescriptor) {}
                override fun afterTest(testDescriptor: TestDescriptor, result: TestResult) {
                    if (result.resultType == TestResult.ResultType.FAILURE) {
                        val message = result.exception?.message ?: "Wrong answer"
                        val lines = message.split("\n")
                        println("#educational_plugin FAILED + ${lines[0]}")
                        lines.subList(1, lines.size).forEach { line ->
                            println("#educational_plugin$line")
                        }
                        // we need this to separate output of different tests
                        println()
                    }
                }

                override fun afterSuite(suite: TestDescriptor, result: TestResult) {}
            })
        }
    }

    sourceSets {
        getByName("main").java.srcDirs("src")
        getByName("main").kotlin.srcDirs("src")
        getByName("test").java.srcDirs("test")
        getByName("test").kotlin.srcDirs("test")
    }
}

tasks {
    wrapper {
        gradleVersion = project.findProperty("gradleVersion").toString()
    }
}

project(":util") {
    dependencies {
        implementation("junit:junit:4.13")
    }
}

configure(subprojects.filter { it.name != "util" }) {
    dependencies {
        implementation(project(":util"))
    }
}

configure(subprojects.filter { it.name.endsWith("Practice") || it.name.endsWith("task") }) {
    plugins.apply("org.jetbrains.intellij")

    intellij {
        version.set("2022.1.1")
        plugins.set(listOf("java", "Kotlin"))
        type.set("IC")
    }

    dependencies {
        val testSystemVersion = "2.1.1"
        testImplementation("org.jetbrains.academy.test.system:core:$testSystemVersion")
        testImplementation("org.jetbrains.academy.test.system:kotlin-psi:$testSystemVersion")
        testImplementation("org.jetbrains.academy.test.system:common:$testSystemVersion")
    }
}

configure(subprojects.filter { it.name == "CodeStyleAndFormatting-CodeSchemasAndEditorConfig-ReformatTheCodeAccordingToStyleSettingsPractice" }) {
    apply {
        plugin("org.jlleitschuh.gradle.ktlint")
    }
    tasks.withType<KotlinCompile> {
        dependsOn("ktlintCheck")
    }
}
