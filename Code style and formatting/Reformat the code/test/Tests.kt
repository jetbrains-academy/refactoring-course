import com.intellij.openapi.application.ReadAction
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.codeStyle.CodeStyleManager
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSolution() {
        val fixtureFactory = IdeaTestFixtureFactory.getFixtureFactory()
        val fixtureBuilder = fixtureFactory.createFixtureBuilder("Fxt")
        val fixture = fixtureFactory.createCodeInsightFixture(fixtureBuilder.fixture)
        fixture.testDataPath = System.getProperty("user.dir")
        fixture.setUp()
        val project = fixture.project
        val virtualFile = fixture.copyFileToProject("/src/Task.kt")
        val psiFile = ReadAction.compute<PsiFile?, RuntimeException> {
            PsiManager.getInstance(project).findFile(virtualFile)
        }
        var originalCode = ""
        var formattedCode = ""

        WriteCommandAction.runWriteCommandAction(project) {
            originalCode = psiFile.text
            val codeStyleManager = CodeStyleManager.getInstance(psiFile.project)
            codeStyleManager.reformat(psiFile)
            formattedCode = psiFile.text
        }

        Assert.assertTrue("Code is not formatted.", originalCode == formattedCode)
    }
}
