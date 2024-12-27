package oop.abstraction.file_manager

import java.io.File as IOFile
import javax.imageio.ImageIO

class ImageFile : File() {
    override fun read(fileName: String) {
        val filePath = "src/$fileName"
        val file = IOFile(filePath)
        val image = ImageIO.read(file)

        println("Image data: ${image.data}")
    }

    override fun delete(fileName: String) {
        val filePath = "src/$fileName"

        IOFile(filePath).delete()
    }
}