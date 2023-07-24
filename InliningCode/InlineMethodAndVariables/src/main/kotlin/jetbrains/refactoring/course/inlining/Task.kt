package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.PrintWriter

class Store {
    public fun calculateAveragePrice(productPrice: List<Int>): Int? {
        return try {
            val totalPrice = productPrice.sum()
            val numberOfProducts = productPrice.count()
            totalPrice / numberOfProducts
        } catch (error: Exception) {
            logError(error, "Exception.txt")
            null
        }
    }

    private fun logError(error: Exception, filePath: String) {
        val file = File(filePath)
        val text = error.toString()
        PrintWriter(file, Charsets.UTF_8).use { it.print(text) }
    }
}
