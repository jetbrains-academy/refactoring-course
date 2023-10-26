### Task

Create a `PaymentProcessor` class that encapsulates the payment behavior. 
This class should take as a constructor parameter `paymentStrategy: 
PaymentStrategy` and should contain the `processOrderPayment` method, which invokes the `processPayment` method.

### Hints

<div class="hint" title="Refactoring hint">

```kotlin
class PaymentProcessor(private val paymentStrategy: PaymentStrategy) {
    fun processOrderPayment(amount: Double) {
        paymentStrategy.processPayment(amount)
    }
}
```
</div>
