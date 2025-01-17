package oop.encapsulation.employee

fun main() {
    val employee =
        Employee(name = "Marcelo Moura", position = "Software Engineer", salary = 1900.00)

    employee.updateSalary(newSalary = 3500.00)
    employee.updatePosition(newPosition = "Senior Software Engineer")

    println(employee.getSalary())
    println(employee.getPosition())
}
