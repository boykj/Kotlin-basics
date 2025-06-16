/* Intheritance between classes is declared by a colon (:). 
/* Block comments can be nested 
Classes are final by default; to make a class inheritable, 
mark is as open
*/

open class Shape

class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}

fun main() {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}