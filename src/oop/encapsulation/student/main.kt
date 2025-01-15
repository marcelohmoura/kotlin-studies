package oop.encapsulation.student

fun main() {
    val grades = listOf(4.5, 6.0, 9.6, 7.4)
    val student = Student(name = "Marcelo Moura", age = 25, grades = grades)

    println("Student average grade: ${student.calculateAverageGrade()}")
    println("Student approval status: ${student.isStudentApproved()}")

}
