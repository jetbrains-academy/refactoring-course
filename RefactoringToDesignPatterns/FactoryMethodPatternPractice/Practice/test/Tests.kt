import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class FactoryMethodPatternTest : BaseIjTestClass() {
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
    fun transportationServiceFactoryClassTest() {
        Assertions.assertDoesNotThrow(
            {
                val clazz = transportationServiceFactoryClass.checkBaseDefinition()
                transportationServiceFactoryClass.checkDeclaredMethods(clazz)
            },
            "Please, create a TransportationServiceFactory class with getTransportation method"
        )
    }

    @Test
    fun testAddedInvocationOfGetTransportationMethodInMainMethod() {
        setUp()
        myFixture.configureByText("Main.kt", sourceText)
        val method = "getTransportation(transportName)"
        Assertions.assertEquals(
            findMethodUsages(method),
            listOf("main")
        ) {
            "Please, add an invocation of getTransportation method in the main method"
        }
    }
}
