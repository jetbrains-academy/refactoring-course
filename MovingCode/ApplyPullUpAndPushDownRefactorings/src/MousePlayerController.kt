import java.awt.MouseInfo

class MousePlayerController(private val speed: Int, private val screenSize: Vector2) :
    PlayerController(speed, screenSize) {

    override fun move() {
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
        playerPosition.x += speed * directionX
        playerPosition.y += speed * directionY
    }
}
