package oop.abstraction.request_system

abstract class Requests {
    abstract fun totalCalculate(items: List<Request>) : Double
    abstract  fun showDetails(items: List<Request>) : List<Map<String, Any>>
}
