import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class StrategyPatternTest : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/patterns/Main.kt"
            )
            sourceText = sourceCodeFile.readText()
        }
    }

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

    @Test
    fun orderClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = orderClass.checkBaseDefinition()
                orderClass.checkFieldsDefinition(clazz)
            },
            "Please, create a data class Order with two fields: totalAmount: Double," +
                    "and date: LocalDate"
        )
    }

    @Test
    fun testCreatedInstancesInMainMethod() {
        setUp()
        myFixture.configureByText("Main.kt", sourceText)
        var expression = "CreditCardPayment()"
        var parent = "CreditCardPayment()"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, create an instance of PaymentProcessor for CreditCardPayment in the main method"
        }
        expression = "PayPalPayment()"
        parent = "PayPalPayment()"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, create an instance of PaymentProcessor for PayPalPayment in the main method"
        }
        expression = "BitcoinPayment()"
        parent = "BitcoinPayment()"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, create an instance of PaymentProcessor for BitcoinPayment in the main method"
        }
    }

    @Test
    fun testInvokedMethodsOfPaymentClassesInMainMethod() {
        setUp()
        myFixture.configureByText("Main.kt", sourceText)
        var method = "processOrderPayment(order1.totalAmount)"
        Assertions.assertEquals(
            findMethodUsages(method),
            listOf("main")
        ) {
            "Please, invoke the $method method of Credit Card Payment in the main method"
        }
        method = "processOrderPayment(order2.totalAmount)"
        Assertions.assertEquals(
            findMethodUsages(method),
            listOf("main")
        ) {
            "Please, invoke the $method method of PayPal Payment in the main method"
        }
        method = "processOrderPayment(order3.totalAmount)"
        Assertions.assertEquals(
            findMethodUsages(method),
            listOf("main")
        ) {
            "Please, invoke the $method method of Bitcoin Payment in the main method"
        }
    }
}