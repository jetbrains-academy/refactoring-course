import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class MovingTest : BaseIjTestClass() {

    companion object {

        private lateinit var taskDirectoryPath: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            taskDirectoryPath = System.getProperty("user.dir")
        }
    }

    @Test
    fun testCarClassMoved() {
        Assertions.assertTrue(
            File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/car/Car.kt").exists()
        ) {
            "Please, move the \"Car\" class to a separate file"
        }
    }

    @Test
    fun testDriverClassMoved() {
        Assertions.assertTrue(
            File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/driver/Driver.kt").exists()
        ) {
            "Please, move the \"Driver\" class to a separate file"
        }
    }

    @Test
    fun testStartMethodMovedToCarClass() {
        val carFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/car/Car.kt")
        val sourceText = carFile.readText()
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertTrue(hasMethod("start")) {
            "Please, move the \"start\" method"
        }
    }

    @Test
    fun testStopMethodMovedToCarClass() {
        val carFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/car/Car.kt")
        val sourceText = carFile.readText()
        setUp()
        myFixture.configureByText("Task.kt", sourceText)
        Assertions.assertTrue(hasMethod("stop")) {
            "Please, move the \"stop\" method"
        }
    }

    @Test
    fun driverClassTest() {
        val clazz = driverClass.checkBaseDefinition()
        driverClass.checkFieldsDefinition(clazz)
        driverClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun carClassTest() {
        val clazz = carClass.checkBaseDefinition()
        carClass.checkFieldsDefinition(clazz)
        carClass.checkDeclaredMethods(clazz)
    }
}
