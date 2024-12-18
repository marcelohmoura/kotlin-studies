package basics

import java.io.File
import java.io.FileNotFoundException

fun main() {
    val filePath = "src/basics/file-to-read.txt"
    try {
        File(filePath).forEachLine { line -> println(line) }
    } catch (e: FileNotFoundException) {
        print ("File not found")
    }
}
