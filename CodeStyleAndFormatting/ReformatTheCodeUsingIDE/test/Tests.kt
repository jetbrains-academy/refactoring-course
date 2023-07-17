import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File
import org.jetbrains.academy.test.system.ij.formatting.checkIfFormattingRulesWereApplied
import org.jetbrains.academy.test.system.ij.formatting.checkIfOptimizeImportsWereApplied

class ReformatCodeTest : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/formatting/Task.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testSolutionIsFormatted() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        myFixture.file.checkIfFormattingRulesWereApplied()
    }

    @Test
    fun testUnusedImportsAreRemoved() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        myFixture.file.checkIfOptimizeImportsWereApplied()
    }
}
