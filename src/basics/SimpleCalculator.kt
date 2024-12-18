package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Type a number: ")
    val x: Double = scanner.nextDouble()

    print("Type operator (+, -, *, /): ")
    val operator: String = scanner.next()

    print("Type a number: ")
    val y: Double = scanner.nextDouble()

    when(operator) {
        "+" -> print("Result: ${x + y}")
        "-" -> print("Result: ${x - y}")
        "*" -> print("Result: ${x * y}")
        "/" -> if(y.equals(0.0)) print("Error: Divisor cannot be zero") else print("Result: ${x / y}")

    }

}
