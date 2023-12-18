import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import java.io.File

class IdentifyIssuesInCodeSnippetTest : BaseIjTestClass() {
    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/refactoring/purpose/Task.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testRedundantVariablesRemoved() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertFalse(hasProperty("length")) {
            "Please, remove redundant variable \"length\""
        }

        Assertions.assertFalse(hasProperty("width")) {
            "Please, remove redundant variable \"width\""
        }

        Assertions.assertFalse(hasProperty("result")) {
            "Please, remove redundant variable \"result\" and transform \"calculateArea\" into a single-expression function"
        }
    }

    @Test
    fun testMethodAndParametersRenamed() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertTrue(hasMethod("calculateArea")) {
            "Please, rename method \"calculate_area\" to \"calculateArea\""
        }

        Assertions.assertFalse(hasParameter("l")) {
            "Please, rename \"l\" parameter to \"length\""
        }

        Assertions.assertFalse(hasParameter("w")) {
            "Please, rename \"w\" parameter to \"width\""
        }
    }
}