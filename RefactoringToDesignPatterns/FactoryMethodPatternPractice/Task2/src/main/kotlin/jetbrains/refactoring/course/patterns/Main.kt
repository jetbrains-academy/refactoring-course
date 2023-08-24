package jetbrains.refactoring.course.patterns

fun main() {
    val driveMessage = TransportationServiceFactory().getTransportation("car").drive()
}
