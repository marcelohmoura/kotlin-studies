package oop.abstraction.file_manager

fun main() {
    val textFile = TextFile()
    val imageFile = ImageFile()

    println("### READING TEXT FILE ### \n")
    textFile.read("file-to-read")

    println("### WRITING TEXT FILE ###")
    textFile.write("my-file", "oiiiii")

    println("### DELETING FILE ###")
    textFile.delete("my-file")

    println("### READING IMAGE FILE ###")
    imageFile.read("image-test.jpg")

}
