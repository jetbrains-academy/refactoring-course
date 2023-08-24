package jetbrains.refactoring.course.patterns.strategy

interface PaymentStrategy {
    fun processPayment(amount: Double)
}
