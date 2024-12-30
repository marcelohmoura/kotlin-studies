package oop.abstraction.payment_system

class CardPayment : Payment() {
    override fun makePayment(value: Double, receiver: String) : Map<String, Any> {
        return mapOf("Operation" to "Payment",
            "Value" to value,
            "Receiver" to receiver,
            "Source" to "Card")
    }

    override fun reversePayment(value: Double, reason: String) : Map<String, Any> {
        return mapOf("Operation" to "Reverse Payment",
            "Value" to value,
            "Reason" to reason)
    }

}
