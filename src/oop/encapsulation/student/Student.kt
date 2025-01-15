package oop.encapsulation.student

class Student(private val name: String, private val age: Int, private val grades: List<Double>) {
    fun calculateAverageGrade() = grades.sum() / grades.size

    fun isStudentApproved() = calculateAverageGrade() >= 6.0

}
