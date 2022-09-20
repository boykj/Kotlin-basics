// Member functions and extensions with a single parameter can be "infix functions"

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Yamaha" onto "Kawasaki"
    println(myPair)
}