package oop.abstraction.request_system

class OnlineRequest : Requests() {
    override fun totalCalculate(items : List<Request>) = items.sumOf { it.productPrice }
    override fun showDetails(items : List<Request>) = items.map { item -> mapOf(item.productName to item.productPrice) }
}
