fun main() {

    // Check if a number is within a range using in operator
    fun inRange() {

        val x = 10
        val y = 9

        if (x in 1..y+1) {
            println("$x fits in range")
        }
        else {
            println("$x does not fit in range")
        }

    }

    // Check if a number is out of range
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    // Iterate over a range
    for (x in 1..5) {
        print(x)
    }

    // Or over a progression
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    println()
    inRange()

}