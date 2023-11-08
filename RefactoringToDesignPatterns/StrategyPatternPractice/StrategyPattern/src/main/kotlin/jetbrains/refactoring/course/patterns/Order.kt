package jetbrains.refactoring.course.patterns

import java.time.LocalDate

class Order(val totalAmount: Double, val date: LocalDate, val paymentMethod: String) {
    fun processPayment() {
        when (paymentMethod) {
            "CreditCard" -> {
                println("Processing credit card payment: $totalAmount")
            }
            "PayPal" -> {
                println("Processing PayPal payment: $totalAmount")
            }
            "Bitcoin" -> {
                println("Processing Bitcoin payment: $totalAmount")
            }
            else -> {
                println("Invalid payment method")
            }
        }
    }
}
