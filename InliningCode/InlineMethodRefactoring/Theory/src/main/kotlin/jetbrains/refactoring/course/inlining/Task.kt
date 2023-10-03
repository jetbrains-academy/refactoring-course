package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.PrintWriter

class Store {
    fun calculateTotalPrice(productPrice: List<Int>): Int? {
        return try {
            val totalPrice = productPrice.sum()
            totalPrice
        } catch (error: Exception) {
            logError(error, "Exception.txt")
            null
        }
    }

    private fun logError(error: Exception, filePath: String) {
        val file = File(filePath)
        val text = error
        PrintWriter(file, Charsets.UTF_8).use { it.print(text) }
    }
}

fun main() {
    val client = Store()
    println(client.calculateTotalPrice(listOf(1, 2, 3))) // Output: Sum of prices
}
