import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import java.io.File

class PushDownTest : BaseIjTestClass() {

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
    fun testPushDownMeowMethod() {
        setUp()
        myFixture.configureByText("Animal.kt", animalText)
        Assertions.assertFalse(hasMethod("meow")) {
            "Please, push down the \"meow\" method"
        }
        val clazz = dogClass.checkBaseDefinition()
        Assertions.assertThrows(
            AssertionError::class.java,
            { dogClass.findMethod(clazz, meowMethod) },
            "Please, remove the \"meow\" method from the Dog class"
        )
    }

    @Test
    fun testPushDownBarkMethod() {
        setUp()
        myFixture.configureByText("Animal.kt", animalText)
        Assertions.assertFalse(hasMethod("bark")) {
            "Please, push down the \"bark\" method"
        }
        val clazz = catClass.checkBaseDefinition()
        Assertions.assertThrows(
            AssertionError::class.java,
            { catClass.findMethod(clazz, barkMethod) },
            "Please, remove the \"bark\" method from the Cat class"
        )
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
