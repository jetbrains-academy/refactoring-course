import org.junit.jupiter.api.Test

class RenamingTest {

    @Test
    fun studentClassTest() {
        val clazz = studentClass.checkBaseDefinition()
        studentClass.checkFieldsDefinition(clazz)
        studentClass.checkDeclaredMethods(clazz)
    }
}
