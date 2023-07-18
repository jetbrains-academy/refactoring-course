import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class MovingTest {
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

    @Test
    fun newFilesCreatedTest() {
        val taskDirectoryPath = System.getProperty("user.dir")
        val mainFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/Main.kt")
        val driverFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/driver/Driver.kt")
        val carFile = File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/car/Car.kt")
        Assertions.assertTrue(mainFile.exists())
        Assertions.assertTrue(driverFile.exists())
        Assertions.assertTrue(carFile.exists())
    }
}
