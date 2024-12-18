package basics

import java.util.*
import kotlin.math.pow

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("height: ")
    val height: Double = scanner.nextDouble()

    print("weight: ")
    val weight: Double = scanner.nextDouble()

    val bmiNumber: Double = weight / (height * height)
    val bmiResult: String = when {
        bmiNumber < 18.5 -> "Underweight"
        ((18.5 <= bmiNumber) and (bmiNumber < 24.9)) -> "Ideal Weight"
        ((25 <= bmiNumber) and (bmiNumber < 29.9)) -> "Overweight"
        ((30 <= bmiNumber) and (bmiNumber < 34.9)) -> "Obesity Grade 1"
        ((35 <= bmiNumber) and (bmiNumber < 39.9)) -> "Obesity Grade 2"
        else -> "Obesity Grade 3"
    }

    print(String.format("BMI Result: %.2f", bmiNumber))
    print("Status: $bmiResult")

}
