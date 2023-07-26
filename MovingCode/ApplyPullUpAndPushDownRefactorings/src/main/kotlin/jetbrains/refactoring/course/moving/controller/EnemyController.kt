package jetbrains.refactoring.course.moving.controller

import jetbrains.refactoring.course.moving.model.Enemy
import jetbrains.refactoring.course.moving.utils.Vector2
import kotlin.random.Random

class EnemyController(private val speed: Int, private val enemy: Enemy) : Controller(speed, enemy) {

    override fun move() {
        val random = Random(0)
        val dx = ((random.nextInt() % 2) * 2 - 1) * speed
        val dy = ((random.nextInt() % 2) * 2 - 1) * speed
        enemy.position += Vector2(dx, dy)
    }

}
