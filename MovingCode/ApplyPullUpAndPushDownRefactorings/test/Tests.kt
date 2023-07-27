import org.junit.jupiter.api.Test

class PullUpAndPushDownTest {
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
