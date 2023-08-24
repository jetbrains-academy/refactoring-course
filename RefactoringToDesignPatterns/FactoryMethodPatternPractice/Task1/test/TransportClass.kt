import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable

internal val transportationServiceFactoryClass = TestClass(
    "TransportationServiceFactory",
    classPackage = "jetbrains.refactoring.course.patterns",
    customMethods = listOf(
        TestMethod(
            name = "getTransportation",
            returnType = TestKotlinType("Transport"),
            returnTypeJava = "Transport",
            arguments = listOf(
                TestVariable(name = "transport", javaType = "String"),
            ),
        ),
    ),
)
