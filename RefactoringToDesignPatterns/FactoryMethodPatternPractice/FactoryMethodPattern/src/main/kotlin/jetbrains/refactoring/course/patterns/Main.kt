package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]
    val transport = if (transportName == "car") {
        Car()
    } else if (transportName == "bicycle") {
        Bicycle()
    } else {
        throw IllegalArgumentException("Unknown transport")
    }
    val driveMessage = transport.drive()
    println(driveMessage)
}
