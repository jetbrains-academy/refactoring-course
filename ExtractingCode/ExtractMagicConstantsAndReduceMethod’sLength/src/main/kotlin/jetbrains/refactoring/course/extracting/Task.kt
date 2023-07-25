package jetbrains.refactoring.course.extracting

import java.net.URI
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.UUID
import kotlin.io.path.createDirectories
import kotlin.io.path.exists

private const val HTTPS_CATAAS_COM_CAT_ = "https://cataas.com/cat"
private const val path = "ExtractingCode/ExtractMagicConstantsAndReduceMethod’sLength/src/main/resources/cats/"

fun downloadPicture(imageUrl: URL, outPath: Path): String {
    val inputStream = imageUrl.openStream()
    if (!outPath.exists()) outPath.parent.createDirectories()
    inputStream.use {
        Files.copy(it, outPath)
    }
    return outPath.toString()
}

fun getCatWithTag(tag: String): String {
    val imageUrl = URI("$HTTPS_CATAAS_COM_CAT_/$tag").toURL()
    val outPath = Paths.get("$path${tag}_${UUID.randomUUID()}.png")
    return downloadPicture(imageUrl, outPath)
}

fun getRandomCat(): String {
    val imageUrl = URI(HTTPS_CATAAS_COM_CAT_).toURL()
    val outPath = Paths.get("$path${UUID.randomUUID()}.png")
    return downloadPicture(imageUrl, outPath)
}

fun main() {
    println(getRandomCat())
    println(getCatWithTag("funny"))
}
