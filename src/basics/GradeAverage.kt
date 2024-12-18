package basics

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    val grades: Array<Double> = Array(4) { 0.0 } // arrayOf(0.0, 0.0, 0.0, 0.0)
    var result: Double = 0.0


    print("First grade: ")
    grades[0] = scanner.nextDouble()

    print("Second grade: ")
    grades[1] = scanner.nextDouble()

    print("Third grade: ")
    grades[2] = scanner.nextDouble()

    print("Fourth grade: ")
    grades[3] = scanner.nextDouble()

    for(grade  in grades) result += grade
    result /= 4

    print("Average result: $result")

}