package oop.abstraction.file_manager
import java.io.FileNotFoundException
import java.io.File as IOFile

class TextFile : File() {
    override fun read(fileName: String) {
        val filePath = "src/$fileName.txt"

        try {
            IOFile(filePath).forEachLine { line -> println(line) }
        } catch (e: FileNotFoundException) {
            print ("File not found")
        }

    }

    override fun delete(fileName: String) {
        val filePath = "src/$fileName.txt"

        IOFile(filePath).delete()
    }

    fun write(fileName: String, content: String) {
        val file= IOFile("src/$fileName.txt")

        file.appendText("\n$content")
    }

}
