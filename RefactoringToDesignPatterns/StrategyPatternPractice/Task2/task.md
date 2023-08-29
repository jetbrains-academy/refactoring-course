Implement a separate class for each payment method: `CreditCardPayment`, `PayPalPayment`, and `BitcoinPayment`. 

Each of these classes should implement the base `PaymentStrategy` interface and override the `processPayment()` method.

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
