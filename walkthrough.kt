package org.kotlinlang.play

// Accepts a string parameter, no return value (Unit)
fun printMessage(message: String): Unit {
    println(message)    
}

// Can accept a prefix input but will default to "info" if not supplied
fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// Return type is inferred
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello, world")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

    // ********* Operator Functions ***********

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    // ******* End of Operator Functions ******
}

