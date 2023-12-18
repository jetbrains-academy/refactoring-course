import org.jetbrains.academy.test.system.core.models.TestKotlinType
import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.ClassType
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.method.TestMethod
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val animalClass = TestClass(
    "Animal",
    classType = ClassType.INTERFACE,
    classPackage = "jetbrains.refactoring.course.moving",
    customMethods = listOf(
        TestMethod(
            name = "eat",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "sleep",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "play",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
    ),
)

internal val meowMethod = TestMethod(
    name = "meow",
    returnType = TestKotlinType("Unit"),
    returnTypeJava = "void",
)

internal val catClass = TestClass(
    "Cat",
    classPackage = "jetbrains.refactoring.course.moving",
    declaredFields = listOf(
        TestVariable(
            name = "name",
            javaType = "String",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "age",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "eat",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "sleep",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "play",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        meowMethod,
    ),
)

internal val barkMethod = TestMethod(
    name = "bark",
    returnType = TestKotlinType("Unit"),
    returnTypeJava = "void",
)

internal val dogClass = TestClass(
    "Dog",
    classPackage = "jetbrains.refactoring.course.moving",
    declaredFields = listOf(
        TestVariable(
            name = "name",
            javaType = "String",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "age",
            javaType = "Int",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
    ),
    customMethods = listOf(
        TestMethod(
            name = "eat",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "sleep",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        TestMethod(
            name = "play",
            returnType = TestKotlinType("Unit"),
            returnTypeJava = "void",
        ),
        barkMethod,
    ),
)
