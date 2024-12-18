package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    val divisors = mutableSetOf<Int>()

    print("Type a integer number: ")
    val number: Int = scanner.nextInt()

    for (divisor in 1..number) {
        if(number.mod(divisor) == 0) divisors.add(divisor)
    }

    if (divisors.size > 2) print("$number is not prime") else print("$number is prime")

}