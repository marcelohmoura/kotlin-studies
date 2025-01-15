package oop.encapsulation.library

class Book(private val title: String, private val author: String) {
    enum class BookLendingStatus { NOT_LENDED, LENDED }
    private var lendingStatus = BookLendingStatus.NOT_LENDED

    fun lendBook(): String {
        var message = "Happy reading!"
        
        if(lendingStatus == BookLendingStatus.NOT_LENDED) {
            lendingStatus = BookLendingStatus.LENDED
        } else {
            message = "Sorry... the book is already lent."
        }

        return message
        
    }
    
    fun returnBook(): String {
        var message = "Thank you for returning"

        if(lendingStatus == BookLendingStatus.LENDED) {
            lendingStatus = BookLendingStatus.NOT_LENDED
        } else {
            message = "There is no book to be returned..."
        }

        return message

    }

}
