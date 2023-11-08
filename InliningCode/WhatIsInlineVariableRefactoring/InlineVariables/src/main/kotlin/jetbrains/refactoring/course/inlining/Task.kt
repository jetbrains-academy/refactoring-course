package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.FileNotFoundException

class FileReader {
    fun readFileContent(path: String): String {
        if (!File(path).exists()) {
            throw FileNotFoundException("File not found at path: $path")
        }
        return File(path).readText()
    }
}
