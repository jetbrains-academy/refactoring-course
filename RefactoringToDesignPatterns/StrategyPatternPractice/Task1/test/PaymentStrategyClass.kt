import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.classes.ClassType
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable

internal val paymentStrategyClass = TestClass(
    "PaymentStrategy",
    classPackage = "jetbrains.refactoring.course.patterns.strategy",
    classType = ClassType.INTERFACE,
    customMethods = listOf(
        TestMethod(
            name = "processPayment",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(
                TestVariable(name = "amount", javaType = "Double"),
            ),
        ),
    ),
)
