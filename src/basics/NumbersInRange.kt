package basics

import java.util.*

fun main () {
    val scanner = Scanner(System.`in`)
    var sum: Int = 0

    print("Type the start number: ")
    val startNumber: Int = scanner.nextInt()

    print("Type the end number: ")
    val endNumber: Int = scanner.nextInt()

    for (number in startNumber..endNumber) {
        println("$number")
        sum += number
    }

    print("Sum result: $sum")
}