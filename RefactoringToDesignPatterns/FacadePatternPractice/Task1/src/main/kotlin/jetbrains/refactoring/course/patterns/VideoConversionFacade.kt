package jetbrains.refactoring.course.patterns

class VideoConversionFacade {
    private val loader = VideoLoader()
    private val processor = VideoProcessor()
    private val encoder = VideoEncoder()
    private val saver = VideoSaver()
}
