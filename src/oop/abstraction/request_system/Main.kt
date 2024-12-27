package oop.abstraction.request_system

fun makeOnlineRequest() {
    val computerRequest = Request(productName = "Computer", productPrice = 855.00)
    val phoneRequest = Request(productName = "Mobile Phone", productPrice = 623.00)
    val requests = listOf<Request>(computerRequest, phoneRequest)

    val onlineRequest = OnlineRequest()

    println("### ONLINE REQUEST ###")
    println("Request Details: ${onlineRequest.showDetails(requests)}")
    println("Total Price: ${onlineRequest.totalCalculate(requests)}")
}

fun makeStoreRequest() {
    val dressRequest = Request(productName = "Blue Dress", productPrice = 37.35, "363638")
    val pantRequest= Request(productName = "Grey pant", productPrice = 89.99, "363638")
    val requests = listOf<Request>(dressRequest, pantRequest)

    val storeRequest = StoreRequest()

    println("### STORE REQUEST ###")
    println("Request Details: ${storeRequest.showDetails(requests)}")
    println("Total Price: ${storeRequest.totalCalculate(requests)}")
}

fun main() {
    makeOnlineRequest()
    makeStoreRequest()
}
