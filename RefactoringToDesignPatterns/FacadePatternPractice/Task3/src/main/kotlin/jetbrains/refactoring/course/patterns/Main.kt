package jetbrains.refactoring.course.patterns

// Client code
fun main() {
    val facade = VideoConversionFacade()
    facade.convertVideo("video.mp4", "encoded_video.mp4")
}
