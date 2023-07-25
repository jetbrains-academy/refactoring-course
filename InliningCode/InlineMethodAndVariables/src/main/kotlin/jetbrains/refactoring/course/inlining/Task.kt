package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.PrintWriter

class Store {
    public fun calculateAveragePrice(productPrice: List<Int>): Int? {
        return try {
            productPrice.sum() / productPrice.count()
        } catch (error: Exception) {
            PrintWriter(File("Exception.txt"), Charsets.UTF_8).use { it.print(error.toString()) }
            null
        }
    }
}
