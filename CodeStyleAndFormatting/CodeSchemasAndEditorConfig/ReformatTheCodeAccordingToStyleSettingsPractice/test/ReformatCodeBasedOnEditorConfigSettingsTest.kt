import org.jetbrains.academy.test.system.ij.formatting.checkIfFormattingRulesWereApplied
import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class ReformatCodeBasedOnEditorConfigSettingsTest : BaseIjTestClass() {
    companion object {
        private lateinit var sourceText: String
        private lateinit var editorConfigSettingsText: String
        private lateinit var editorConfigSettingsFile: File

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val sourceCodeFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/formatting/Task.kt")
            sourceText = sourceCodeFile.readText()
            editorConfigSettingsFile = File("$taskDirectoryPath/.editorconfig")
            editorConfigSettingsText = editorConfigSettingsFile.readText()
        }
    }

    @Test
    fun testSolutionIsFormattedAccordingToEditorConfigSettings() {
        setUp()
        val editorConfigFile = myFixture.createFile(".editorconfig", editorConfigSettingsText)
        myFixture.addFileToProject(editorConfigFile.path, editorConfigSettingsText)
        myFixture.configureByText("Task.kt", sourceText)
        myFixture.file.checkIfFormattingRulesWereApplied()
    }
}
