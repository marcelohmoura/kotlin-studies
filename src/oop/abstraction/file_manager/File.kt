package oop.abstraction.file_manager

abstract class File {
    abstract fun read(fileName: String)
    abstract fun delete(fileName: String)
}
