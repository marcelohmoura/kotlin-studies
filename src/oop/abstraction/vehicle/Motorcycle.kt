package oop.abstraction.vehicle

class Motorcycle : Vehicle() {
    override fun accelerate() = print("Accelerating the motorcycle...")
    override fun stop() = print("Stopping the motorcycle...")
}