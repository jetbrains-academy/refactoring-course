package jetbrains.refactoring.course.patterns

class TransportationServiceFactory {
    fun getTransportation(transport: String): Transport {
        return when (transport) {
            "car" -> Car()
            "bicycle" -> Bicycle()
            else -> throw IllegalArgumentException("Unknown transport")
        }
    }
}
