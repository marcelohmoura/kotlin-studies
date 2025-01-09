package oop.encapsulation.stock

class Product (private var name: String) {
     private var price: Double = 0.0
        set(value) {
            require(value >= 0.0) {"Invalid value for field price"}
            field = value
        }

    private var amount: Int = 0
        set(value) {
            require(value >= 0) {"Invalid value for field amount"}
            field = value
        }

    fun updatePrice(productPrice: Double)  {
        price = productPrice
    }

    fun updateAmount(productAmount: Int) {
        amount = productAmount
    }
}
