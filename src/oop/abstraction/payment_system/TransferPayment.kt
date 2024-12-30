package oop.abstraction.payment_system

class TransferPayment : Payment() {
    override fun makePayment(value: Double, receiver: String): Map<String, Any> {
        return mapOf("Operation" to "Transfer Payment",
            "Value" to value,
            "Receiver" to receiver,
            "Source" to "Online Transfer")
    }

    override fun reversePayment(value: Double, reason: String): Map<String, Any> {
        return mapOf("Operation" to "Reverse Payment",
            "Value" to value,
            "Reason" to reason)
    }
}