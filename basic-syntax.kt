package my.demo

import kotlin.text.*

fun main() {

    // Print to stdout with a linebreak
    println("hello")

    // Print to stdout
    print("world")

    println()

    // ****************** Functions ***********************
    // Basic function with two integer parameters, with a integer return
    fun sum(a: Int, b: Int): Int {
    	return a + b
    }

    // Function call and print
    val result = sum(1, 2)
    println(result)

    // Function body can be an expression - Return type inferred
    fun newSum(a: Int, b: Int) = a + b

    val newResult = newSum(5, 4)
    println(newResult)

    // Function that returns no meaningful value - return type can be ommited

    //fun printSum(a: Int, b: Int): Unit {
    
    fun printSum(a: Int, b: Int) {
    	println("sum of $a and $b is ${a + b}")	
    }

    val newResult_2 = printSum(10, 11)

    // ************** End of Functions *********************

    // Class definition
    class Rectangle(var height: Double, var length: Double) {
    	  var perimeter = (height + length) * 2
    }

    // Class call and print
    val rectangle = Rectangle(5.0, 2.0)
    println("Perimeter is ${rectangle.perimeter}")

    // Inheritance can be denoted by a colon (:)
    // Classes are final by default, to ensure interitance, mark the class as open

    open class Shape

    class OpenRectangle(var height: Double, var length: Double): Shape() {
    	  var perimeter = (height + length) * 2
    }

    // Open rectangle instantiation and call
    val openRectangle = OpenRectangle(10.0, 12.0)
    println("Perimeter of inheritted rectangle is ${openRectangle.perimeter}")

}