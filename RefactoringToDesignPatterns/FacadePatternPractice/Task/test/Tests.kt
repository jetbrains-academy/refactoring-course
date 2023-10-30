import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class FacadePatternTest : BaseIjTestClass() {

    companion object {

        private lateinit var facadeText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile = File(
                "$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/patterns/VideoConversionFacade.kt"
            )
            facadeText = sourceCodeFile.readText()
        }
    }

    @Test
    fun videoConversionFacadeClassTest() {
        Assertions.assertDoesNotThrow(
            {
                videoConversionFacadeClass.checkBaseDefinition()
            },
            "Please, create a VideoConversionFacade class"
        )

        setUp()
        myFixture.configureByText("VideoConversionFacade.kt", facadeText)
        var propertyName = "videoLoader"
        Assertions.assertTrue(hasProperty(propertyName)) {
            "Please, create the property $propertyName"
        }
        propertyName = "videoProcessor"
        Assertions.assertTrue(hasProperty(propertyName)) {
            "Please, create the property $propertyName"
        }
        propertyName = "videoEncoder"
        Assertions.assertTrue(hasProperty(propertyName)) {
            "Please, create the property $propertyName"
        }
        propertyName = "videoSaver"
        Assertions.assertTrue(hasProperty(propertyName)) {
            "Please, create the property $propertyName"
        }

        val clazz = videoConversionFacadeClass.checkBaseDefinition()
        videoConversionFacadeClass.checkFieldsDefinition(clazz)
    }
}
