package oop.encapsulation.library

fun main() {
    val book = Book(title = "Harry Potter", author = "J.K. Rowling ")

    println(book.lendBook())
    println(book.lendBook())
    println(book.returnBook())
    println(book.returnBook())

}
