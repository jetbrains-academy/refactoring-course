import org.jetbrains.academy.test.system.ij.formatting.checkIfFormattingRulesWereApplied
import org.jetbrains.academy.test.system.ij.formatting.checkIfOptimizeImportsWereApplied
import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class ReformatCodeTest : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/formatting/Task2.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testSolutionIsFormatted() {
        setUp()
        myFixture.configureByText("Task2.kt", sourceText)
        myFixture.file.checkIfFormattingRulesWereApplied()
    }

    @Test
    fun testUnusedImportsAreRemoved() {
        setUp()
        myFixture.configureByText("Task2.kt", sourceText)
        myFixture.file.checkIfOptimizeImportsWereApplied()
    }
}
