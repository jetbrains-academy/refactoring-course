package jetbrains.refactoring.course.moving.model

import jetbrains.refactoring.course.moving.utils.Vector2

abstract class Character(var position: Vector2) {

    companion object {
        private const val DEFAULT = 10
        private const val maxHealth = 100
    }

    var health: Int = maxHealth
    abstract val experience: Int
    val damage: Int = DEFAULT
    val armor: Int = DEFAULT

    val isDead: Boolean
        get() = health <= 0

    abstract fun attack(character: Character)

    fun beAttacked(character: Character) {
        health = (health - character.damage * (1 - 0.06 * armor / (1 + 0.06 * armor))).toInt()
    }
}
