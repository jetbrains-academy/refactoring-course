### Task

- Create a base interface `PaymentStrategy` for payment strategy classes with the `processPayment(amount: Double)`
  method.
- Implement a separate class for each payment method: `CreditCardPayment`, `PayPalPayment`, and `BitcoinPayment`.
  Each of these classes should implement the base `PaymentStrategy` interface and override the `processPayment()`
  method.
- Create a `PaymentProcessor` class that encapsulates the payment behavior.
  This class should take as a constructor parameter `paymentStrategy: PaymentStrategy`
  and should contain the `processOrderPayment` method, which invokes the `processPayment` method from `paymentStrategy`.
- Transform the `Order` class into a `data class` that encapsulates details regarding the order's price and date.
- Within the `Main::main` method, instantiate an `Order` object for each order and a `PaymentProcessor` for each payment type.
  Make sure to pass the corresponding payment strategy when creating the `PaymentProcessor` object.

By using the **Strategy** design pattern, the payment processing logic is separated from the `Order` class,
making it more flexible and maintainable.
Adding new payment methods or modifying the existing ones is easier and doesn't affect the `Order` class.
The client code also becomes cleaner, as it focuses on creating instances of `PaymentProcessor` with the desired payment
strategies.

### Hints

<div class="hint" title="Where to start?">

The file where you should write the code is already open.
Please, create an interface named `PaymentStrategy` and add `processPayment(amount: Double)` method.
</div>

<div class="hint" title="How should PaymentProcessor class look?">

Here's the PaymentProcessor code:

```kotlin
class PaymentProcessor(private val paymentStrategy: PaymentStrategy) {
  fun processOrderPayment(amount: Double) = paymentStrategy.processPayment(amount)
}
```

</div>

<div class="hint" title="How should PaymentStrategy subclasses look?">

For example, for a credit card payment type, the code would be:

```kotlin
class CreditCardPayment : PaymentStrategy {
    override fun processPayment(amount: Double) = println("Processing credit card payment: $amount")
}
```

</div>

<div class="hint" title="How to fix main method?">

In the main method, **for each order**, you should instantiate an `Order` object, providing it with the corresponding total amount and date.
Then, you need to instantiate a `PaymentProcessor` object, supplying it with the appropriate payment strategy as an argument.
Finally, you should invoke the `processOrderPayment()` method.
For example, the code for processing a payment with a credit card would be:

```kotlin
val order1 = Order(100.0, LocalDate.of(2023, 3, 1))
val creditCardPayment = PaymentProcessor(CreditCardPayment())
creditCardPayment.processOrderPayment(order1.totalAmount)
```

</div>