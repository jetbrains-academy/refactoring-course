package jetbrains.refactoring.course.moving.controllers

import jetbrains.refactoring.course.moving.utils.Context
import jetbrains.refactoring.course.moving.utils.Vector2

class KeyboardPlayerController(private val speed: Int, private val context: Context) :
    PlayerController(speed) {

    override fun getDirection(): Vector2 {
        val direction = Vector2(0, 0)
        if (context.pressedKeys.contains("w")) direction.y--
        if (context.pressedKeys.contains("a")) direction.x--
        if (context.pressedKeys.contains("s")) direction.y++
        if (context.pressedKeys.contains("d")) direction.x++
        return direction
    }
}
