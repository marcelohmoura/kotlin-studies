package oop.polymorphism.payment

class Payment {
    fun processPayment(cardNumber: String, expiryDate: String, securityCode: String): String {
        return "Payment with card processed!"
    }

    fun processPayment(bankSlipNumber: String, dueDate: String) : String {
        return "Bank Slip paid successfully!"
    }

    fun processPayment(pixKey: String, transactionValue: Double) : String {
        return "Pix sent successfully!"
    }
}
