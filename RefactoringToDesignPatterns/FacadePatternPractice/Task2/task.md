### Task

Then, create a method called `convertVideo` that takes two parameters `inputFile: String` and `outputFile: String`. This method should do the work currently placed in the `main()` method, particularly load, process, encode, and save the video.

### Hints

<div class="hint" title="Refactoring hint">

```kotlin
class VideoConversionFacade {
    private val loader = VideoLoader()
    private val processor = VideoProcessor()
    private val encoder = VideoEncoder()
    private val saver = VideoSaver()

    fun convertVideo(inputFile: String, outputFile: String) {
        val video = loader.loadVideo(inputFile)
        val processedVideo = processor.processVideo(video)
        val encodedVideo = encoder.encodeVideo(processedVideo)
        saver.saveVideo(encodedVideo, outputFile)
    }
}
```
</div>
