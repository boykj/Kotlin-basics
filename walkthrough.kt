package org.kotlinlang.play

fun printMessage(message: String): Unit {
    println(message)    
}

fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun main() {
    printMessage("Hello, world")
    printMessageWithPrefix("Hello", "Log")
}