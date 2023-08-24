Create a base interface `PaymentStrategy` for payment strategy classes with `processPayment(amount: Double)` method.

<div class="hint" title="Refactoring hint">

```kotlin
interface PaymentStrategy {
    fun processPayment(amount: Double)
}
```
</div>
