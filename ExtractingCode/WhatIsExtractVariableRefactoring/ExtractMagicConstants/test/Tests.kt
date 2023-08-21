import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class ExtractMagicNumbersTest : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/extracting/Task.kt"
            )
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testExtractedConstant() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        var elementValue = "299792458.0"
        Assertions.assertTrue(hasConstantWithGivenValue(elementValue)) {
            "Please, create constant values for $elementValue"
        }

        elementValue = "6.62607015e-34"
        Assertions.assertTrue(hasConstantWithGivenValue(elementValue)) {
            "Please, create constant values for $elementValue"
        }

        val propertyName = "waveLength"
        Assertions.assertTrue(hasProperty(propertyName)) {
            "Please, create property for $propertyName"
        }
    }
}
