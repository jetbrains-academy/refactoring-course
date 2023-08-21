package jetbrains.refactoring.course.moving

class Car(private val gearsNumber: Int) {
    var engineStarted: Boolean = false
    var gear: Int = 0
        set(value) {
            if (value > gearsNumber || value < 0)
                throw IllegalStateException()
            field = value
        }
}

class Driver(private var car: Car) {

    private fun start() {
        car.engineStarted = true
        car.gear = 1
    }

    private fun stop() {
        car.gear = 0
        car.engineStarted = false
    }

    fun changeCar(car: Car) {
        this.car = car
    }

    private fun driving(destination: String) {
        println("The driver is coming to $destination")
    }

    fun driveTo(destination: String) {
        println("Start driving")
        start()
        driving(destination)
        stop()
        println("Arrived at destination")
    }
}

fun main() {
    val car = Car(5)
    val driver = Driver(car)
    driver.driveTo("Belgrade")
}
