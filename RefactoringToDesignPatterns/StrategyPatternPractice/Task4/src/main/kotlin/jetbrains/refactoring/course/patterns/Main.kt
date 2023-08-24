package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.processor.PaymentProcessor
import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment

fun main() {
    val creditCardPayment = PaymentProcessor(CreditCardPayment())
    val payPalPayment = PaymentProcessor(PayPalPayment())
    val bitcoinPayment = PaymentProcessor(BitcoinPayment())

    creditCardPayment.processOrderPayment(100.0)
    payPalPayment.processOrderPayment(50.0)
    bitcoinPayment.processOrderPayment(200.0)
}
