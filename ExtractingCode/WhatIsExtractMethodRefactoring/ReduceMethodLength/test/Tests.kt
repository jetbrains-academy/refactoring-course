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
            if (!file.exists() || !file.isFile) {
                throw FileNotFoundException()
            }
        """.trimIndent()
        WriteCommandAction.runWriteCommandAction(project) {
            val methodNames = findMethodsWithContent(expected)
            Assertions.assertFalse(methodNames.size > 1) {
                "Please, extract duplicated code into separate function"
            }
            Assertions.assertFalse(methodNames.isEmpty()) {
                "Please, extract the code that checks if the file exists and is valid"
            }

            val extractedMethod = methodNames.first() + "(file)"
            val methodsUsingExtractedMethod = findMethodUsages(extractedMethod)
            Assertions.assertEquals(listOf("wordCount", "copyFile"), methodsUsingExtractedMethod) {
                "$extractedMethod function must be called in the functions from which the code was extracted"
            }
        }
    }
}
