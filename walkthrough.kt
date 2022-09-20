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

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Lorem lipsum dolor sit amet"
    println(str[0..14])
    
    // ******* End of Operator Functions ******

    // *********** Varargs ********************

    fun printAll(vararg messages: String) {
    	for (m in messages) println(m)
    }

    printAll("Hello", "Hallo", "Salut", "Hola")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
    	for (m in messages) println(prefix + m)
    }

    printAllWithPrefix(
	"Hello", "Hallo", "Salut", "Hola",
	prefix = "Greeting: "
    )

    // ********* End of Varargs ***************
}

