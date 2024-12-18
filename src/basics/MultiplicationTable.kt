package basics

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var n: Int = 1
    val errorMessage: String = "The number must be positive and integer"

    print("Type a positive integer number: ")
    try {
        n = scanner.nextInt()
        if (n > 0) {
            for (i in 1..10) println("$n X $i = ${n * i}")
        } else print(errorMessage)
    } catch (e: Exception) {
        print(errorMessage)
    }

}