abstract class PlayerController(private val speed: Int) {
    val playerPosition = Vector2(0, 0)
    fun move() {
        val direction = getDirection()
        playerPosition.x += speed * direction.x
        playerPosition.y += speed * direction.y
    }

    abstract fun getDirection(): Vector2
}
