package jetbrains.refactoring.course.patterns

class VideoConversionFacade {
    private val videoLoader = VideoLoader()
    private val videoProcessor = VideoProcessor()
    private val videoEncoder = VideoEncoder()
    private val videoSaver = VideoSaver()

    fun convertVideo(originalVideoName: String, processedVideoName: String) {
        val video = videoLoader.loadVideo(originalVideoName)
        val processedVideo = videoProcessor.processVideo(video)
        val encodedVideo = videoEncoder.encodeVideo(processedVideo)
        videoSaver.saveVideo(encodedVideo, processedVideoName)
    }
}
