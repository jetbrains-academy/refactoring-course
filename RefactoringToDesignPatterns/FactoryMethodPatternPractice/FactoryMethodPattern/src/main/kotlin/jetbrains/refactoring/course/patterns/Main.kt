package jetbrains.refactoring.course.patterns

fun main() {
    val transportName = "car"
    val transport = if (transportName == "car") {
        Car()
    } else if (transportName == "bicycle") {
        Bicycle()
    } else {
        throw IllegalArgumentException("Unknown transport")
    }
    val driveMessage = transport.drive()
}
