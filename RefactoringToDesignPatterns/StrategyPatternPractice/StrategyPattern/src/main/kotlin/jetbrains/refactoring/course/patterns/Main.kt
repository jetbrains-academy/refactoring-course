package jetbrains.refactoring.course.patterns

import java.time.LocalDate

fun main() {
    val order1 = Order(100.0, LocalDate.of(2023, 3, 1), "CreditCard")
    val order2 = Order(50.0, LocalDate.of(2023, 6, 1), "PayPal")
    val order3 = Order(200.0, LocalDate.of(2023, 9, 1), "Bitcoin")

    order1.processPayment()
    order2.processPayment()
    order3.processPayment()
}
