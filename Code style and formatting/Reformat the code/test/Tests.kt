import com.intellij.openapi.application.ReadAction
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.codeStyle.CodeStyleManager
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Test {

    companion object {

        private lateinit var project: Project
        private lateinit var psiFile: PsiFile

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val fixtureFactory = IdeaTestFixtureFactory.getFixtureFactory()
            val fixtureBuilder = fixtureFactory.createFixtureBuilder("Fxt")
            val fixture = fixtureFactory.createCodeInsightFixture(fixtureBuilder.fixture)
            fixture.testDataPath = System.getProperty("user.dir")
            fixture.setUp()
            project = fixture.project
            val virtualFile = fixture.copyFileToProject("/src/Task.kt")
            psiFile = ReadAction.compute<PsiFile?, RuntimeException> {
                PsiManager.getInstance(project).findFile(virtualFile)
            }
        }
    }
    @Test
    fun testSolutionIsFormatted() {
        var originalCode = ""
        var formattedCode = ""

        WriteCommandAction.runWriteCommandAction(project) {
            originalCode = psiFile.text
            val codeStyleManager = CodeStyleManager.getInstance(psiFile.project)
            codeStyleManager.reformat(psiFile)
            formattedCode = psiFile.text
        }

        Assertions.assertEquals(formattedCode, originalCode)
    }
}
