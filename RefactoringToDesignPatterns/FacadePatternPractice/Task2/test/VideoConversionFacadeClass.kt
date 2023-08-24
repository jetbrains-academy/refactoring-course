import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val videoConversionFacadeClass = TestClass(
    "VideoConversionFacade",
    classPackage = "jetbrains.refactoring.course.patterns",
    declaredFields = listOf(
        TestVariable(
            name = "loader",
            javaType = "VideoLoader",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "processor",
            javaType = "VideoProcessor",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "encoder",
            javaType = "VideoEncoder",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "saver",
            javaType = "VideoSaver",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "convertVideo",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(
                TestVariable(name = "inputFile", javaType = "String"),
                TestVariable(name = "outputFile", javaType = "String"),
            ),
        ),
    ),
)
