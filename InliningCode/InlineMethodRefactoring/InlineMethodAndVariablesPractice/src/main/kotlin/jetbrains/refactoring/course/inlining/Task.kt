package jetbrains.refactoring.course.inlining

import java.io.File
import java.io.PrintWriter

class Store {
    fun calculateTotalPrice(productPrice: List<Int>): Int? {
        return try {
            productPrice.sum()
        } catch (error: Exception) {
            PrintWriter(File("Exception.txt"), Charsets.UTF_8).use { it.print(error) }
            null
        }
    }
}

fun main() {
    val store = Store()
    println(store.calculateTotalPrice(listOf(1, 2, 3))) // Output: Sum of prices
}
