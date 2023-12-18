### Task

- Create a class `TransportationServiceFactory` with the `getTransportation(transport: String)` method.
  This method should return an appropriate transportation based on the given transport name, using the `when`
  construction.

- In the main method, create an instance of `TransportationServiceFactory` class, add an invocation of
  the `getTransportation` method, and invoke `drive` method.

### Hints

<div class="hint" title="Where to start?">

The file where you should write the code is already open.
Please, create a new class named `TransportationServiceFactory` and implement `getTransportation` method.
</div>

<div class="hint" title="How should TransportationServiceFactory class look?">

Examine the code in the `main` method to identify the lines that create specific transports based on their names.
Then, move those lines manually to the `getTransportation(transport: String)` method in the `TransportationServiceFactory` class.

</div>

<div class="hint" title="How to fix main method?">

```kotlin
fun main(args: Array<String>) {
    val transportName = args[0]
    val driveMessage = TransportationServiceFactory().getTransportation(transportName).drive()
    println(driveMessage)
}
```

</div>
