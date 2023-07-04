import com.intellij.openapi.application.ReadAction
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import org.jetbrains.kotlin.psi.KtNamedFunction
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
    fun testTyposInSolution() {
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
        Assertions.assertEquals(setCorrectNames, setNames)
    }
}
