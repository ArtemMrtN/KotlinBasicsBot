package org.example.lesson_17

class Folder(
    name: String,
    numberOfFiles: Int,
    secret: Boolean,
) {
    var name: String = name
        get() = if (secret) "Скрытая папка" else field

    val numberOfFiles: Int = numberOfFiles
        get() = if (secret) 0 else field

    val secret: Boolean = secret
}

fun main() {

    val folder1 = Folder("Папка1", 12, true)
    val folder2 = Folder("Папка2", 10, false)

    println(folder1.name)
    println(folder1.numberOfFiles)
    println(folder2.name)
    println(folder2.numberOfFiles)

}