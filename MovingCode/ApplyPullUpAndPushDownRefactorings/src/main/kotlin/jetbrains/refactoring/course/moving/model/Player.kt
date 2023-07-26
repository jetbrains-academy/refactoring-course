package jetbrains.refactoring.course.moving.model

import jetbrains.refactoring.course.moving.utils.Vector2

class Player(position: Vector2) : Character(position) {

    override var experience = 0

    override fun attack(character: Character) {
        character.beAttacked(this)
        if (character.isDead) {
            experience += character.experience
        }
    }
}
