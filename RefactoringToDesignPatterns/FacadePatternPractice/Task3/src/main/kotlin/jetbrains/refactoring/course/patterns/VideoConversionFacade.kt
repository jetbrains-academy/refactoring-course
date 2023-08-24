package jetbrains.refactoring.course.patterns

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
