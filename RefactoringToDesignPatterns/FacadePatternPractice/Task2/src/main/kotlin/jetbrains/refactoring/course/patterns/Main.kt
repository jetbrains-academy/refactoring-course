package jetbrains.refactoring.course.patterns

// Client code
fun main() {
    val videoLoader = VideoLoader()
    val videoProcessor = VideoProcessor()
    val videoEncoder = VideoEncoder()
    val videoSaver = VideoSaver()

    val video = videoLoader.loadVideo("video.mp4")
    val processedVideo = videoProcessor.processVideo(video)
    val encodedVideo = videoEncoder.encodeVideo(processedVideo)
    videoSaver.saveVideo(encodedVideo, "encoded_video.mp4")
}
