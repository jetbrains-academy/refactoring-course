Implement separate class for each payment method: `CreditCardPayment`, `PayPalPayment`, `BitcoinPayment`. 
Each of these classes should implement base `PaymentStrategy` interface and override `processPayment()` method.

<div class="hint" title="Refactoring hint">

```kotlin
interface PaymentStrategy {
    fun processPayment(amount: Double)
}

class CreditCardPayment : PaymentStrategy {
    override fun processPayment(amount: Double) {
        println("Processing credit card payment: $amount")
    }
}

class PayPalPayment : PaymentStrategy {
    override fun processPayment(amount: Double) {
        println("Processing PayPal payment: $amount")
    }
}

class BitcoinPayment : PaymentStrategy {
    override fun processPayment(amount: Double) {
        println("Processing Bitcoin payment: $amount")
    }
}
```
</div>
