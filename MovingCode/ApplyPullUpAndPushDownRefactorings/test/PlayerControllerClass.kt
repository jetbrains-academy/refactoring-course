import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val playerControllerClass = TestClass(
    "PlayerController",
    classPackage = "jetbrains.refactoring.course.moving.controllers",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "playerPosition",
            javaType = "Vector2",
            kotlinType = TestKotlinType("Vector2"),
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "move",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)

internal val mousePlayerControllerClass = TestClass(
    "MousePlayerController",
    classPackage = "jetbrains.refactoring.course.moving.controllers",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "screenSize",
            javaType = "Vector2",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "move",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "getDirection",
            returnType = TestKotlinType("Vector2"),
            returnTypeJava = "Vector2",
        ),
    ),
)

internal val keyboardPlayerControllerClass = TestClass(
    "KeyboardPlayerController",
    classPackage = "jetbrains.refactoring.course.moving.controllers",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "context",
            javaType = "Context",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "move",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "getDirection",
            returnType = TestKotlinType("Vector2"),
            returnTypeJava = "Vector2",
        ),
    ),
)

internal val vector2Class = TestClass(
    "Vector2",
    classPackage = "jetbrains.refactoring.course.moving.utils",
    declaredFields = listOf(
        TestVariable(
            name = "x",
            javaType = "Int",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "y",
            javaType = "Int",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
    ),
)

internal val contextClass = TestClass(
    "Context",
    classPackage = "jetbrains.refactoring.course.moving.utils",
    declaredFields = listOf(
        TestVariable(
            name = "pressedKeys",
            javaType = "Set",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
    ),
)
