import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class RenamingTest : BaseIjTestClass() {

    companion object {

        private lateinit var studentText: String
        private lateinit var universityText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val studentFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/renaming/Student.kt")
            studentText = studentFile.readText()
            val universityFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/renaming/University.kt")
            universityText = universityFile.readText()
        }
    }

    @Test
    fun testRenamingMethodNames() {
        setUp()
        myFixture.configureByText("Student.kt", studentText)
        Assertions.assertTrue(hasMethod("getGradeStatus")) {
            "Please, fix the typos in the method name - getgradestatus"
        }
        Assertions.assertTrue(hasMethod("setName")) {
            "Please, fix the typos in the method name - SetName"
        }
        Assertions.assertTrue(hasMethod("setAge")) {
            "Please, fix the typos in the method name - setaGe"
        }
        Assertions.assertTrue(hasMethod("setAverageScore")) {
            "Please, fix the typos in the method name - setAvergeScore"
        }
    }

    @Test
    fun test() {
        setUp()
        myFixture.configureByText("University.kt", universityText)
        var expression = "setName(newName)"
        var parent = "student.setName(newName)"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, rename the method calls too"
        }
        expression = "setAge(newAge)"
        parent = "student.setAge(newAge)"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, rename the method calls too"
        }
        expression = "setAverageScore(newScore)"
        parent = "student.setAverageScore(newScore)"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, rename the method calls too"
        }
        expression = "getGradeStatus()"
        parent = "students[index].getGradeStatus()"
        Assertions.assertTrue(hasExpressionWithParent(expression, parent)) {
            "Please, rename the method calls too"
        }
    }

    @Test
    fun studentClassTest() {
        val clazz = studentClass.checkBaseDefinition()
        studentClass.checkFieldsDefinition(clazz)
        studentClass.checkDeclaredMethods(clazz)
    }
}
