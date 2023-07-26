package jetbrains.refactoring.course.moving.controller

import jetbrains.refactoring.course.moving.model.Player
import jetbrains.refactoring.course.moving.utils.Vector2

abstract class PlayerController(private val speed: Int, private val player: Player) : Controller(speed, player) {

    abstract fun getDirection(): Vector2

    override fun move() {
        val direction = getDirection()
        player.position += Vector2(direction.x * speed, direction.y * speed)
    }
}
