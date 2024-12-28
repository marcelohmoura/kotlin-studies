package oop.abstraction.data_processor

class TextProcessor : Processor<String>() {
    override fun toProcess(data: String, method: (String) -> String) = method(data)
}
