package org.example

import java.io.File

fun deleteDirectoryContents(directory: File): Boolean {
    if (directory.isDirectory) {
        val files = directory.listFiles()
        if (files != null) {
            for (file in files) {
                if (file.isDirectory) {
                    deleteDirectoryContents(file)
                }
                file.delete()
            }
        }
    }
    return true
}

fun listAndDeleteGradleDirectories(directory: File): List<File> {
    val gradleDirectories = mutableListOf<File>()
    if (directory.isDirectory) {
        val files = directory.listFiles()
        if (files != null) {
            for (file in files) {
                if (file.isDirectory) {
                    if (file.name == ".gradle") {
                        gradleDirectories.add(file)
                        deleteDirectoryContents(file)
                        println("Contents of .gradle directory deleted: ${file.absolutePath}")
                    }
                    gradleDirectories.addAll(listAndDeleteGradleDirectories(file))
                }
            }
        }
    }
    return gradleDirectories
}

fun main() {
    val startDirectoryPath = "C:\\\\ruta\\\\a\\\\tu\\\\directorio" // Reemplaza esto con la ruta inicial de tu directorio en Windows
    val startDirectory = File(startDirectoryPath)

    if (startDirectory.exists()) {
        val gradleDirectories = listAndDeleteGradleDirectories(startDirectory)
        if (gradleDirectories.isNotEmpty()) {
            println(".gradle directories found and contents deleted:")
            for (dir in gradleDirectories) {
                println(dir.absolutePath)
            }
        } else {
            println("No .gradle directories found.")
        }
    } else {
        println("The specified start directory does not exist.")
    }
}