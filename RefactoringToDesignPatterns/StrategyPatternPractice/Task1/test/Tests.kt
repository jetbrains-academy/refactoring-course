import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrategyPatternTest {

    @Test
    fun paymentStrategyClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = paymentStrategyClass.checkBaseDefinition()
                paymentStrategyClass.checkDeclaredMethods(clazz)
            },
            "Please, create a base interface PaymentStrategy with processPayment method"
        )
    }
}
