package jetbrains.refactoring.course.moving.app.car

class Car(private val gearsNumber: Int) {
    var engineStarted: Boolean = false
    var gear: Int = 0
        set(value) {
            if (value > gearsNumber || value < 0)
                throw IllegalStateException()
            field = value
        }
}
