package jetbrains.refactoring.course.moving.controller

import jetbrains.refactoring.course.moving.model.Character

abstract class Controller(private val speed: Int, private val character: Character) {

    abstract fun move()

}
