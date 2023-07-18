import org.junit.jupiter.api.Test

class PullUpAndPushDownTest {
    @Test
    fun vector2ClassTest() {
        val clazz = vector2Class.checkBaseDefinition()
        vector2Class.checkFieldsDefinition(clazz)
        vector2Class.checkDeclaredMethods(clazz)
    }

    @Test
    fun contextClassTest() {
        val clazz = contextClass.checkBaseDefinition()
        contextClass.checkFieldsDefinition(clazz)
        contextClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun playerControllerClassTest() {
        val clazz = playerControllerClass.checkBaseDefinition()
        playerControllerClass.checkFieldsDefinition(clazz)
        playerControllerClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun keyboardPlayerControllerClassTest() {
        val clazz = keyboardPlayerControllerClass.checkBaseDefinition()
        keyboardPlayerControllerClass.checkFieldsDefinition(clazz)
        keyboardPlayerControllerClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun mousePlayerControllerClassTest() {
        val clazz = mousePlayerControllerClass.checkBaseDefinition()
        mousePlayerControllerClass.checkFieldsDefinition(clazz)
        mousePlayerControllerClass.checkDeclaredMethods(clazz)
    }
}
