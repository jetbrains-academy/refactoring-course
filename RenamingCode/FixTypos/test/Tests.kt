import com.intellij.openapi.application.ReadAction
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
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
    fun testTyposInSolution() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        val setNames = mutableSetOf<String>()
        ReadAction.compute<Unit?, RuntimeException> {
            myFixture.file.accept(object : PsiRecursiveElementWalkingVisitor() {
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
