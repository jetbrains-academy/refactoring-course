package jetbrains.refactoring.course.moving

import jetbrains.refactoring.course.moving.car.Car
import jetbrains.refactoring.course.moving.driver.Driver

fun main() {
    val car = Car(5)
    val driver = Driver(car)
    driver.driveTo("Belgrade")
}
