package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Type a Double number: ")
    val number: Double = scanner.nextDouble()

    print("Result: ${number.toInt()}")
}