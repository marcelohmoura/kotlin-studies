package basics

import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Type a number: ")
    val number: Double = scanner.nextDouble()

    if((number % 2).equals(0.0)) print("Even") else ("Odd")
}