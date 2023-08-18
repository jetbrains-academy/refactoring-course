package jetbrains.refactoring.course.moving.app

import jetbrains.refactoring.course.moving.app.car.Car
import jetbrains.refactoring.course.moving.app.driver.Driver

fun main() {
    val car = Car(5)
    val driver = Driver(car)
    driver.driveTo("Belgrade")
}
