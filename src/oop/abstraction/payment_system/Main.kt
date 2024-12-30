package oop.abstraction.payment_system

fun main() {
    val cardPayment = CardPayment()
    val transferPayment = TransferPayment()

    println("Card Payment: ${cardPayment.makePayment(value = 5000.00, receiver = "192.168.0.1")}")
    println("Reverse card payment: ${cardPayment.reversePayment(value = 5000.00, reason = "Denied by receiver")}")

    println("Transfer payment: ${transferPayment.makePayment(value = 123.00, receiver = "172.0.0.0")}")
    println("Reverse transfer payment: ${transferPayment.reversePayment(value = 123.00, reason = "Receiver not found")}")

}
