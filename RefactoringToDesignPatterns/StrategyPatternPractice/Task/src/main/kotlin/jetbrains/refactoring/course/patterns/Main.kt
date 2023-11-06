package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.processor.PaymentProcessor
import jetbrains.refactoring.course.patterns.strategy.BitcoinPayment
import jetbrains.refactoring.course.patterns.strategy.CreditCardPayment
import jetbrains.refactoring.course.patterns.strategy.PayPalPayment

fun main() {
    val creditCardPaymentProcessor = PaymentProcessor(CreditCardPayment())
    val paypalPaymentProcessor = PaymentProcessor(PayPalPayment())
    val bitcoinPaymentProcessor = PaymentProcessor(BitcoinPayment())

    creditCardPaymentProcessor.processOrderPayment(100.0)
    paypalPaymentProcessor.processOrderPayment(50.0)
    bitcoinPaymentProcessor.processOrderPayment(200.0)
}
