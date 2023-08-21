import org.ini4j.Ini
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
        val ini = Ini(editorconfigFile)
        Assertions.assertEquals("4", ini.get("*")?.get("indent_size")) {
            "Please, define the settings so that the indentation size is equal to 4"
        }
        Assertions.assertEquals("space", ini.get("*")?.get("indent_style")) {
            "Please, define the settings so that the indentation style is equal to space"
        }
        Assertions.assertEquals("120", ini.get("*")?.get("max_line_length")) {
            "Please, define the settings so that the maximum line length is equal to 120"
        }
        Assertions.assertEquals("true", ini.get("*")?.get("insert_final_newline")) {
            "Please, define the settings so that a newline character is added at the end of the last line in the file"
        }
    }
}
