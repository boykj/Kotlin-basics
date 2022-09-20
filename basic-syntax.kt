package my.demo

import kotlin.text.*

fun main() {

    // Print to stdout with a linebreak
    println("hello")

    // Print to stdout
    print("world")

    println()

    // Basic function with two integer parameters, with a integer return
    fun sum(a: Int, b: Int): Int {
    	return a + b
    }

    val result = sum(1, 2)
    println(result)

}