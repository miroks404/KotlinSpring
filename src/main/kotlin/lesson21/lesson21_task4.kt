package org.example.lesson21

import java.io.File

private fun File.writeToFile(text: String) {
    this.writeText(text.lowercase())
}
