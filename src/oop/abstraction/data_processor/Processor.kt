package oop.abstraction.data_processor

abstract class Processor<T> {
    abstract fun toProcess(data: T, method: (T) -> T): T
}