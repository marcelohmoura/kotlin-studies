package oop.abstraction.vehicle

class Car : Vehicle() {
    override fun accelerate() = print("Accelerating the car...")
    override fun stop() = print("Breaking the car...")
}