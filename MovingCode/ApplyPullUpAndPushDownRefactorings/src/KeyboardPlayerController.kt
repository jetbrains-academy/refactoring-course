class KeyboardPlayerController(private val speed: Int, screenSize: Vector2, private val context: Context) :
    PlayerController(speed, screenSize) {

    override fun move() {
        val direction = Vector2(0, 0)
        if (context.pressedKeys.contains("w")) direction.y--
        if (context.pressedKeys.contains("a")) direction.x--
        if (context.pressedKeys.contains("s")) direction.y++
        if (context.pressedKeys.contains("d")) direction.x++

        playerPosition.x += speed * direction.x
        playerPosition.y += speed * direction.y
    }
}
