package jetbrains.refactoring.course.moving.driver

import jetbrains.refactoring.course.moving.car.Car

class Driver(private var car: Car) {

    fun changeCar(car: Car) {
        this.car = car
    }

    private fun driving(destination: String) {
        println("The driver is coming to $destination")
    }

    fun driveTo(destination: String) {
        println("Start driving")
        car.start()
        driving(destination)
        car.stop()
        println("Arrived at destination")
    }
}
