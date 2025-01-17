package oop.encapsulation.employee

class Employee(
    private var name: String,
    private var position: String,
    private var salary: Double) {

    fun updatePosition(newPosition: String) {
        position = newPosition
    }

    fun updateSalary(newSalary: Double) {
        salary = newSalary
    }

    fun getSalary() = salary

    fun getPosition() = position
}
