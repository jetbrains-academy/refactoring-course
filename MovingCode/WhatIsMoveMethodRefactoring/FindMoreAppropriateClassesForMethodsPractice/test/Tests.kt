import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class MovingTest : BaseIjTestClass() {

    companion object {

        private lateinit var carText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            val carFile =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/car/Car.kt")
            carText = carFile.readText()
        }
    }

    @Test
    fun testStartMethodMovedToCarClass() {
        setUp()
        myFixture.configureByText("Task.kt", carText)
        Assertions.assertTrue(hasMethod("start")) {
            "Please, move the \"start\" method"
        }
    }

    @Test
    fun testStopMethodMovedToCarClass() {
        setUp()
        myFixture.configureByText("Task.kt", carText)
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
