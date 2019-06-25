package com.fileio

import com.google.common.io.Resources
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.nio.file.Paths

fun main(args: Array<String>) {
    val fileContent = object {}.javaClass.getResource("/mydir/myFile.txt").readText()
    println(fileContent)
    println()

    val content = File(Paths.get("src", "main", "resources", "mydir", "myFile.txt")
            .toAbsolutePath().toString()).readText()
    println(content)
    println()

    // guava
    val content2 = Resources.getResource("mydir/myFile.txt").readText()
    println(content2)
    println()

    // java
    // val fileLines: List<String> = InputStreamReader(FileInputStream(File("testFile.txt")), Charsets.UTF_8).readLines()

    // java File - kotlin does not have it's own IO classes
    val inputStreamReader: InputStreamReader = File("testFile.txt")
            .reader(Charsets.UTF_8) // Charsets.UTF_8 by default

    // readLines closes the stream
    val lines = inputStreamReader.readLines()

    lines.forEach {
        println(it)
    }

    val reduce: String = lines.reduce { r, s -> "$r $s"}
    println("Reduced: $reduce")
    println()

    val inputStreamReader2: InputStreamReader = File("testFile.txt")
            .reader(Charsets.UTF_8)

    // must close the stream, readText does not close the inputStreamReader resource
    val content3: String = inputStreamReader2.readText()
    println(inputStreamReader2.readText())
    println(content3)
    inputStreamReader2.close()
    println()

    // `use` function closes the InputStreamReader
    // like tryWithResources
    val inputStreamReader3: InputStreamReader = File("testFile.txt")
            .reader(Charsets.UTF_8)
    val content4: String = inputStreamReader3.use {
        it.readText()
    }
    println("inputStreamReader3.use")
    println(content4)
    println()

    // with BufferedReader
    val bufferedReader: BufferedReader = File("testFile.txt")
            .bufferedReader(Charsets.UTF_8)

    val content5: String = bufferedReader.use {
        it.readText()
    }
    println("bufferedReader.use")
    println(content5)
    println()

    // readText is an extension function of File class
    // closes file resource for us
    val readLines = File("testFile.txt").readLines()
    println("readlines")
    println(readLines)
    println()

    // just read some lines of a file
    val inputStreamReader4: InputStreamReader = File("testFile.txt").reader()
    inputStreamReader4.forEachLine {
        println(it)
    }
    println()

    // useLines closes the resource
    File("testFile.txt").reader().useLines {
        // it is each item in the sequence
        it.forEach { line ->
            println(line)
        }
    }
}
