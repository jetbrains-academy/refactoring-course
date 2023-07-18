package jetbrains.refactoring.course.moving.controllers

import jetbrains.refactoring.course.moving.utils.Vector2

abstract class PlayerController(private val speed: Int) {
    val playerPosition = Vector2(0, 0)

    abstract fun getDirection(): Vector2

    fun move() {
        val direction = getDirection()
        playerPosition.x += speed * direction.x
        playerPosition.y += speed * direction.y
    }
}
