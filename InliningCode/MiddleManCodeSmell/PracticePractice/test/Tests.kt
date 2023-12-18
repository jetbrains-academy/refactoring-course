import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import java.io.File

class MiddleManTest : BaseIjTestClass() {
    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/inlining/MiddleMan.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testMiddleManClassRemoved() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)

        Assertions.assertFalse(hasClass("MiddleMan")) {
            "Please, remove \"MiddleMan\" class"
        }
    }

    @Test
    fun testMethodCallExists() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)

        Assertions.assertTrue(hasExpressionWithParent("dataProvider.fetchData()", "processData", true)) {
            "Please, invoke \"dataProvider.fetchData()\" inside \"Client::processData\" method."
        }
    }
}