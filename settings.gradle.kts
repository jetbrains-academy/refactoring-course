pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven(url = "https://packages.jetbrains.team/maven/p/kotlin-test-framework/kotlin-test-framework")
    }
}

fun sanitizeName(name: String) = name.replace("listOf( /\\\\:<>\"?*|())", "_").replace("(^listOf(.)+)|(listOf(.)+\$)", "")

rootProject.name = "Refactoring_Course"

rootProject.projectDir.walkTopDown().forEach {
    if (!isTaskDir(it) || it.path.contains(".idea")) {
        return@forEach
    }
    val taskRelativePath = rootDir.toPath().relativize(it.toPath())
    val parts = mutableListOf<String>()
    for (name in taskRelativePath) {
        parts.add(sanitizeName(name.toString()))
    }
    val moduleName = parts.joinToString("-")
    include(moduleName)
    project(":$moduleName").projectDir = it
}

fun isTaskDir(dir: File) = File(dir, "src").exists()

include("util")
