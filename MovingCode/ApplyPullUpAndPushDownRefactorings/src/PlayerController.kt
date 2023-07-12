abstract class PlayerController(private val speed: Int, private val screenSize: Vector2) {
    val playerPosition = Vector2(0, 0)
    abstract fun move()
}
