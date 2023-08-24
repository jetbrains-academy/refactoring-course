import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StrategyPatternTest {

    @Test
    fun bitcoinPaymentClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = bitcoinPaymentClass.checkBaseDefinition()
                bitcoinPaymentClass.checkDeclaredMethods(clazz)
            },
            "Please, create a BitcoinPayment class with processPayment method"
        )
    }

    @Test
    fun creditCardPaymentClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = creditCardPaymentClass.checkBaseDefinition()
                creditCardPaymentClass.checkDeclaredMethods(clazz)
            },
            "Please, create a CreditCardPayment class with processPayment method"
        )
    }

    @Test
    fun payPalPaymentClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = payPalPaymentClass.checkBaseDefinition()
                payPalPaymentClass.checkDeclaredMethods(clazz)
            },
            "Please, create a PayPalPayment class with processPayment method"
        )
    }
}
