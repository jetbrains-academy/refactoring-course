package jetbrains.refactoring.course.moving.utils

data class Vector2(var x: Int, var y: Int) {

    operator fun plus(other: Vector2) = Vector2(x + other.x, y + other.y)
}
