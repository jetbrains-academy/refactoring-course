Clean the main method and add there an invocation of `getTransportation` method.

<div class="hint" title="Refactoring hint">

```kotlin
fun main() {
    val driveMessage = TransportationServiceFactory().getTransportation("car").drive()
}
```
</div>
