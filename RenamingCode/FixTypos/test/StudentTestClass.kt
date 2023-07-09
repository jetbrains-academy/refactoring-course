import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val studentClass = TestClass(
    "Student",
    declaredFields = listOf(
        TestVariable(
            name = "name",
            javaType = "String",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
        TestVariable(
            name = "age",
            javaType = "Int",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
        TestVariable(
            name = "averageScore",
            javaType = "Double",
            visibility = Visibility.PRIVATE,
            mutability = VariableMutability.VAR,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "getGradeStatus",
            returnType = TestKotlinType("String"),
        ),
        TestMethod(
            name = "setName",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "newName", javaType = "String")),
        ),
        TestMethod(
            name = "setAge",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "newAge", javaType = "Int")),
        ),
        TestMethod(
            name = "setAverageScore",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
            arguments = listOf(TestVariable(name = "newScore", javaType = "Double")),
        ),
    ),
)
