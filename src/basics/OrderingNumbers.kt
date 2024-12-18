package basics

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Int>()

    for (i in 1..3) {
        print("Type a number: ")
        numbers.add(scanner.nextInt())
    }

    numbers.sortBy { it }

    print(numbers)
}