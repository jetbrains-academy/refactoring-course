package jetbrains.refactoring.course.extracting

import java.net.URI
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

private const val HTTP_PLACEKITTEN_COM = "http://placekitten.com"
private const val path = "ExtractingCode/ExtractMagicConstantsAndReduceMethodLength/src/main/resources/cats"

fun downloadPicture(imageUrl: URL, outPath: Path): String {
    val inputStream = imageUrl.openStream()
    if (!outPath.exists()) outPath.parent.createDirectories()
    inputStream.use {
        Files.copy(it, outPath)
    }
    return outPath.toString()
}

fun getGreyPictureOfKitten(width: Int, height: Int): String {
    val imageUrl = URI("$HTTP_PLACEKITTEN_COM/g/$width/$height").toURL()
    val outPath = Paths.get("${path}/grey_${width}_$height.png")
    return downloadPicture(imageUrl, outPath)
}

fun getPictureOfKitten(width: Int, height: Int): String {
    val imageUrl = URI("$HTTP_PLACEKITTEN_COM/$width/$height").toURL()
    val outPath = Paths.get("${path}/${width}_$height.png")
    return downloadPicture(imageUrl, outPath)
}

fun main() {
    println(getGreyPictureOfKitten(200, 300))
    println(getPictureOfKitten(200, 300))
}
