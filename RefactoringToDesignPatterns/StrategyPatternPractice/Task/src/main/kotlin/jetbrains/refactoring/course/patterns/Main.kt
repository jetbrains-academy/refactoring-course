package jetbrains.refactoring.course.patterns

fun main() {
    val order1 = Order(100.0, "CreditCard")
    val order2 = Order(50.0, "PayPal")
    val order3 = Order(200.0, "Bitcoin")

    order1.processPayment()
    order2.processPayment()
    order3.processPayment()
}
