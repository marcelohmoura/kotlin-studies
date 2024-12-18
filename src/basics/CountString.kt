package basics

import java.util.Scanner
import java.util.regex.Pattern

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Type a phrase: ")
    val phrase: String = scanner.nextLine()

    val numberOfCharacters: Int = phrase.count()
    val numberOfWords: Int = phrase.split("\\s+".toRegex()).count()

    println("Number os characters: $numberOfCharacters")
    println("Number os words: $numberOfWords")

}