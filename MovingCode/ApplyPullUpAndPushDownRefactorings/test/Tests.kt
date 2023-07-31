import org.jetbrains.academy.test.system.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class PullUpAndPushDownTest : BaseIjTestClass() {

    companion object {

        private lateinit var animalText: String

        @JvmStatic
        @BeforeAll
        fun initialize() {
            val taskDirectoryPath = System.getProperty("user.dir")
            animalText =
                File("$taskDirectoryPath/src/main/kotlin/jetbrains/refactoring/course/moving/Animal.kt").readText()
        }
    }

    @Test
    fun testPullUpPlayMethodAndVariables() {
        setUp()
        myFixture.configureByText("Animal.kt", animalText)
        Assertions.assertTrue(hasMethod("play")) {
            "Please, pull up the \"play\" method"
        }
        Assertions.assertTrue(hasProperty("name")) {
            "Please, pull up the \"name\" variable"
        }
        Assertions.assertTrue(hasProperty("age")) {
            "Please, pull up the \"age\" variable"
        }
    }

    @Test
    fun testPushDownMethods() {
        setUp()
        myFixture.configureByText("Animal.kt", animalText)
        Assertions.assertFalse(hasMethod("bark")) {
            "Please, push down the \"bark\" method"
        }
        Assertions.assertFalse(hasMethod("meow")) {
            "Please, push down the \"meow\" method"
        }
    }

    @Test
    fun animalClassTest() {
        val clazz = animalClass.checkBaseDefinition()
        animalClass.checkFieldsDefinition(clazz)
        animalClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun catClassTest() {
        val clazz = catClass.checkBaseDefinition()
        catClass.checkFieldsDefinition(clazz)
        catClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun dogClassTest() {
        val clazz = dogClass.checkBaseDefinition()
        dogClass.checkFieldsDefinition(clazz)
        dogClass.checkDeclaredMethods(clazz)
    }
}
