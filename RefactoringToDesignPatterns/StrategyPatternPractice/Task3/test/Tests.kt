import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrategyPatternTest {

    @Test
    fun paymentProcessorClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = paymentProcessorClass.checkBaseDefinition()
                paymentProcessorClass.checkDeclaredMethods(clazz)
                paymentProcessorClass.checkFieldsDefinition(clazz)
            },
            "Please, create a PaymentProcessor class with a constructor parameter paymentStrategy and processOrderPayment method"
        )
    }
}
