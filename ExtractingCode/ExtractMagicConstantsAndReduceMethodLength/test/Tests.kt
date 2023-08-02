import com.intellij.openapi.command.WriteCommandAction
import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class ExtractingTest : BaseIjTestClass() {

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
    fun testExtractedFunction() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        val expected = """
            val inputStream = imageUrl.openStream()
            if (!outPath.exists()) outPath.parent.createDirectories()
            inputStream.use { 
                Files.copy(it, outPath)
            }
            return outPath.toString()
        """.trimIndent()
        WriteCommandAction.runWriteCommandAction(project) {
            val methodNames = findMethodsWithContent(expected)
            Assertions.assertFalse(methodNames.size > 1) {
                "Please, extract duplicated code into separate function"
            }
            Assertions.assertFalse(methodNames.isEmpty()) {
                "Extracted code not found"
            }

            val extractedMethod = methodNames.first() + "(imageUrl, outPath)"
            val methodsUsingExtractedMethod = findMethodUsages(extractedMethod)
            Assertions.assertEquals(listOf("getGreyPictureOfKitten", "getPictureOfKitten"), methodsUsingExtractedMethod) {
                "$extractedMethod function must be called in the functions from which the code was extracted"
            }
        }
    }

    @Test
    fun testExtractedVariable() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        var elementValue = "\"http://placekitten.com\""
        Assertions.assertTrue(hasConstantWithGivenValue(elementValue)) {
            "Please, create constant values for $elementValue"
        }

        elementValue = "\"ExtractingCode/ExtractMagicConstantsAndReduceMethodLength/src/main/resources/cats\""
        Assertions.assertTrue(hasConstantWithGivenValue(elementValue)) {
            "Please, create constant values for $elementValue"
        }
    }
}