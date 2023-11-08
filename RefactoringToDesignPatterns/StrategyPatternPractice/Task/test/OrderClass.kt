import org.jetbrains.academy.test.system.core.models.Visibility
import org.jetbrains.academy.test.system.core.models.classes.ClassType
import org.jetbrains.academy.test.system.core.models.classes.TestClass
import org.jetbrains.academy.test.system.core.models.variable.TestVariable
import org.jetbrains.academy.test.system.core.models.variable.VariableMutability

internal val orderClass = TestClass(
    "Order",
    classPackage = "jetbrains.refactoring.course.patterns",
    classType = ClassType.CLASS,
    declaredFields = listOf(
        TestVariable(
            name = "totalAmount",
            javaType = "Double",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        ),
        TestVariable(
            name = "date",
            javaType = "LocalDate",
            mutability = VariableMutability.VAL,
            visibility = Visibility.PUBLIC,
        )
    )
)
