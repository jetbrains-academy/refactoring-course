package jetbrains.refactoring.course.refactoring.purpose

fun calculate_area(l: Double, w: Double): Double {
    val length = l
    val width = w

    val result = length * width

    return result
}

fun main() {
    calculate_area(5.0, 8.0)
}
