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
    fun controllerClassTest() {
        val clazz = controllerClass.checkBaseDefinition()
        controllerClass.checkFieldsDefinition(clazz)
        controllerClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun playerControllerClassTest() {
        val clazz = playerControllerClass.checkBaseDefinition()
        playerControllerClass.checkFieldsDefinition(clazz)
        playerControllerClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun enemyControllerClassTest() {
        val clazz = enemyControllerClass.checkBaseDefinition()
        enemyControllerClass.checkFieldsDefinition(clazz)
        enemyControllerClass.checkDeclaredMethods(clazz)
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

    @Test
    fun characterClassTest() {
        val clazz = characterClass.checkBaseDefinition()
        characterClass.checkFieldsDefinition(clazz)
        characterClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun enemyClassTest() {
        val clazz = enemyClass.checkBaseDefinition()
        enemyClass.checkFieldsDefinition(clazz)
        enemyClass.checkDeclaredMethods(clazz)
    }

    @Test
    fun playerClassTest() {
        val clazz = playerClass.checkBaseDefinition()
        playerClass.checkFieldsDefinition(clazz)
        playerClass.checkDeclaredMethods(clazz)
    }
}
