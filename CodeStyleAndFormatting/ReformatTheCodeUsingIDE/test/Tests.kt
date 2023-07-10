import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.jetbrains.academy.test.system.ij.formatting.PsiClass
import java.io.File
import org.jetbrains.academy.test.system.ij.formatting.checkIfFormattingRulesWereApplied
import org.jetbrains.academy.test.system.ij.formatting.checkIfOptimizeImportsWereApplied

class Test {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File("$taskDirectoryPath/src/Task.kt")
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun testSolutionIsFormatted() {
        val psi = PsiClass(sourceText)
        psi.getPsiFile()?.checkIfFormattingRulesWereApplied()
    }

    @Test
    fun testUnusedImport() {
        val psi = PsiClass(sourceText)
        psi.getPsiFile()?.checkIfOptimizeImportsWereApplied()
    }
}
