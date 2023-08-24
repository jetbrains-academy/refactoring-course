import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class FacadePatternTest : BaseIjTestClass() {

    companion object {

        private lateinit var mainText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val mainCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/patterns/Main.kt"
            )
            mainText = mainCodeFile.readText()
        }
    }

    @Test
    fun testChangedMainMethod() {
        setUp()
        myFixture.configureByText("Main.kt", mainText)
        Assertions.assertEquals(
            findMethodUsages("convertVideo(\"video.mp4\", \"encoded_video.mp4\")"),
            listOf("main")
        ) {
            "Please, invoke the convertVideo() method in the main method"
        }
    }
}
