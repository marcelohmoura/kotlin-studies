package oop.abstraction.vehicle

fun main() {
    val car = Car()
    val motorcycle = Motorcycle()

    car.accelerate()
    car.stop()

    motorcycle.accelerate()
    motorcycle.stop()
}