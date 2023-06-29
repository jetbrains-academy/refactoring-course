import com.intellij.openapi.application.ReadAction
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
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

        val setNames = mutableSetOf<String>()
        ReadAction.compute<Unit?, RuntimeException> {
            psiFile.accept(object : PsiRecursiveElementWalkingVisitor() {
                override fun visitElement(element: PsiElement) {
                    if (element is KtNamedFunction) {
                        val identifier = element.identifyingElement
                        if (identifier != null) setNames.add(identifier.text)
                    }
                    super.visitElement(element)
                }
            })
        }
        val setCorrectNames = setOf("getGradeStatus", "setName", "setAge", "setAverageScore")
        Assert.assertTrue("There are typos in the file.", setNames.equals(setCorrectNames))
    }
}