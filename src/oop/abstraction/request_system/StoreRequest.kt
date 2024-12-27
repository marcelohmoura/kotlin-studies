package oop.abstraction.request_system

class StoreRequest: Requests() {
    private val serviceTax = 0.10

    override fun totalCalculate(items : List<Request>) = (items.sumOf { it.productPrice }) * serviceTax

    override fun showDetails(items: List<Request>): List<Map<String, Any>> {
        return items.map { item ->
            mapOf(item.productName to item.productPrice,
                  "Seller" to item.sellerId) }
    }
}