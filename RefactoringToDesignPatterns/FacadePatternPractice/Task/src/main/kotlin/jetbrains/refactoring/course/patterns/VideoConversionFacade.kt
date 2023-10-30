package jetbrains.refactoring.course.patterns

class VideoConversionFacade {
    private val videoLoader = VideoLoader()
    private val videoProcessor = VideoProcessor()
    private val videoEncoder = VideoEncoder()
    private val videoSaver = VideoSaver()
}
