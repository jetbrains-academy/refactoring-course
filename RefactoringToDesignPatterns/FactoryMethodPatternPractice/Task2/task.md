In the main method, add an invocation of the `getTransportation` method.

<div class="hint" title="Refactoring hint">

```kotlin
fun main() {
    val driveMessage = TransportationServiceFactory().getTransportation("car").drive()
}
```
</div>
