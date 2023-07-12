import org.junit.jupiter.api.Test

class Test {

    @Test
    fun studentClassTest() {
        val clazz = studentClass.checkBaseDefinition()
        studentClass.checkFieldsDefinition(clazz)
        studentClass.checkDeclaredMethods(clazz)
    }
}
