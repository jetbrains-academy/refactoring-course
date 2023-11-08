import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import java.io.File

class InliningVariableTest : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/inlining/Task.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testVariablesInlined() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertFalse(hasProperty("fileExists")) {
            "Please, identify unnecessary variables"
        }
        Assertions.assertFalse(hasProperty("content")) {
            "Please, identify unnecessary variables"
        }
    }
}