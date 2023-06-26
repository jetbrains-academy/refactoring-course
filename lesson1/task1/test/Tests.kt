import com.intellij.openapi.application.ReadAction
import com.intellij.psi.*
import com.intellij.testFramework.fixtures.IdeaTestFixtureFactory
import org.jetbrains.kotlin.psi.*
import org.junit.Test
import java.io.File

class Test {
    @Test fun testSolution() {
        val taskDirectoryPath = System.getProperty("user.dir")
        val sourceCodeFile = File("$taskDirectoryPath/src/Task.kt")

        val fixtureFactory = IdeaTestFixtureFactory.getFixtureFactory()
        val fixtureBuilder = fixtureFactory.createFixtureBuilder("Fxt")
        val fixture = fixtureFactory.createCodeInsightFixture(fixtureBuilder.fixture)
        fixture.testDataPath = taskDirectoryPath
        fixture.setUp()
        val project = fixture.project
        val vf = fixture.copyFileToProject("/src/Task.kt")
        val psiFile = ReadAction.compute<PsiFile?, RuntimeException> {
            PsiManager.getInstance(project).findFile(vf)
        }
        val setReferences = mutableSetOf<String>()
        val setDeclarations = mutableSetOf<String>()
        ReadAction.compute<Unit?, RuntimeException> {
            psiFile.accept(object : PsiRecursiveElementWalkingVisitor() {
                override fun visitElement(element: PsiElement) {
                    if (element is KtNameReferenceExpression) {
                        val cnt = element.references.count()
                        if (cnt > 0) {
                            setReferences.add(element.text)
                        }
                    }
                    if (element is KtProperty) {
                        val identifier = element.identifyingElement
                        if (identifier != null) setDeclarations.add(identifier.text)
                    }
                    if (element is KtNamedFunction) {
                        val identifier = element.identifyingElement
                        if (identifier != null) setDeclarations.add(identifier.text)
                    }
                    super.visitElement(element)
                }
            })
        }
        setDeclarations.forEach {
            if (it != "main" && !setReferences.contains(it)) {
                println(it)
            }
        }
    }
}