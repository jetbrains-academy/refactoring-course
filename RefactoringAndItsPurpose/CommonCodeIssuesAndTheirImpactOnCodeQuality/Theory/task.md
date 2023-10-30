# Task 1/2: Common code issues and their impact on code quality

Martin Fowler introduced the **_code smell_** term, which indicates that code might have some issues or shortcomings in its
implementation. That doesn’t necessarily mean that code has bugs, but the smell makes code understanding, developing, and
maintenance much more complex.

Ignoring code smells leads to an increase of technical debt. Resolving code smells via
refactoring improves the codebase’s quality and makes it clearer and more extensible.

In this course, we will take a look at several code quality issues, such as long methods, long parameter list, duplicated code, large
classes, feature envy, and middle man.

Let's take a look at the code snippets above.

**Before refactoring:**

```kotlin
class Order(
    val customerId: Int,
    val orderId: Int,
    val productName: String,
    val productCategory: String,
    val productPrice: Double,
    val productStockQuantity: Int,
    val productSupplier: String,
    val quantity: Int,
    val shippingAddress: String,
) {

    fun processOrder() {
        // Process the order with the provided parameters
    }
}
```

In this code snippet, class `Order` takes **9** parameters in the constructor,
which makes the code less readable and harder to understand.
A situation when a class/method takes many parameters is called **_Long Parameter List_** code smell.
As the number of parameters increases, it becomes challenging to keep track of their order and purpose,
leading to potential mistakes and maintenance difficulties.

**After refactoring:**

```kotlin
data class Product(
    val name: String,
    val category: String,
    val price: Double,
    val stockQuantity: Int,
    val supplier: String,
)

class Order(
    val customerId: Int,
    val orderId: Int,
    val product: Product,
    val quantity: Int,
    val shippingAddress: String,
) {

    fun processOrder() {
        // Process the order using the product details
    }
}
```

The refactoring addressed _Long Parameter List_ by introducing a separate data class called `Product`
to encapsulate the parameters related to the product.
The code became more readable as data related to the product is encapsulated in a single object `Product`,
promoting better design principles.