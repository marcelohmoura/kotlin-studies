package oop.abstraction.request_system

fun main() {
    val computerRequest = Request("Computer", 855.00)
    val phoneRequest = Request("Mobile Phone", 623.00)
    val requests = listOf<Request>(computerRequest, phoneRequest)

   val onlineRequest = OnlineRequest()

    println("Request Details: ${onlineRequest.showDetails(requests)}")
    println("Total Price: ${onlineRequest.totalCalculate(requests)}")
}
