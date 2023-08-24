Finally, change the main method, it should create an instance of the `VideoConversionFacade` method and invoke the `convertVideo()` method.

<div class="hint" title="Refactoring hint">

```kotlin
// Client code
fun main() {
    val facade = VideoConversionFacade()
    facade.convertVideo("video.mp4", "encoded_video.mp4")
}
```
</div>
