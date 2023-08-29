import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class InliningTest : BaseIjTestClass() {

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
    fun testDeletedVariablesAndMethods() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertFalse(hasProperty("totalPrice")) {
            "Please, identify unnecessary variables"
        }
        Assertions.assertFalse(hasMethod("logError")) {
            "Please, identify unnecessary methods"
        }
    }

    private fun checkExpressionCallIsReplacedByItsBody(
        expression: String,
        parent: String,
        isParentTypeFunction: Boolean = false
    ) {
        Assertions.assertTrue(hasExpressionWithParent(expression, parent, isParentTypeFunction)) {
            "Please, replace method or variable call by its body - $expression"
        }
    }

    @Test
    fun testExpressionCallIsReplacedByItsBody() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        checkExpressionCallIsReplacedByItsBody(
            "productPrice.sum()",
            "{\n            productPrice.sum()\n        }"
        )
        checkExpressionCallIsReplacedByItsBody(
            "PrintWriter(File(\"Exception.txt\"), Charsets.UTF_8).use { it.print(error) }",
            "calculateTotalPrice",
            true
        )
    }
}
