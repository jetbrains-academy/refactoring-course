import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class EditorconfigTest {

    companion object {

        private lateinit var editorconfigFile: File

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            editorconfigFile = File(
                "$taskDirectoryPath/.editorconfig"
            )
        }
    }

    @Test
    fun editorconfigFileCreatedTest() {
        Assertions.assertTrue(editorconfigFile.exists())
    }

    @Test
    fun editorconfigFileContentTest() {
        val sourceText = editorconfigFile.readText()
        val expectedText = """
                [*]
                indent_size = 4
                indent_style = space
        """.trimIndent()
        Assertions.assertEquals(expectedText, sourceText)
    }
}
