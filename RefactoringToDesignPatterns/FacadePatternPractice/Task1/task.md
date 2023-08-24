Create a class named `VideoConversionFacade` and create properties `loader`, `processor`, `encoder`, and `saver`.

<div class="hint" title="Refactoring hint">

```kotlin
class VideoConversionFacade {
    private val loader = VideoLoader()
    private val processor = VideoProcessor()
    private val encoder = VideoEncoder()
    private val saver = VideoSaver()
}
```
</div>
