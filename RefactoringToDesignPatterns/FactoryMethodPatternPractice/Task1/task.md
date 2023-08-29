Create a class `TransportationServiceFactory` with the `getTransportation(transport: String)` method. 
This method should return an appropriate message based on the given transport mode, using the `when` construction.

<div class="hint" title="Refactoring hint">

```kotlin
class TransportationServiceFactory { 
    fun getTransportation(transport: String): Transport { 
        return when (transport) {
            "car" -> Car()
          "bicycle" -> Bicycle()
          else -> throw IllegalArgumentException("Unknown transport") 
        } 
    }
}
```
</div>
