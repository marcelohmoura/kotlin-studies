package oop.abstraction.payment_system

abstract class Payment {
    abstract fun makePayment(value : Double, receiver: String) : Map<String, Any>
    abstract fun reversePayment(value: Double, reason: String) : Map<String, Any>
}