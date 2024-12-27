package oop.abstraction.request_system

class OnlineRequest : Requests() {
    override fun totalCalculate(items : List<Request>) : Double {
        return items.sumOf { it.value }
    }

    override fun showDetails(items : List<Request>) : List<Map<String, Any>> {
        return items.map { item -> mapOf(item.productName to item.value) }
    }
}
