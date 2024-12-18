package basics

import java.util.Scanner

fun main () {
    val scanner = Scanner(System.`in`)
    val banknotes = mutableSetOf<Int>(100, 50, 20, 10, 5, 2)
    var hundredCount: Int = 0
    var fifthCount: Int = 0
    var twentyCount: Int = 0
    var tenCount: Int = 0
    var fiveCount: Int = 0
    var twoCount: Int = 0

    print("Type a value: ")
    var value: Int = scanner.nextInt()

    while (value > 0) {
        banknotes.removeAll { it > value }

        val banknote: Int = banknotes.first()

        when(banknote) {
            100 -> hundredCount++
            50 -> fifthCount++
            20 -> twentyCount++
            10 -> tenCount++
            5 -> fiveCount++
            2 -> twoCount++
            else -> print("Error")
        }

        value -= banknote
    }

    println("Banknotes of 100: $hundredCount")
    println("Banknotes of 50: $fifthCount")
    println("Banknotes of 20: $twentyCount")
    println("Banknotes of 10: $tenCount")
    println("Banknotes of 5: $fiveCount")
    println("Banknotes of 2: $twoCount")

}
