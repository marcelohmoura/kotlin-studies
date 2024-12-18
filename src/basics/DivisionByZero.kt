package basics

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)

    print("Type a integer number: ")
    val n: Int = scanner.nextInt()

    print("Type a divisor integer number: ")
    val d: Int = scanner.nextInt()

    try {
        print("Result: ${n / d}")
    } catch (e: Exception) {
        print("Cannot divide by zero")
    }
}
