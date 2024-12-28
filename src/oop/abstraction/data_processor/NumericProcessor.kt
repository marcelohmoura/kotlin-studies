package oop.abstraction.data_processor

class NumericProcessor : Processor<Number>() {
    override fun toProcess(data: Number, method: (Number) -> Number) = method(data)
}