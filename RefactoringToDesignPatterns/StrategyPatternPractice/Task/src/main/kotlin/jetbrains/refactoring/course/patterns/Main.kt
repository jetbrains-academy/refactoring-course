package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.processor.PaymentProcessor
import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment
import java.time.LocalDate

fun main() {
    val order1 = Order(100.0, LocalDate.of(2023, 3, 1))
    val order2 = Order(50.0, LocalDate.of(2023, 6, 1))
    val order3 = Order(200.0, LocalDate.of(2023, 9, 1))

    val creditCardPayment = PaymentProcessor(CreditCardPayment())
    val paypalPayment = PaymentProcessor(PayPalPayment())
    val bitcoinPayment = PaymentProcessor(BitcoinPayment())

    creditCardPayment.processOrderPayment(order1.totalAmount)
    paypalPayment.processOrderPayment(order2.totalAmount)
    bitcoinPayment.processOrderPayment(order3.totalAmount)
}
