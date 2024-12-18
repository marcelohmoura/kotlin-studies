package basics

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)

    print("Type a positive integer number: ")
    val n: Int = scanner.nextInt()

    var result: Int = n * (n - 1)

    for (i in (n - 2) downTo 1 step 1) {
        result *= i
    }

    print("Result: $result")
}