package jetbrains.refactoring.course.moving.car

class Car(private val gearsNumber: Int) {
    private var engineStarted: Boolean = false
    private var gear: Int = 0
        set(value) {
            if (value > gearsNumber || value < 0)
                throw IllegalStateException()
            field = value
        }

    fun start() {
        engineStarted = true
        gear = 1
    }

    fun stop() {
        gear = 0
        engineStarted = false
    }
}
