package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val originalVideoName = args[0]
    val processedVideoName = args[1]

    val videoLoader = VideoLoader()
    val videoProcessor = VideoProcessor()
    val videoEncoder = VideoEncoder()
    val videoSaver = VideoSaver()

    val video = videoLoader.loadVideo(originalVideoName)
    val processedVideo = videoProcessor.processVideo(video)
    val encodedVideo = videoEncoder.encodeVideo(processedVideo)
    videoSaver.saveVideo(encodedVideo, processedVideoName)
}
