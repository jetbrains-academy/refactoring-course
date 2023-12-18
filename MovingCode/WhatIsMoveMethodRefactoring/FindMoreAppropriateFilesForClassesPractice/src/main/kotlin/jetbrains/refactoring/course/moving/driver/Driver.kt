package jetbrains.refactoring.course.moving.driver

import jetbrains.refactoring.course.moving.car.Car

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
