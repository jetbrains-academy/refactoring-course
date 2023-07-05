import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.psi.codeStyle.CodeStyleManager
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import java.io.File

class Test : BasePlatformTestCase() {

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
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        val originalCode = ApplicationManager.getApplication().runReadAction<String> { myFixture.file.text }
        val codeStyleManager = CodeStyleManager.getInstance(myFixture.project)
        WriteCommandAction.runWriteCommandAction(myFixture.project) {
            codeStyleManager.reformat(myFixture.file)
        }
        val formattedCode = ApplicationManager.getApplication().runReadAction<String> { myFixture.file.text }

        Assertions.assertEquals(formattedCode, originalCode)
    }
}
