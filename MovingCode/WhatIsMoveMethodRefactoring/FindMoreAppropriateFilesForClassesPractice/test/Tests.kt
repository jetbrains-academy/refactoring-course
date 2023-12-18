import org.jetbrains.academy.test.system.kotlin.test.BaseIjTestClass
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MovingTest : BaseIjTestClass() {

    @Test
    fun testCarClassMoved() {
        Assertions.assertDoesNotThrow(
            {
                carClass.checkBaseDefinition()
            },
            "Please, move the Car class to a separate file"
        )
    }

    @Test
    fun testDriverClassMoved() {
        Assertions.assertDoesNotThrow(
            {
                driverClass.checkBaseDefinition()
            },
            "Please, move the Driver class to a separate file"
        )
    }
}
