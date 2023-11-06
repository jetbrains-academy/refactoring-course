package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]
    val driveMessage = TransportationServiceFactory().getTransportation(transportName).drive()
    println(driveMessage)
}
