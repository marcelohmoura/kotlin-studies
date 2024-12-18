package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Username: ")
    val username: String = scanner.nextLine()

    print("Age: ")
    val age: Int = scanner.nextInt()

    print("Salary: ")
    val salary: Double = scanner.nextDouble()

    println("User: $username")
    println("age: $age")
    println(String.format("Salary: %.2f", salary))

}
