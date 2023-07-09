import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val driverClass = TestClass(
    "Driver",
    declaredFields = listOf(
        TestVariable(
            name = "car",
            javaType = "class Car",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "changeCar",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "car", javaType = "Car")),
        ),
        TestMethod(
            name = "driving",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "destination", javaType = "String")),
            visibility = Visibility.PRIVATE,
        ),
        TestMethod(
            name = "driveTo",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "destination", javaType = "String")),
        ),
    ),
)

internal val carClass = TestClass(
    "Car",
    declaredFields = listOf(
        TestVariable(
            name = "gearsNumber",
            javaType = "Int",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAL,
        ),
        TestVariable(
            name = "engineStarted",
            javaType = "Boolean",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
        TestVariable(
            name = "gear",
            javaType = "Int",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "start",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "stop",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)
