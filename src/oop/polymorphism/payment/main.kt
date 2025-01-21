package oop.polymorphism.payment

fun main() {
    val payment = Payment()
    val cardPayment: String = payment.processPayment(
        cardNumber = "459812239543",
        expiryDate = "2027-08-05",
        securityCode = "458"
    )
    val bankSlipPayment: String = payment.processPayment(
        bankSlipNumber = "987623459876321111975543",
        dueDate = "2025-01-26"
    )
    val pixPayment: String = payment.processPayment(
        pixKey = "40047736011",
        transactionValue = 45.00
    )

    print("$cardPayment \n $bankSlipPayment \n $pixPayment")
}
