package oop.abstraction.data_processor

fun textToUpperCase (text: String) = text.uppercase()
fun duplicateNumber(number: Number) = number.toDouble() * 2

fun main() {
    val textProcessor = TextProcessor()
    val numericProcessor = NumericProcessor()

    val textProcessed: String = textProcessor.toProcess(data = "Data to Process", method = ::textToUpperCase)
    val numberProcessed: Number = numericProcessor.toProcess(data = 4, method = ::duplicateNumber)

    println("Text processed result: $textProcessed")
    println("Number processed result: $numberProcessed")
}