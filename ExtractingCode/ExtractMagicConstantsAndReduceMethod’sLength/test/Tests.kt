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
        val expected = """val inputStream = imageUrl.openStream()
    if (!outPath.exists()) outPath.parent.createDirectories()
    inputStream.use { input ->
        Files.copy(input, outPath)
    }
    return outPath.toString()
        """.trimIndent()
        val methodNames = getMethodsContainingContent(expected)
        Assertions.assertFalse(methodNames.size > 1) {
            "Please, extract duplicated code into separate function"
        }
        Assertions.assertFalse(methodNames.isEmpty()) {
            "Extracted code not found"
        }
        val extractedMethod = methodNames[0]
        val methodsUsingExtractedMethod = getMethodsContainingContent(extractedMethod)
        Assertions.assertEquals(listOf("getCatWithTag", "getRandomCat"), methodsUsingExtractedMethod) {
            "$extractedMethod function must be called in the functions from which the code was extracted"
        }
    }

    private fun existsConstant(elementValue: String) {
        Assertions.assertTrue(existsConstantWithTheValue(elementValue)) {
            "Please, create constant values for $elementValue"
        }
    }

    @Test
    fun testExtractedVariable() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        existsConstant("\"https://cataas.com/cat\"")
        existsConstant("\"ExtractingCode/ExtractMagicConstantsAndReduceMethod’sLength/src/main/resources/cats/\"")
    }
}
