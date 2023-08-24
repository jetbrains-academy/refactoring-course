import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class FacadePatternTest : BaseIjTestClass() {

    companion object {

        private lateinit var facadeText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/patterns/VideoConversionFacade.kt"
            )
            facadeText = sourceCodeFile.readText()
        }
    }

    @Test
    fun videoConversionFacadeClassTest() {
        setUp()
        myFixture.configureByText("VideoConversionFacade.kt", facadeText)
        val methodName = "convertVideo"
        Assertions.assertTrue(hasMethod(methodName)) {
            "Please, create the method $methodName"
        }

        val clazz = videoConversionFacadeClass.checkBaseDefinition()
        videoConversionFacadeClass.checkDeclaredMethods(clazz)
    }
}
