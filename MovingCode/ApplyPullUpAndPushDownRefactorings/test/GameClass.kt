import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val controllerClass = TestClass(
    "Controller",
    classPackage = "jetbrains.refactoring.course.moving.controller",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "character",
            javaType = "Character",
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
    ),
)

internal val playerControllerClass = TestClass(
    "PlayerController",
    classPackage = "jetbrains.refactoring.course.moving.controller",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "player",
            javaType = "Player",
            kotlinType = TestKotlinType("Player"),
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
    ),
)

internal val enemyControllerClass = TestClass(
    "EnemyController",
    classPackage = "jetbrains.refactoring.course.moving.controller",
    declaredFields = listOf(
        TestVariable(
            name = "speed",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "enemy",
            javaType = "Enemy",
            kotlinType = TestKotlinType("Enemy"),
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
    ),
)

internal val mousePlayerControllerClass = TestClass(
    "MousePlayerController",
    classPackage = "jetbrains.refactoring.course.moving.controller",
    declaredFields = listOf(
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
    classPackage = "jetbrains.refactoring.course.moving.controller",
    declaredFields = listOf(
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
    customMethods = listOf(
        TestMethod(
            name = "plus",
            arguments = listOf(
                TestVariable(
                    name = "other",
                    javaType = "Vector2",
                )
            ),
            returnType = TestKotlinType("Vector2"),
            returnTypeJava = "Vector2",
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

internal val characterClass = TestClass(
    "Character",
    classPackage = "jetbrains.refactoring.course.moving.model",
    declaredFields = listOf(
        TestVariable(
            name = "position",
            javaType = "Vector2",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "DEFAULT",
            javaType = "Int",
            isConst = true,
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "maxHealth",
            javaType = "Int",
            isConst = true,
            mutability = VariableMutability.VAL,
            visibility = Visibility.PRIVATE,
        ),
        TestVariable(
            name = "health",
            javaType = "Int",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "damage",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "armor",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "beAttacked",
            arguments = listOf(
                TestVariable(
                    name = "character",
                    javaType = "Character",
                )
            ),
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)

internal val enemyClass = TestClass(
    "Enemy",
    classPackage = "jetbrains.refactoring.course.moving.model",
    declaredFields = listOf(
        TestVariable(
            name = "experience",
            javaType = "Int",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "attack",
            arguments = listOf(
                TestVariable(
                    name = "character",
                    javaType = "Character",
                )
            ),
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)

internal val playerClass = TestClass(
    "Player",
    classPackage = "jetbrains.refactoring.course.moving.model",
    declaredFields = listOf(
        TestVariable(
            name = "experience",
            javaType = "Int",
            mutability = VariableMutability.VAR,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "attack",
            arguments = listOf(
                TestVariable(
                    name = "character",
                    javaType = "Character",
                )
            ),
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)
