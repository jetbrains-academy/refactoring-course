import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val paymentProcessorClass = TestClass(
    "PaymentProcessor",
    classPackage = "jetbrains.refactoring.course.patterns.processor",
    declaredFields = listOf(
        TestVariable(
            name = "paymentStrategy",
            javaType = "PaymentStrategy",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "processOrderPayment",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(
                TestVariable(name = "amount", javaType = "Double"),
            ),
        ),
    ),
)
