package jetbrains.refactoring.course.moving.model

import jetbrains.refactoring.course.moving.utils.Vector2

class Enemy(position: Vector2) : Character(position) {

    override var experience: Int = 5

    override fun attack(character: Character) {
        character.beAttacked(this)
    }
}
