package jetbrains.refactoring.course.patterns.strategy

class PayPalPayment : PaymentStrategy {
    override fun processPayment(amount: Double) {
        println("Processing PayPal payment: $amount")
    }
}
