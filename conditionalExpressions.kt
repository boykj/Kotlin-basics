fun main() {

    fun maxOf(a: Int, b: Int): Int {

        if (a > b) {
            println(a)
            return a
        } else {
            println(b)
            return b
        }

    }

    // 'if' can also be used as an expression
    fun maxOfExpression(a: Int, b: Int) = if (a > b) a else b

    maxOf(3, 5)
    var result = maxOfExpression(7, 10).also { println("Max value is: $it") }
    println("Final result is: $result")

}