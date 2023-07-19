import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class Test : BaseIjTestClass() {

    companion object {

        private lateinit var sourceText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/extracting/Task.kt"
            )
            sourceText = sourceCodeFile.readText()
        }
    }

    @Test
    fun test() {
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        val expected = "grades.sum()"
        val namesFunction = getMethodsContainingContent(expected)
        if (namesFunction.size == 1) {
            val extractedMethod = namesFunction.toList()[0]
            val methodsUsingExtractedMethod = getMethodsContainingContent(extractedMethod)
            println(methodsUsingExtractedMethod)
        } else {
            println("Error")
        }
    }
}
