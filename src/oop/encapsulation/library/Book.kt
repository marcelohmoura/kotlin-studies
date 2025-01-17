package oop.encapsulation.library

class Book(private val title: String, private val author: String) {
    enum class BookLendingStatus { NOT_LENDED, LENDED }
    private var lendingStatus = BookLendingStatus.NOT_LENDED

    fun lendBook(): String {
        return if(lendingStatus == BookLendingStatus.NOT_LENDED) {
            lendingStatus = BookLendingStatus.LENDED
            "Happy reading!"
        } else {
            "Sorry... the book is already lent."
        }
    }
    
    fun returnBook(): String {
        return if(lendingStatus == BookLendingStatus.LENDED) {
            lendingStatus = BookLendingStatus.NOT_LENDED
            "Thank you for returning"
        } else {
            "There is no book to be returned..."
        }
    }
}
