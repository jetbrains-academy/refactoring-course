package jetbrains.refactoring.course.moving.controllers

import jetbrains.refactoring.course.moving.utils.Vector2
import java.awt.MouseInfo

class MousePlayerController(private val speed: Int, private val screenSize: Vector2) :
    PlayerController(speed) {

    override fun getDirection(): Vector2 {
        val centerW = screenSize.x / 2
        val centerH = screenSize.y / 2
        val location = MouseInfo.getPointerInfo().location
        val directionX = when {
            location.x > centerW -> 1
            location.x < centerW -> -1
            else -> 0
        }
        val directionY = when {
            location.y > centerH -> 1
            location.y < centerH -> -1
            else -> 0
        }
        return Vector2(directionX, directionY)
    }
}
