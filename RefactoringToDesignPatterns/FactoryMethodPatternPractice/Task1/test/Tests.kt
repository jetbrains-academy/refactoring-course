import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FactoryMethodPatternTest {

    @Test
    fun transportationServiceFactoryClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = transportationServiceFactoryClass.checkBaseDefinition()
                transportationServiceFactoryClass.checkDeclaredMethods(clazz)
            },
            "Please, create a TransportationServiceFactory class with getTransportation method"
        )
    }
}
