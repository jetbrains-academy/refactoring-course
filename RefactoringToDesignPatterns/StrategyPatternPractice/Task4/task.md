### Task

In the main method, create an instance of `PaymentProcessor`, passing the appropriate payment strategy during object creation.

### Hints

<div class="hint" title="Refactoring hint">

```kotlin
fun main() {
    val creditCardPayment = PaymentProcessor(CreditCardPayment())
    val payPalPayment = PaymentProcessor(PayPalPayment())
    val bitcoinPayment = PaymentProcessor(BitcoinPayment())

    creditCardPayment.processOrderPayment(100.0)
    payPalPayment.processOrderPayment(50.0)
    bitcoinPayment.processOrderPayment(200.0)
}
```
</div>

By using the **Strategy** design pattern, the payment processing logic is separated from the `Order` class,
making it more flexible and maintainable.
Adding new payment methods or modifying the existing ones is easier and doesn't affect the `Order` class.
The client code also becomes cleaner, as it focuses on creating instances of `PaymentProcessor` with the desired payment strategies.

